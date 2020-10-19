<%--
  Created by IntelliJ IDEA.
  User: 1
  Date: 2020/10/15
  Time: 16:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String basePath = request.getScheme()
            + "://"
            + request.getServerName()
            + ":"
            + request.getServerPort()
            + request.getContextPath()
            + "/";
%>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Title</title>
    <base href="<%=basePath%>">
    <!-- Tell the browser to be responsive to screen width -->
    <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
    <!-- Bootstrap 3.3.6 -->
    <link rel="stylesheet" href="static2/bootstrap/css/bootstrap.min.css">
    <!-- Font Awesome -->
    <link rel="stylesheet" href="static2/dist/css/font-awesome.min.css">
    <!-- Ionicons -->
    <link rel="stylesheet" href="static2/dist/css/ionicons.min.css">
    <!-- Theme style -->
    <link rel="stylesheet" href="static2/dist/css/AdminLTE.min.css">

</head>
<body class="hold-transition lockscreen">
<!-- Automatic element centering -->
<div class="lockscreen-wrapper">
    <div class="lockscreen-logo">
        <a href="../../index2.html"><b>FAFU</b>后台管理系统</a>
    </div>
    <!-- User name -->
    <div style="background-color:white" >
        <div class="lockscreen-name"><br></div>
        <div class="lockscreen-name"><h3>登录系统</h3></div>
        <div class="lockscreen-name"><br></div>
        <form action="ManagerLoginServlet" method="post">
        <div class="lockscreen-name"> <label>用户名称：</label>
            <input class="itxt" type="text" placeholder="请输入用户名" autocomplete="off" tabindex="1"
                   name="nickname" id="nickname"/></div>
        <div class="lockscreen-name"><br></div>
        <div class="lockscreen-name"><label>用户密码：</label>
            <input class="itxt" type="password" placeholder="请输入密码" autocomplete="off" tabindex="1"
                   name="password" id="password"/></div>
        <div class="lockscreen-name"><br></div>

        <div class="lockscreen-name"><input type="checkbox" value="">记住下次自动登录&emsp;<input type="submit" value="登录" id="sub_btn" /></div>
            </form>
        <div class="lockscreen-name" align="left"><a href="">忘记密码</a></div>
        <div class="lockscreen-name"><br></div>
        <div class="lockscreen-name"><br></div>
    </div>


    <div class="help-block text-center">
        Enter your password to retrieve your session
    </div>
    <div class="text-center">
        <a href="login.html">Or sign in as a different user</a>
    </div>
    <div class="lockscreen-footer text-center">
        Copyright &copy; 2014-2016 <b><a href="http://almsaeedstudio.com" class="text-black">Almsaeed Studio</a></b><br>
        All rights reserved
    </div>
</div>
<!-- /.center -->

<!-- jQuery 2.2.3 -->
<script src="static2/plugins/jQuery/jquery-2.2.3.min.js"></script>
<!-- Bootstrap 3.3.6 -->
<script src="static2/bootstrap/js/bootstrap.min.js"></script>
</body>
</html>

