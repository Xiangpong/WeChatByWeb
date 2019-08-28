package com.pong.WeChatByWeb.Utils;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.UUID;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pong.WeChatByWeb.Pojo.ResultUtil;
import com.pong.WeChatByWeb.Pojo.Result;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import com.alibaba.fastjson.JSON;



public class wangEditorUpload extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String savePath = this.getServletContext().getRealPath("/upload");
        savePath = savePath.replace("\\", "\\\\");
        File file = new File(savePath);
        //判断上传文件的保存目录是否存在
        if(!file.exists()){
            //目录不存在需要创建目录
            file.mkdir();
        }
        //上传提示消息
        String message="";
        try{
            //使用apache文件上传组件处理文件上传步骤
            //1、创建一个DiskFileItemFactory工厂
            DiskFileItemFactory factory = new DiskFileItemFactory();
            //2、创建一个文件上传解析器
            ServletFileUpload upload = new ServletFileUpload(factory);
            //解决上传文件名的中文乱码
            upload.setHeaderEncoding("UTF-8");
            //4、使用ServletFileUpload解析器上传数据，解析结果返回的是一个List<FileItem>集合
            //	每一个FileItem对应一个Form表单的输入项
            List<FileItem> list = upload.parseRequest(request);
            for(FileItem item : list) {
                String filename = item.getName();
                System.out.println(filename);
                if(filename == null || filename.trim().equals("")){
                    continue;
                }
                filename = filename.substring(filename.lastIndexOf(".")+1);
                //给文件重新取一个名字UUID
                filename = UUID.randomUUID().toString()+"."+filename;
                //获取item中的上传文件的输入流
                InputStream in = item.getInputStream();
                //创建一个文件输出流
                FileOutputStream out = new FileOutputStream(savePath + "\\" + filename);
                //创建一个缓冲区
                byte[] buffer = new byte[1024];
                //判断输入流中的数据是否已经读完的标识
                int len = 0;
                //循环将输入流读入到缓冲区当中，
                while((len = in.read(buffer)) > 0) {
                    //使用FileOutputStream输入流将缓冲区的数据写入到指定的目录(savePath + "\\" +filename)
                    out.write(buffer,0,len);
                }
                //这三句代码之及其重要的，就是为了返回JSON数据做准备的
                String [] str = {request.getContextPath() + "/upload/" + filename};
                Result result = ResultUtil.success(str);
                response.getWriter().write(JSON.toJSONString(result));//返回url地址





                //关闭流
                in.close();
                out.close();
                //删除处理文件上传时生成的临时文件
                item.delete();
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
