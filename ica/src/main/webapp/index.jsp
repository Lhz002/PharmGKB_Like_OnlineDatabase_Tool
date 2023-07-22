<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Login-page</title>
</head>
<body>
<h1><%= "Login the mapping system" %>
</h1>
<form action="Login" method="post">
    <label for="username">Username</label>
    <input type="text" name="username" id="username">
    <br/>
    <label for="password">Password</label>
    <input type="password" name="password" id="password">
    <br/>
    <input type="submit" value="Login">
    <a href="register.jsp">Register</a>
<br/>

</form>
</body>
</html>