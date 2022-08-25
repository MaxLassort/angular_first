<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>

    <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
            <title>Spring MVC Forn</title>
        </head>
        <body>
            <h2>Student Form</h2>
            <form:form method="POST" action="/addStudent">
                <table>
                    <tr>
                        <td><form:label path="name">Name </form:label></td>
                        <td><form:input path="name"/></td>    
                    </tr>
                     <tr>
                        <td><form:label path="age">Age</form:label></td>
                        <td><form:input path="age"/></td>    
                    </tr>
                    <tr>
                        <td><form:label path="id">Id</form:label></td>
                        <td><form:input path="id"/></td>    
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

