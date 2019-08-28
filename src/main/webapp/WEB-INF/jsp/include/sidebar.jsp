<%--
  Created by IntelliJ IDEA.
  User: 吴湘鹏
  Date: 2019/8/19 0019
  Time: 10:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<!-- sidebar start -->
<div class="admin-sidebar am-offcanvas" id="admin-offcanvas" style="width: 18%" >
    <div class="am-offcanvas-bar admin-offcanvas-bar" >
        <ul class="am-list admin-sidebar-list" >
            <li><a href="${ctx}/chat"><img src="/static/source/img/chat.png" style="padding-right: 10px">聊天室</a></li>
            <li><a href="${ctx}/${userid}" class="am-cf"><img src="/static/source/img/info.png"style="padding-right: 10px">个人信息<span class="am-icon-star am-fr am-margin-right admin-icon-yellow"></span></a></li>
            <li><a href="${ctx}/${userid}/config"><img src="/static/source/img/setting.png"style="padding-right: 10px"> 个人设置</a></li>
            <li><a href="${ctx}/${userid}/log"><img src="/static/source/img/log.png"style="padding-right: 10px">系统日志</a></li>
            <li><a href="${ctx}/help"><img src="/static/source/img/help.png"style="padding-right: 10px"> 帮助</a></li>
            <li><a href="${ctx}/about"><img src="/static/source/img/about.png"style="padding-right: 10px"> 关于</a></li>
            <li><a href="${ctx}/user/logout"><img src="/static/source/img/out.png"style="padding-right: 10px"> 注销</a></li>
        </ul>
        <div class="am-panel am-panel-default admin-sidebar-panel" style="float: bottom;padding-top: 10px   ">
            <div class="am-panel-bd">
                <p><img src="/static/source/img/tag.png" style="padding-right: 10px">P-LinkC 聊天室精神</p>
                <p>富强、民主、文明、和谐</p>
                <p>自由、平等、公正、法治</p>
                <p>爱国、敬业、诚信、友善</p>

            </div>
        </div>
    </div>
</div>
<!-- sidebar end -->