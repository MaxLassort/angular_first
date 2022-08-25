<%-- 
    Document   : welcome
    Created on : 12 juil. 2022, 14:17:58
    Author     : maxla
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello Bitch!</h1>
        <p> Bonjour ${sessionScope.mail} </p>
        <p> vous êtes un ${sessionScope.role} </p>
        <a href="ServletLogout" >logout</a>
        </body>
</html>
