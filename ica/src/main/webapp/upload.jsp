<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2023/4/17
  Time: 15:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>File Upload</title>
</head>
<body>
<form action="UploadServlet" method="post" enctype="multipart/form-data">
    <input type="file" name="file" accept=".vcf"><br><br>
    <input type="submit" value="Upload">
</form>
</body>
</html>
