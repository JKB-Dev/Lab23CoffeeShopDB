<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome</title>
</head>
<body>

<h1>WELCOME TO GRAND CIRCUS GOURMET COFFEE</h1>
<p>Please enter your name to see our products:</p>


<form action="addnewuser">
Your Name: <input type="text" name="contName"><br>
<input type="hidden" name="cID" value="${cID}">
<input type="submit" value="Add">
</form>

${users}



</body>
</html>