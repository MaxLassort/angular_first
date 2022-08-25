<%-- 
    Document   : Hour
    Created on : 7 juil. 2022, 15:54:09
    Author     : maxla
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:include page="include/header.jsp">
    <jsp:param name="title" value="Hour"/>
</jsp:include>

<!DOCTYPE html>
<html>
   
    <body>
        <h1><%= request.getAttribute("CurrentHour")%></h1>
        <c:forEach begin="1" end="30" var="count">
            <c:if test="${ count % 2 == 0}">
                <c:out value="${count}"/>
            </c:if>
        </c:forEach>
        
        
    </body>
</html>
