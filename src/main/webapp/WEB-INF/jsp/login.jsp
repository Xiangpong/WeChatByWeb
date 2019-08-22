<%--
  Created by IntelliJ IDEA.
  User: 吴湘鹏
  Date: 2019/8/20 0020
  Time: 10:31
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%String path = request.getContextPath();%>
<!DOCTYPE html>
<html>
<head>
    <title> WeChatByWeb | 登陆</title>
    <link href="<%=path%>/static/source/css/login.css" rel='stylesheet' type='text/css' />
    <script src="<%=path%>/static/plugins/jquery/jquery-2.1.4.min.js"></script>
    <script src="<%=path%>/static/plugins/layer/layer.js"></script>
</head>
<body>

<h1>WeChatByWeb</h1>
<div class="login-form" id="loginDiv">
    <div class="clear"> </div>
    <div class="avtar"><img src="<%=path%>/static/source/img/avtar.png" /></div>
    <form id="login-form" action="<%=path%>/user/login" method="post" onsubmit="return checkLoginForm()">
        <div class="key">
            <input type="text" id="username" name="userid" placeholder="请输入账号" >
        </div>

        <div class="key">
            <input type="password" id="password" name="password" placeholder="请输入密码">
        </div>

        <div style="margin-bottom: 20px;float: right;padding-right: 20px;font-size: 18px">
            <a style="color: #e0bacb" id="res" onclick="toRegister()">还没帐号？请注册</a>
        </div>
        <div class="signin">
            <input type="submit" id="submit" value="登录" >
        </div>
    </form>
</div>

<div class="register-form" style="display: none" id="registerDiv">
    <div class="clear"> </div>
    <div class="avtar"><img src="<%=path%>/static/source/img/avtar.png" /></div>
    <form id="register-form" action="<%=path%>/user/register" method="post" onsubmit="return checkRegForm()">
        <div class="key">
            <input type="text" id="New_username" name="userid" placeholder="请输入账号" >
        </div>
        <div class="key">
            <input type="password" id="New_password" style="margin-bottom: 0px" name="password" placeholder="请输入密码">
        </div>
        <div class="key">
            <input type="password" id="Rel_password" name="password1" placeholder="请确认密码">
        </div>

        <div style="margin-bottom: 20px;float: right;padding-right: 20px;font-size: 18px">
            <a href="" style="color: #e0bacb">已有帐号？请登录</a>
        </div>
        <div class="signin">
            <input type="submit" id="register" value="注册" >
        </div>
    </form>
</div>

<script>
    $(function(){
        <c:if test="${not empty param.timeout}">
        layer.msg('连接超时,请重新登陆!', {
            offset: 0,
            shift: 6
        });
        </c:if>

        if("${error}"){
            $('#submit').attr('value',"${error}").css('background','red');
        }

        if("${message}"){
            layer.msg('${message}', {
                offset: 0,
            });
        }


        $('#username,#password').change(function(){
            $('#submit').attr('value','登录').css('background','#3ea751');
        });
    });

    /**
     * check the login form before user login.
     * @returns {boolean}
     */
    function checkLoginForm(){
        var username = $('#username').val();
        var password = $('#password').val();
        if(isNull(username) && isNull(password)){
            $('#submit').attr('value','请输入账号和密码!!!').css('background','red');
            return false;
        }
        if(isNull(username)){
            $('#submit').attr('value','请输入账号!!!').css('background','red');
            return false;
        }
        if(isNull(password)){
            $('#submit').attr('value','请输入密码!!!').css('background','red');
            return false;
        }
        //if(username != 'Amaya' || password != '123456'){
        //	$('#submit').attr('value','账号或密码错误!!!').css('background','red');
        //	return false;
        //}
        else{
            $('#submit').attr('value','Logining~');
            return true;
        }
    }

    function checkRegForm(){


        var username = $('#New_username').val();
        var psaaword1 = $('#New_password').val();
        var password2 = $('#Rel_password').val();
        if(isNull(username) && isNull(psaaword1)){
            $('#register').attr('value','请输入账号和密码!!!').css('background','red');
            return false;
        }
        if(isNull(username)){
            $('#register').attr('value','请输入账号!!!').css('background','red');
            return false;
        }
        if(isNull(psaaword1)){
            $('#register').attr('value','请输入密码!!!').css('background','red');
            return false;
        }
        if ((psaaword1).equals(password2)){
            $('#register').attr('value','两次密码不一致!!!').css('background','red');
            return false;
        }
        //if(username != 'Amaya' || password != '123456'){
        //	$('#submit').attr('value','账号或密码错误!!!').css('background','red');
        //	return false;
        //}
        else{
            $('#register').attr('value','register~');
            return true;
        }
    }

    /**
     * check the param if it's null or '' or undefined
     * @param input
     * @returns {boolean}
     */
    function isNull(input){
        if(input == null || input == '' || input == undefined){
            return true;
        }
        else{
            return false;
        }
    }

    function toRegister() {
        $("#res").click(function () {

            $("#loginDiv").attr("style","display:none")
            $("#registerDiv").attr("style","display:block")
        })
    }
</script>
</body>
</html>