<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome</title>
</head>
<body>

<h1>WELCOME TO GRAND CIRCUS GOURMET COFFEE</h1>
<p>Please enter your name to become a customer:</p>


<form action="/addnewuser">
<!--  Customer ID#: <input type="number" name="cID"><br>  should match @RequestParam in "" -->
Your Name: <input type="text" name="user_name"><br> <!-- should match @RequestParam in "" same color -->
<input type="submit" value="Add">
</form>

<h1> ${index}</h1>

<h1> OUR FINE COFFEES, AVAILABLE BY THE POUND:</h1>

<table border="1">
	<c:forEach var="item" items="${products}"> 
		<tr>
			<td> ${ item.item_id }</td>
			<td> ${ item.name }</td>
			<td> ${ item.description }</td>
			<td> ${ item.quantity }</td>
			<td> ${ item.price }</td>
		</tr>
	</c:forEach>
</table>

</body>
</html>