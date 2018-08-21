<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<table border="1">
	<c:forEach var="cust" items="${items}">
		<tr>
			<td> ${ item.itemID }</td>
			<td> ${ item.itemName }</td>
			<td> ${ item.itemDesc }</td>
			<td> ${ item.itemQuant }</td>
			<td> ${ item.itemPrice }</td>
			<td></td>
		</tr>
	</c:forEach>
</table>


</body>
</html>