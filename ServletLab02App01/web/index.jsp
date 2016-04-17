<%-- 
    Document   : index
    Created on : Mar 3, 2015, 10:18:00 AM
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
        <form action="MyDownload">
            <input type="submit" value="Download"/>
        </form>
        <form method="POST" enctype="multipart/form-data" action="MyUpload">
            File to upload: <input type="file" name="uploadFile"><br/>
            <input type="submit" value="Press"> 
        </form>    
    </body>
</html>
