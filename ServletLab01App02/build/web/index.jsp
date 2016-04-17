<%-- 
    Document   : index
    Created on : Mar 2, 2015, 1:58:12 PM
    Author     : Karim
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%@page session="false" %>
        <jsp:include page="Pagehits" />
        <label>Visits : </label>
        <%=application.getAttribute("visit")%>
        <label>Online : </label>
        <%=application.getAttribute("online")%>
        
        <form action="login" >
            <input type="submit" value="Login"/>
        </form>
        <form action="logout" >
            <input type="submit" value="Logout"/>
        </form>
    </body>
</html>
