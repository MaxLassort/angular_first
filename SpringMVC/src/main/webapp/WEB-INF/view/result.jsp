
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

    <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
            <title>Spring MVC Forn</title>
        </head>
        <body>
            <h1>Submitted Student Information</h1>
            <table>
                <tr>
                    <td>Name</td>
                    <td>${name}</td>
                </tr>
                <tr>
                    <td>Age</td>
                    <td>${age}</td>
                </tr>
                <tr>
                    <td>ID</td>
                    <td>${id}</td>
                </tr>
            </table>
        </body>
    </html>
