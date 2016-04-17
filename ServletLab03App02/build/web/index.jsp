<%-- 
    Document   : index
    Created on : Mar 4, 2015, 1:37:13 PM
    Author     : Karim
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="sql"  uri="http://java.sun.com/jsp/jstl/sql"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <sql:setDataSource var="myconn" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost/chatdb" user="root" password="root"/>
        <sql:query dataSource="${myconn}" var="result" sql="select email,passwd from users"/>
            <table>
                <c:forEach items="${result.rows}" var="row">
                    <tr>
                        <td><c:out value="${row.email}"/></td>
                        <td><c:out value="${row.passwd}"/></td>
                    </tr> 
                </c:forEach>
                           
                
            </table>
    </body>
</html>
