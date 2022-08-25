<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <title>Spring MVC Forn</title>
    </head>
    <body>
        <h2>Distributeur</h2>

        <table>
            <tr>
                <td>Credits</td>
                <!--<td>${credit}</td>-->    

            </tr>
            <c:forEach items="${list}" var="product">
                <tr>
                    <td>${product.name}</td>
                    <td>${product.price}</td>
                    <td>${product.quantity}</td>

                </tr>
            </c:forEach> 

            <form:form method="POST" modelAttribute="userform">
                <h2> Credit : ${balance}</h2>
                <table>
                    <tr>
                        <td><form:label path="balance">AddCredit</form:label></td>
                        <td><form:input path="balance"/></td>    
                        <td><form:errors path="balance"/></td>
                    </tr>
                    <tr>
                        <td>
                            <input type="submit" value="Submit"/>
                        </td>

                    </tr>
                </table>
            </form:form>
                

            <h2>choisir l'id d'un produit</h2>
            <form:form method="POST" action="/buy" modelAttribute="buyForm">
                <form:select path="id" items="${list}" itemValue="id" itemLabel="name"/> 
                <form:errors path="id"/>
                <input type="submit" value="Submit"/>
            </form:form>

            </body>
            </html>
