/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-08-21 03:18:02 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
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
String path = request.getContextPath();
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <title> WeChatByWeb | 登陆</title>\r\n");
      out.write("    <link href=\"");
      out.print(path);
      out.write("/static/source/css/login.css\" rel='stylesheet' type='text/css' />\r\n");
      out.write("    <script src=\"");
      out.print(path);
      out.write("/static/plugins/jquery/jquery-2.1.4.min.js\"></script>\r\n");
      out.write("    <script src=\"");
      out.print(path);
      out.write("/static/plugins/layer/layer.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<h1>WeChatByWeb</h1>\r\n");
      out.write("<div class=\"login-form\">\r\n");
      out.write("    <div class=\"clear\"> </div>\r\n");
      out.write("    <div class=\"avtar\"><img src=\"");
      out.print(path);
      out.write("/static/source/img/avtar.png\" /></div>\r\n");
      out.write("    <form id=\"login-form\" action=\"");
      out.print(path);
      out.write("/user/login\" method=\"post\" onsubmit=\"return checkLoginForm()\">\r\n");
      out.write("        <div class=\"key\">\r\n");
      out.write("            <input type=\"text\" id=\"username\" name=\"userid\" placeholder=\"请输入账号\" >\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"key\">\r\n");
      out.write("            <input type=\"password\" id=\"password\" name=\"password\" placeholder=\"请输入密码\">\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"signin\">\r\n");
      out.write("            <input type=\"submit\" id=\"submit\" value=\"Login\" >\r\n");
      out.write("        </div>\r\n");
      out.write("    </form>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("    $(function(){\r\n");
      out.write("        ");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("        if(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${error}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\"){\r\n");
      out.write("            $('#submit').attr('value',\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${error}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\").css('background','red');\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        if(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${message}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\"){\r\n");
      out.write("            layer.msg('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${message}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("', {\r\n");
      out.write("                offset: 0,\r\n");
      out.write("            });\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        $('.close').on('click', function(c){\r\n");
      out.write("            $('.login-form').fadeOut('slow', function(c){\r\n");
      out.write("                $('.login-form').remove();\r\n");
      out.write("            });\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("        $('#username,#password').change(function(){\r\n");
      out.write("            $('#submit').attr('value','Login').css('background','#3ea751');\r\n");
      out.write("        });\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("    /**\r\n");
      out.write("     * check the login form before user login.\r\n");
      out.write("     * @returns {boolean}\r\n");
      out.write("     */\r\n");
      out.write("    function checkLoginForm(){\r\n");
      out.write("        var username = $('#username').val();\r\n");
      out.write("        var password = $('#password').val();\r\n");
      out.write("        if(isNull(username) && isNull(password)){\r\n");
      out.write("            $('#submit').attr('value','请输入账号和密码!!!').css('background','red');\r\n");
      out.write("            return false;\r\n");
      out.write("        }\r\n");
      out.write("        if(isNull(username)){\r\n");
      out.write("            $('#submit').attr('value','请输入账号!!!').css('background','red');\r\n");
      out.write("            return false;\r\n");
      out.write("        }\r\n");
      out.write("        if(isNull(password)){\r\n");
      out.write("            $('#submit').attr('value','请输入密码!!!').css('background','red');\r\n");
      out.write("            return false;\r\n");
      out.write("        }\r\n");
      out.write("        //if(username != 'Amaya' || password != '123456'){\r\n");
      out.write("        //\t$('#submit').attr('value','账号或密码错误!!!').css('background','red');\r\n");
      out.write("        //\treturn false;\r\n");
      out.write("        //}\r\n");
      out.write("        else{\r\n");
      out.write("            $('#submit').attr('value','Logining~');\r\n");
      out.write("            return true;\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    /**\r\n");
      out.write("     * check the param if it's null or '' or undefined\r\n");
      out.write("     * @param input\r\n");
      out.write("     * @returns {boolean}\r\n");
      out.write("     */\r\n");
      out.write("    function isNull(input){\r\n");
      out.write("        if(input == null || input == '' || input == undefined){\r\n");
      out.write("            return true;\r\n");
      out.write("        }\r\n");
      out.write("        else{\r\n");
      out.write("            return false;\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f0.setParent(null);
    // /WEB-INF/jsp/login.jsp(41,8) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not empty param.timeout}", java.lang.Boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("        layer.msg('连接超时,请重新登陆!', {\r\n");
        out.write("            offset: 0,\r\n");
        out.write("            shift: 6\r\n");
        out.write("        });\r\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
    return false;
  }
}
