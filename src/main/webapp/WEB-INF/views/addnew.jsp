<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register</title>
</head>
<body>

<form action="addnewuser">
Your Name: <input type="text" name="userName"><br>
<input type="hidden" name="cID" value="${cID}">
<input type="submit" value="Add">
</form>

${ customers }

</body>
</html>