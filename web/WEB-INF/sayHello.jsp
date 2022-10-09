<%-- 
    Document   : sayHello
    Created on : 29-Sep-2022, 10:35:33 AM
    Author     : muham
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Hello World</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <h2>Hello ${person.firstname} ${person.lastname}</h2> <%--Using expression language to display the first and lastname submitted by the user--%>
        <%--Uses object name, followed by attribute (first and last name)--%>
    </body>
</html>
