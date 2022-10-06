<%-- 
    Document   : hellworldform
    Created on : 27-Sep-2022, 7:03:01 PM
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
        <form method="post" action="hello"> <%--method posts result to url hello, 
            which initially results in a blank page after submit button is clicked--%>
            First name: <input type="text" name="firstname" value="${firstname}"><br> <%--Keeps value in there even if form submission is invalid--%>
            Last Name: <input type="text" name="lastname" value="${lastname}"><br>
            <input type="submit" value="Submit">
        </form>
    </body>
</html>
