/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-08-29 05:35:55 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      if (_jspx_meth_c_005fset_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <title>WebChat | 聊天</title>\r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "include/commonfile.jsp", out, false);
      out.write("\r\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("../../static/plugins/sockjs/sockjs.js\"></script>\r\n");
      out.write("    <script src=\"../../static/source/js/Channel.js\"></script>\r\n");
      out.write("    <style type=\"text/css\">\r\n");
      out.write("        .toolbar {\r\n");
      out.write("            border: 1px solid #ccc;\r\n");
      out.write("        }\r\n");
      out.write("        .text {\r\n");
      out.write("            border: 1px solid #ccc;\r\n");
      out.write("            height: 25%;\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "include/header.jsp", out, false);
      out.write("\r\n");
      out.write("<div class=\"am-cf admin-main\">\r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "include/sidebar.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!-- content start -->\r\n");
      out.write("    <div class=\"admin-content\" >\r\n");
      out.write("        <div class=\"\" style=\"width:80%;float:left;padding-left: 20px;\">\r\n");
      out.write("            <!-- 聊天区 -->\r\n");
      out.write("            <div class=\"am-scrollable-vertical\" id=\"chat-view\" style=\"height: 63%\">\r\n");
      out.write("                <ul class=\"am-comments-list am-comments-list-flip\" id=\"chat\">\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- 输入区 -->\r\n");
      out.write("            <div class=\"am-form-group am-form\" >\r\n");
      out.write("                <textarea class=\"\"  style=\"display: none\" id=\"message\" name=\"message\"></textarea>\r\n");
      out.write("\r\n");
      out.write("                <div id=\"div1\" class=\"toolbar\">\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div id=\"div2\" class=\"text\"> <!--可使用 min-height 实现编辑区域自动增加高度-->\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <script type=\"text/javascript\" src=\"/static/source/js/wangEditor.min.js\"></script>\r\n");
      out.write("                <script type=\"text/javascript\">\r\n");
      out.write("                    var E = window.wangEditor\r\n");
      out.write("                    var editor1 = new E('#div1', '#div2')  // 两个参数也可以传入 elem 对象，class 选择器\r\n");
      out.write("                    var $text1 = $('#message')\r\n");
      out.write("                    editor1.customConfig.uploadImgServer = \"/UploadServlet\";\r\n");
      out.write("                    editor1.customConfig.onchange = function (html) {\r\n");
      out.write("                        // 监控变化，同步更新到 textarea\r\n");
      out.write("                        $text1.val(html)\r\n");
      out.write("                    }\r\n");
      out.write("                    editor1.customConfig.onfocus = function () {\r\n");
      out.write("                        editor1.txt.clear();\r\n");
      out.write("\r\n");
      out.write("                    }\r\n");
      out.write("                    editor1.create()\r\n");
      out.write("                    editor1.txt.html('<p>请输入...</p>')\r\n");
      out.write("                    // 初始化 textarea 的值\r\n");
      out.write("                    $text1.val(editor1.txt.html())\r\n");
      out.write("                </script>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <!-- 接收者 -->\r\n");
      out.write("            <div class=\"\" style=\"float: left\">\r\n");
      out.write("                <p>发送给：<span id=\"sendto\">全体成员</span><button style=\"margin-left: 5px\" class=\"am-btn am-btn-xs am-btn-danger\" onclick=\"$('#sendto').text('全体成员')\">复位</button></p>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- 按钮区 -->\r\n");
      out.write("            ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            ");
      out.write("\r\n");
      out.write("            <div style=\"float: right;padding-right: 20px\"class=\"am-btn-group am-btn-group-sm \">\r\n");
      out.write("                <button class=\"am-btn am-btn-default\" type=\"button\" onclick=\"getConnection()\"><span class=\"am-icon-plug\"></span> 连接</button>\r\n");
      out.write("                <button class=\"am-btn am-btn-default\" type=\"button\" onclick=\"closeConnection()\"><span class=\"am-icon-remove\"></span> 断开连接</button>\r\n");
      out.write("                <button class=\"am-btn am-btn-default\" type=\"button\" onclick=\"checkConnection()\"><span class=\"am-icon-bug\"></span> 检查连接</button>\r\n");
      out.write("                <button class=\"am-btn am-btn-default\" type=\"button\" onclick=\"clearConsole()\"><span class=\"am-icon-trash-o\"></span> 清屏</button>\r\n");
      out.write("                <button class=\"am-btn am-btn-success\" type=\"button\" onclick=\"sendMessage()\"><span class=\"am-icon-commenting\"></span> 发送</button>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- 列表区 -->\r\n");
      out.write("        <div class=\"am-panel am-panel-default\" style=\"float:right;width: 20%;padding: 0 10px 10px 10px\">\r\n");
      out.write("            <div class=\"am-panel-hd\">\r\n");
      out.write("                <h3 class=\"am-panel-title\">在线列表 [<span id=\"onlinenum\"></span>]</h3>\r\n");
      out.write("            </div>\r\n");
      out.write("            <ul class=\"am-list am-list-static am-list-striped\" >\r\n");
      out.write("                <li>图灵机器人 <button class=\"am-btn am-btn-xs am-btn-danger\" id=\"tuling\" data-am-button>未上线</button></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("            <ul class=\"am-list am-list-static am-list-striped\" id=\"list\">\r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- content end -->\r\n");
      out.write("</div>\r\n");
      out.write("<a href=\"#\" class=\"am-show-sm-only admin-menu\" data-am-offcanvas=\"{target: '#admin-offcanvas'}\">\r\n");
      out.write("    <span class=\"am-icon-btn am-icon-th-list\"></span>\r\n");
      out.write("</a>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "include/footer.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("    $(function () {\r\n");
      out.write("        context.init({preventDoubleContext: false});\r\n");
      out.write("        context.settings({compress: true});\r\n");
      out.write("        context.attach('#chat-view', [\r\n");
      out.write("            {header: '操作菜单',},\r\n");
      out.write("            {text: '清理', action: clearConsole},\r\n");
      out.write("            {divider: true},\r\n");
      out.write("            {\r\n");
      out.write("                text: '选项', subMenu: [\r\n");
      out.write("                    {header: '连接选项'},\r\n");
      out.write("                    {text: '检查', action: checkConnection},\r\n");
      out.write("                    {text: '连接', action: getConnection},\r\n");
      out.write("                    {text: '断开', action: closeConnection},\r\n");
      out.write("                ]\r\n");
      out.write("            },\r\n");
      out.write("            {\r\n");
      out.write("                text: '销毁菜单', action: function (e) {\r\n");
      out.write("                    e.preventDefault();\r\n");
      out.write("                    context.destroy('#chat-view');\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("        ]);\r\n");
      out.write("    });\r\n");
      out.write("    if(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${message}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\"){\r\n");
      out.write("        layer.msg('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${message}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("', {\r\n");
      out.write("            offset: 0\r\n");
      out.write("        });\r\n");
      out.write("    }\r\n");
      out.write("    if(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${error}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\"){\r\n");
      out.write("        layer.msg('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${error}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("', {\r\n");
      out.write("            offset: 0,\r\n");
      out.write("            shift: 6\r\n");
      out.write("        });\r\n");
      out.write("    }\r\n");
      out.write("    $(\"#tuling\").click(function(){\r\n");
      out.write("        var onlinenum = $(\"#onlinenum\").text();\r\n");
      out.write("        if($(this).text() == \"未上线\"){\r\n");
      out.write("            $(this).text(\"已上线\").removeClass(\"am-btn-danger\").addClass(\"am-btn-success\");\r\n");
      out.write("            showNotice(\"图灵机器人加入聊天室\");\r\n");
      out.write("            $(\"#onlinenum\").text(parseInt(onlinenum) + 1);\r\n");
      out.write("        }\r\n");
      out.write("        else{\r\n");
      out.write("            $(this).text(\"未上线\").removeClass(\"am-btn-success\").addClass(\"am-btn-danger\");\r\n");
      out.write("            showNotice(\"图灵机器人离开聊天室\");\r\n");
      out.write("            $(\"#onlinenum\").text(parseInt(onlinenum) - 1)\r\n");
      out.write("        }\r\n");
      out.write("    });\r\n");
      out.write("    var wsServer = null;\r\n");
      out.write("    var ws = null;\r\n");
      out.write("    wsServer = \"ws://\" + location.host+\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" + \"/chatServer\";\r\n");
      out.write("    ws = new WebSocket(wsServer); //创建WebSocket对象\r\n");
      out.write("    ws.onopen = function (evt) {\r\n");
      out.write("        layer.msg(\"已经建立连接\", { offset: 0});\r\n");
      out.write("    };\r\n");
      out.write("    ws.onmessage = function (evt) {\r\n");
      out.write("        analysisMessage(evt.data);  //解析后台传回的消息,并予以展示\r\n");
      out.write("    };\r\n");
      out.write("    ws.onerror = function (evt) {\r\n");
      out.write("        layer.msg(\"产生异常\", { offset: 0});\r\n");
      out.write("    };\r\n");
      out.write("    ws.onclose = function (evt) {\r\n");
      out.write("         layer.msg(\"已经关闭连接1\", { offset: 0});\r\n");
      out.write("    };\r\n");
      out.write("\r\n");
      out.write("    /**\r\n");
      out.write("     * 连接\r\n");
      out.write("     */\r\n");
      out.write("    function getConnection(){\r\n");
      out.write("        if(ws == null){\r\n");
      out.write("            ws = new WebSocket(wsServer); //创建WebSocket对象\r\n");
      out.write("            ws.onopen = function (evt) {\r\n");
      out.write("                layer.msg(\"成功建立连接!\", { offset: 0});\r\n");
      out.write("            };\r\n");
      out.write("            ws.onmessage = function (evt) {\r\n");
      out.write("                analysisMessage(evt.data);  //解析后台传回的消息,并予以展示\r\n");
      out.write("            };\r\n");
      out.write("            ws.onerror = function (evt) {\r\n");
      out.write("                layer.msg(\"产生异常\", { offset: 0});\r\n");
      out.write("            };\r\n");
      out.write("            ws.onclose = function (evt) {\r\n");
      out.write("                layer.msg(\"已经关闭连接2\", { offset: 0});\r\n");
      out.write("            };\r\n");
      out.write("        }else{\r\n");
      out.write("            layer.msg(\"连接已存在!\", { offset: 0, shift: 6 });\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    /**\r\n");
      out.write("     * 关闭连接\r\n");
      out.write("     */\r\n");
      out.write("    function closeConnection(){\r\n");
      out.write("        if(ws != null){\r\n");
      out.write("            ws.close();\r\n");
      out.write("            ws = null;\r\n");
      out.write("            $(\"#list\").html(\"\");    //清空在线列表\r\n");
      out.write("            layer.msg(\"已经关闭连接3\", { offset: 0});\r\n");
      out.write("        }else{\r\n");
      out.write("            layer.msg(\"未开启连接\", { offset: 0, shift: 6 });\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    /**\r\n");
      out.write("     * 检查连接\r\n");
      out.write("     */\r\n");
      out.write("    function checkConnection(){\r\n");
      out.write("        if(ws != null){\r\n");
      out.write("            layer.msg(ws.readyState == 0? \"连接异常\":\"连接正常\", { offset: 0});\r\n");
      out.write("        }else{\r\n");
      out.write("            layer.msg(\"连接未开启!\", { offset: 0, shift: 6 });\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    /**\r\n");
      out.write("     * 发送信息给后台\r\n");
      out.write("     */\r\n");
      out.write("    function sendMessage(){\r\n");
      out.write("        if(ws == null){\r\n");
      out.write("            layer.msg(\"连接未开启!\", { offset: 0, shift: 6 });\r\n");
      out.write("            return;\r\n");
      out.write("        }\r\n");
      out.write("        var message = $(\"#message\").val();\r\n");
      out.write("        var to = $(\"#sendto\").html() == \"全体成员\"? \"\": $(\"#sendto\").html();\r\n");
      out.write("        if(message == null || message == \"\"){\r\n");
      out.write("            layer.msg(\"请不要惜字如金!\", { offset: 0, shift: 6 });\r\n");
      out.write("            return;\r\n");
      out.write("        }\r\n");
      out.write("        $(\"#tuling\").text() == \"已上线\"? tuling(message):console.log(\"图灵机器人未开启\");  //检测是否加入图灵机器人\r\n");
      out.write("            var msg = JSON.stringify({\r\n");
      out.write("                message : {\r\n");
      out.write("                    content : message,\r\n");
      out.write("                    from : '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userid}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("',\r\n");
      out.write("                    to : to,      //接收人,如果没有则置空,如果有多个接收人则用,分隔\r\n");
      out.write("                    time : getDateFull()\r\n");
      out.write("                },\r\n");
      out.write("                type : \"message\"\r\n");
      out.write("            })\r\n");
      out.write("            ws.send(msg);\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    /**\r\n");
      out.write("     * 解析后台传来的消息\r\n");
      out.write("     * \"massage\" : {\r\n");
      out.write("     *              \"from\" : \"xxx\",\r\n");
      out.write("     *              \"to\" : \"xxx\",\r\n");
      out.write("     *              \"content\" : \"xxx\",\r\n");
      out.write("     *              \"time\" : \"xxxx.xx.xx\"\r\n");
      out.write("     *          },\r\n");
      out.write("     * \"type\" : {notice|message},\r\n");
      out.write("     * \"list\" : {[xx],[xx],[xx]}\r\n");
      out.write("     */\r\n");
      out.write("    function analysisMessage(message){\r\n");
      out.write("        message = JSON.parse(message);\r\n");
      out.write("        if(message.type == \"message\"){      //会话消息\r\n");
      out.write("            showChat(message.message);\r\n");
      out.write("        }\r\n");
      out.write("        if(message.type == \"notice\"){       //提示消息\r\n");
      out.write("            showNotice(message.message);\r\n");
      out.write("        }\r\n");
      out.write("        if(message.list != null && message.list != undefined){      //在线列表\r\n");
      out.write("            showOnline(message.list);\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    /**\r\n");
      out.write("     * 展示提示信息\r\n");
      out.write("     */\r\n");
      out.write("    function showNotice(notice){\r\n");
      out.write("        $(\"#chat\").append(\"<div><p class=\\\"am-text-success\\\" style=\\\"text-align:center\\\"><span class=\\\"am-icon-bell\\\"></span> \"+notice+\"</p></div>\");\r\n");
      out.write("        var chat = $(\"#chat-view\");\r\n");
      out.write("        chat.scrollTop(chat[0].scrollHeight);   //让聊天区始终滚动到最下面\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    /**\r\n");
      out.write("     * 展示会话信息\r\n");
      out.write("     */\r\n");
      out.write("    function showChat(message){\r\n");
      out.write("        var to = message.to == null || message.to == \"\"? \"全体成员\" : message.to;   //获取接收人\r\n");
      out.write("        var isSef = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userid}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("' == message.from ? \"am-comment-flip\" : \"\";   //如果是自己则显示在右边,他人信息显示在左边\r\n");
      out.write("        var html = \"<li class=\\\"am-comment \"+isSef+\" am-comment-primary\\\"><a href=\\\"#link-to-user-home\\\"><img width=\\\"48\\\" height=\\\"48\\\" class=\\\"am-comment-avatar\\\" alt=\\\"\\\" src=\\\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/\"+message.from+\"/head\\\"></a><div class=\\\"am-comment-main\\\">\\n\" +\r\n");
      out.write("            \"<header class=\\\"am-comment-hd\\\"><div class=\\\"am-comment-meta\\\">   <a class=\\\"am-comment-author\\\" href=\\\"#link-to-user\\\">\"+message.from+\"</a> 发表于<time> \"+message.time+\"</time> 发送给: \"+to+\" </div></header><div class=\\\"am-comment-bd\\\"> <p>\"+message.content+\"</p></div></div></li>\";\r\n");
      out.write("        $(\"#chat\").append(html);\r\n");
      out.write("        $(\"#div2\").val(\"\");  //清空输入区\r\n");
      out.write("        var chat = $(\"#chat-view\");\r\n");
      out.write("        chat.scrollTop(chat[0].scrollHeight);   //让聊天区始终滚动到最下面\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    /**\r\n");
      out.write("     * 展示在线列表\r\n");
      out.write("     */\r\n");
      out.write("    function showOnline(list){\r\n");
      out.write("        $(\"#list\").html(\"\");    //清空在线列表\r\n");
      out.write("        $.each(list, function(index, item){     //添加私聊按钮\r\n");
      out.write("            var li = \"<li>\"+item+\"</li>\";\r\n");
      out.write("            if('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userid}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("' != item){    //排除自己\r\n");
      out.write("                li = \"<li>\"+item+\" <button type=\\\"button\\\" class=\\\"am-btn am-btn-xs am-btn-primary am-round\\\" onclick=\\\"addChat('\"+item+\"');\\\"><span class=\\\"am-icon-phone\\\"><span> 私聊</button></li>\";\r\n");
      out.write("            }\r\n");
      out.write("            $(\"#list\").append(li);\r\n");
      out.write("        });\r\n");
      out.write("        $(\"#onlinenum\").text($(\"#list li\").length);     //获取在线人数\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    /**\r\n");
      out.write("     * 图灵机器人\r\n");
      out.write("     * @param message\r\n");
      out.write("     */\r\n");
      out.write("    function tuling(message){\r\n");
      out.write("        var html;\r\n");
      out.write("        $.getJSON(\"http://www.tuling123.com/openapi/api?key=6ad8b4d96861f17d68270216c880d5e3&info=\" + message,function(data){\r\n");
      out.write("            if(data.code == 100000){\r\n");
      out.write("                html = \"<li class=\\\"am-comment am-comment-primary\\\"><a href=\\\"#link-to-user-home\\\"><img width=\\\"48\\\" height=\\\"48\\\" class=\\\"am-comment-avatar\\\" alt=\\\"\\\" src=\\\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/static/source/img/robot.jpg\\\"></a><div class=\\\"am-comment-main\\\">\\n\" +\r\n");
      out.write("                    \"<header class=\\\"am-comment-hd\\\"><div class=\\\"am-comment-meta\\\">   <a class=\\\"am-comment-author\\\" href=\\\"#link-to-user\\\">阿图：）</a> 发表于<time> \"+getDateFull()+\"</time> 发送给: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userid}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</div></header><div class=\\\"am-comment-bd\\\"> <p>\"+data.text+\"</p></div></div></li>\";\r\n");
      out.write("            }\r\n");
      out.write("            if(data.code == 200000){\r\n");
      out.write("                html = \"<li class=\\\"am-comment am-comment-primary\\\"><a href=\\\"#link-to-user-home\\\"><img width=\\\"48\\\" height=\\\"48\\\" class=\\\"am-comment-avatar\\\" alt=\\\"\\\" src=\\\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/static/img/robot.jpg\\\"></a><div class=\\\"am-comment-main\\\">\\n\" +\r\n");
      out.write("                    \"<header class=\\\"am-comment-hd\\\"><div class=\\\"am-comment-meta\\\">   <a class=\\\"am-comment-author\\\" href=\\\"#link-to-user\\\">Robot</a> 发表于<time> \"+getDateFull()+\"</time> 发送给: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userid}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</div></header><div class=\\\"am-comment-bd\\\"> <p>\"+data.text+\"</p><a href=\\\"\"+data.url+\"\\\" target=\\\"_blank\\\">\"+data.url+\"</a></div></div></li>\";\r\n");
      out.write("            }\r\n");
      out.write("            $(\"#chat\").append(html);\r\n");
      out.write("            var chat = $(\"#chat-view\");\r\n");
      out.write("            chat.scrollTop(chat[0].scrollHeight);\r\n");
      out.write("            $(\"#message\").val(\"\");  //清空输入区\r\n");
      out.write("        });\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    /**\r\n");
      out.write("     * 添加接收人\r\n");
      out.write("     */\r\n");
      out.write("    function addChat(user){\r\n");
      out.write("        var sendto = $(\"#sendto\");\r\n");
      out.write("        var receive = sendto.text() == \"全体成员\" ? \"\" : sendto.text() + \",\";\r\n");
      out.write("        if(receive.indexOf(user) == -1){    //排除重复\r\n");
      out.write("            sendto.text(receive + user);\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    /**\r\n");
      out.write("     * 清空聊天区\r\n");
      out.write("     */\r\n");
      out.write("    function clearConsole(){\r\n");
      out.write("        $(\"#chat\").html(\"\");\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    function appendZero(s){return (\"00\"+ s).substr((s+\"\").length);}  //补0函数\r\n");
      out.write("\r\n");
      out.write("    function getDateFull(){\r\n");
      out.write("        var date = new Date();\r\n");
      out.write("        var currentdate = date.getFullYear() + \"-\" + appendZero(date.getMonth() + 1) + \"-\" + appendZero(date.getDate()) + \" \" + appendZero(date.getHours()) + \":\" + appendZero(date.getMinutes()) + \":\" + appendZero(date.getSeconds());\r\n");
      out.write("        return currentdate;\r\n");
      out.write("    }\r\n");
      out.write("</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fset_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fset_005f0.setParent(null);
    // /WEB-INF/jsp/index.jsp(10,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setVar("ctx");
    // /WEB-INF/jsp/index.jsp(10,0) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setValue(new org.apache.jasper.el.JspValueExpression("/WEB-INF/jsp/index.jsp(10,0) '${pageContext.request.contextPath}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${pageContext.request.contextPath}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
    if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
    return false;
  }
}
