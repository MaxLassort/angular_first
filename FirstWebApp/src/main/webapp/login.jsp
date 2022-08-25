<%-- 
    Document   : authentification
    Created on : 11 juil. 2022, 14:14:37
    Author     : maxla
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    
    <body>
        
        <%--
        <jsp:useBean class="User.Utilisateur" id="user" scope="request"/>
        <jsp:setProperty name="user" property="mail"/>
        <jsp:setProperty name="user" property="password"/>
        <jsp:forward page="profile.jsp" />
        
    <jsp:useBean id="User" scope="page"  class="User.Utilisateur" scope="request" />
        <jsp:setProperty name="User" property="mail" />
        <jsp:setProperty name="User" property="passWord" />
        <jsp:forward page="profile.jsp"/>
         --%>
  
        <form action="" method="POST">
            <label for="mail">email</label>
            <input type="text" name="mail">
            <label for="password">password</label>
            <input type="text" name="password">
            <input type="submit" value="send">
        </form>
        
    </body>
</html>
