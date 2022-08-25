<%-- 
    Document   : CountWorldServlet
    Created on : 8 juil. 2022, 10:41:51
    Author     : maxla
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    
    <form method="GET">
      <label for="chaine">Chaine de caractere:</label>
      <input type="text" name="chaine"><br><br>
      <input type="submit" value="Submit">
    </form>
    
  
   
         
        <c:set var="mot" value="${size}" scope="page" />
        <c:out value="${mot}" /> <br>
        <!--exercice 5-->
    <form method="GET">
        <fieldset>
            <label for="num1">chiffre 1</label>
            <input type="number" name="num1"><br><br>
            <label for="num2"> chiffre 2</label>
            <input type="number" name="num2"><br><br>
            <input type="submit" value="Submit">
        </fieldset>
    </form>
        
        
        <c:if test="${num1 != null && num2 != null }">
            <c:forEach var="count" begin="${num1}" end="${num2}" >
                <c:out value="${count} "/>
                <c:out value="${num1} "/>
                <c:set var="isPremier" value="true" scope="page"/>
                <c:forEach var="i" begin="2" end="${count-1}" >
                    <c:if test="${count % i == 0}" >
                        <c:set var="isPremier" value="false"/>
                    </c:if>
                </c:forEach>

                <c:out value="${isPremier ? 'est premier ': 'n est pas premier'}"/><br>
            </c:forEach>
        </c:if>
        
            
            
            
            
            
            
       <!--exercice 3-->
       <!-- <c:forEach var="count" begin="2" end="30" >
            <c:out value="${count} "/>
            <c:set var="isPremier" value="true" scope="page"/>
            <c:forEach var="i" begin="2" end="${count-1}" >
                <c:if test="${count % i == 0}" >
                    <c:set var="isPremier" value="false"/>
                </c:if>
            </c:forEach>
            <c:out value="${isPremier ? 'est premier ': 'n est pas premier'}"/><br>
        </c:forEach>
       -->
       
       
       
            <!--exercice 4-->
    <form method="GET">
      <label for="nombre">Entrez un nombre :</label>
      <input type="text" name="nombre"><br><br>
      <input type="submit" value="Submit">
    </form>
            
    <c:set var="number" value="${isPrime}" scope="page" />
    <c:out value="${number}" /> <br>
        
    <!<!-- exercice factoriel -->
    
    <c:forEach begin="1" end="9" var="i" step="1">
        <c:set var="fact" value="1" />
            <c:forEach var="i2" begin="2" end="${i-1}" >
                <c:set var="fact" value="${fact*i2}" />
            </c:forEach>
            <c:out value="${i}"/> <c:out value="${fact}"/> <br>
    </c:forEach>
    
            <!-- factoriel 2 -->

     
    
       
       
        
        
        
        
        
        
        
        

        
</html>
