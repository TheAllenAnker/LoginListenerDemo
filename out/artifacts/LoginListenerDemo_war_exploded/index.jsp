<%--
  Created by IntelliJ IDEA.
  User: Fenyr_Allen
  Date: 2018-10-05
  Time: 10:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Login Demo</title>
</head>
<link href="./css/form.css" rel="stylesheet" type="text/css" />
<%
    boolean flag = false;
    if (request.getAttribute("flag") != null) {
        flag = (boolean) request.getAttribute("flag");
    }
%>
<script type="text/javascript">
    var flag = '<%=flag%>'
    if(flag) {
        alert("Login Status Check Failed. Please Login again.")
    }
</script>
<body>
<form action="login.jsp" method="post" class="smart-green">
    <h1>系统登录</h1>

    <label>
        <span>用户名:</span>
        <input id="username" type="text" name="username"/>
    </label>

    <label>
        <span>密码:</span>
        <input id="password" type="password" name="password"/>
    </label>

    <span>&nbsp;</span>

    <label>
        <input type="submit" class="button" value="登录"/>
    </label>
</form>
</body>
</html>
