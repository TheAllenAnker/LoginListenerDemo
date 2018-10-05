<%--
  Created by IntelliJ IDEA.
  User: Fenyr_Allen
  Date: 2018-10-05
  Time: 10:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%
    String username = request.getParameter("username");
    String password = request.getParameter("password");

    session.setAttribute("loginUser", username);//登录完成，将登录用户名存储至session对象

    response.sendRedirect(request.getContextPath()+"/main.jsp");
%>