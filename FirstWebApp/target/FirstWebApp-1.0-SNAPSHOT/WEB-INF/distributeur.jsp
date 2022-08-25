<%-- 
    Document   : distributeur
    Created on : 11 juil. 2022, 16:27:29
    Author     : maxla
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello Bitch</h1>
        

        <table>
            <thead>
                <tr>
                    <th colspan="2">Produit</th>
                </tr>
            </thead>    
            <tbody>
                <c:forEach var="value" items="${stock}" >
                    <tr>
                        <td> <c:out value="${value.getNom()}"/></td>
                        <td> <c:out value="${value.getId()}"/></td>
                    </tr>
                </c:forEach>


            </tbody>
        </table>

            <form method="GET">
                <button type="text" name="moreCredit" value="1">+1 credit</button>
                <button type="text" name="moreCredit" value="2">+2 credit</button>
                <label for="moreCredit">rentrez du credit:</label>
                <input type="number" name="moreCredit" ><br>
                <label for="entier">rentrez un id de produit:</label>
                <input type="number" name="idProduit" required=""><br><br>
                <input type="submit" value="Submit">
            </form>
        <c:if test="${produitAchete==true}">
            <p>produit acheté</p>
        </c:if>
            <p>crédit <c:out value="${credit}" /></p> 
            
            <c:if test="${erroeException}">
                <c:forEach var="value" items="${error}">
                    <td> <c:out value="${value}"/></td>
                </c:forEach>
            </c:if>
</body>
</html>
