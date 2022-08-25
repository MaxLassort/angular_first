<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">


    <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
            <title>JSP Page</title>
        </head>
        <body>
            <h1>Todo to add form</h1>
            
            <form:form method="POST" modelAttribute="todoForm">
               
                <table>
                    <tr>
                        <td><form:label path="username">Name</form:label></td>
                        <td><form:input path="username"/></td>    
                        <td><form:errors path="username"/></td>
                    </tr>
                    <tr>
                        <td><form:label path="description">Description</form:label></td>
                        <td><form:input path="description"/></td>    
                        <td><form:errors path="description"/></td>
                    </tr>
                    <tr>
                        <td><label for="targetDate">TargetDate</label></td>
                        <td><input type="date" name="targetDate" id="targetDate"></td>    
                        <td><form:errors path="targetDate"/></td>
                    </tr>
                    <tr>
                        <td>
                            <input type="submit" value="Submit"/>
                        </td>

                    </tr>
                </table>
            </form:form>
            
        </body>
    </html>

