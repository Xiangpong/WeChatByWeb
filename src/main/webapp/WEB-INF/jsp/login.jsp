<%--
  Created by IntelliJ IDEA.
  User: 吴湘鹏
  Date: 2019/8/29 0029
  Time: 10:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%String path = request.getContextPath();%>
<!doctype html>
<html lang="en">
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <script src="<%=path%>/static/plugins/jquery/jquery-2.1.4.min.js"></script>
    <script src="<%=path%>/static/plugins/layer/layer.js"></script>

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <style>
        html,body {height: 100%;}
        body {
            -ms-flex-align: center;
            -ms-flex-pack: center;
            -webkit-box-align: center;
            align-items: center;
            -webkit-box-pack: center;
            justify-content: center;
            padding-top: 40px;
            padding-bottom: 40px;
            background-image:url(/static/source/img/background.png);}

        .form-signin {width: 100%;max-width: 330px;padding: 15px;margin: 0 auto;}
        .form-signin .checkbox {font-weight: 400;}
        .form-signin .form-control {position: relative;box-sizing: border-box;height: auto;padding: 10px;font-size: 16px;}
        .form-signin .form-control:focus {z-index: 2;}
        .form-signin input[type="text"] {margin-bottom: -1px;border-bottom-right-radius: 0;border-bottom-left-radius: 0;}
        .form-signin input[type="password"] {border-top-left-radius: 0;border-top-right-radius: 0;}

    </style>

    <title>Hello, world!</title>
</head>
<body class="text-center">
<div class="loginDiv"  id="loginDiv" style="display: block;">
    <form class="form-signin"  method="post" action="<%=path%>/user/login">
        <img class="mb-4" src="/static/source/img/avtar5.png" >
        <h1 class="h3 mb-3 font-weight-normal">登录</h1>
        <div class="key">
            <input type="text" id="username" name="userid"class="form-control"  placeholder="用户" required autofocus>
        </div>
        <div class="key">
            <input type="password" id="password" name="password"class="form-control"  placeholder="密码" required>
        </div>
        <div class="checkbox mb-3" style="margin-top: 10px;">
            <label>
                <a href="#" onclick="toRegister();return false">还没有帐号？请注册！</a>
            </label>
        </div>
        <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
    </form>
</div>

<div class="registerDiv" id="registerDiv" style="display:none">
    <form class="form-signin"action="<%=path%>/user/register" method="post"onsubmit="return checkRegForm()">
        <img class="mb-4" src="/static/source/img/avtar5.png" alt="">
        <h1 class="h3 mb-3 font-weight-normal">注册</h1>
        <div class="key">
            <input type="text" id="New_username" name="userid"class="form-control"  placeholder="用户名" required autofocus>
        </div>
        <div class="key">
            <input type="password" id="New_password" style="margin-bottom: 0px"class="form-control"  name="password" placeholder="密码"required>
        </div>

        <div class="checkbox mb-3"style="margin-top: 10px;">
            <label>
                <a id="res" onclick="toLogin();return false" href="#">已有帐号？请登录！</a>
            </label>
        </div>
        <button class="btn btn-lg btn-primary btn-block" type="submit" >Register</button>
    </form>
</div>
<p class="mt-5 mb-3 text-muted">&copy; 2019 By Pong</p><a href="https://github.com/Xiangpong"><img src="/static/source/img/github.png"></a>



<!-- Optional JavaScript -->
<!-- jQuery first, then Popper.js, then Bootstrap JS -->
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
<script>
    function toRegister() {

        $("#loginDiv").attr("style","display:none")
        $("#registerDiv").attr("style","display:block")

    }
    function toLogin() {

        $("#loginDiv").attr("style","display:block")
        $("#registerDiv").attr("style","display:none")


    }

    $(function(){
        <c:if test="${not empty param.timeout}">
        layer.msg('连接超时,请重新登陆!', {
            offset: 0,
            shift: 6
        });
        </c:if>
        if("${error}"){
            layer.msg('${error}',{
                offset: 0,
                shift: 6
            })
        }
        if("${message}"){
            layer.msg('${message}', {
                offset: 0,
            });
        }
    });

</script>
</body>
</html>
