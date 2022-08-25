<%-- 
    Document   : firstPage
    Created on : 7 juil. 2022, 13:50:40
    Author     : maxla
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:include page="include/header.jsp">
    <jsp:param name="title" value="firstPage"/>
</jsp:include>
<!DOCTYPE html>
<html>
    
    <body>
        <h1>Ceci est ma première page JSP</h1>
        <p> Bonjour <%= request.getParameter("name") %></p>
    </body>
</html>
