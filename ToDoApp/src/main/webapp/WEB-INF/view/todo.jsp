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
            <h1>My Todos</h1>
            <table>
                <c:forEach items="${todos}" var="todo">
                    <tr>
                        <td>${todo.username}</td>
                        <td>${todo.description}</td>
                        <td>${todo.targetDate}</td>
                        <td><a href="todo/update-${todo.id}"><button>update</button></a></td>
                        <td><a href="todo/delete-${todo.id}"><button>delete</button></a></td>
                    </tr>
                </c:forEach> 
                    <tr>                
                        <a href="todo/addTodo"><button>add</button></a>
                    </tr>
            </table>
        </body>
    </html>

