<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">


<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Welcome</h1>
        <security:authorize access="isAuthenticated()">
            <p> 
                User: <security:authentication property="principal.username"/>
                <br>
                Role(s) <security:authentication property="principal.authorities"/>
        </security:authorize>
                
        <security:authorize access="hasRole('MANAGER')">
        <p>
            <a href="/system">Teams Management</a>
        </p>
        </security:authorize>
        
        <security:authorize access="isAuthenticated()">
            <form:form action="/logout" method="POST">
                <input type="submit" value="Logout" />
            </form:form>
        </security:authorize>
             
    </body>
</html>
