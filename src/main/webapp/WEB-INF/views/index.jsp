<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 

 
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://fonts.googleapis.com/css?family=Vidaloka" rel="stylesheet">   
<link href="https://fonts.googleapis.com/css?family=Zilla+Slab" rel="stylesheet"> 
<link href="https://fonts.googleapis.com/css?family=Open+Sans" rel="stylesheet"> 

<link rel="stylesheet" type="text/css" href="src/main/resources/static/css/style.css">

<style>
	
	body {
		background-color: #f4f4f4;
		align-content: center;
		padding-left: 50px;
		padding-right: 50px;
		position: relative; 
		}
	
	p {
		font-family: 'Zilla Slab', serif;
		font-size: 24px;
		}
	
	h1 {
		font-size: 60px;
		font-family: 'Vidaloka', serif;
		color: #c0b283;
		font-style: oblique;
		}
		
	h2 {
		font-family: 'Vidaloka', serif;
		color: #383838;
		margin-bottom: -30px;
		font-weight: 20;
	}	
		
	table {
	    border-collapse: collapse;
	    width: 100%;
		}
	
	th {
		font-family: 'Zilla Slab', serif;
		font-style: bold;
		color: white;
		background-color: #383838;
		}

	th, td {
	    text-align: left;
	    padding: 8px;
	}
	
	tr:nth-child(even){
		background-color: #f2f2f2
		}
		
	form {
		font-family: 'Open Sans', sans-serif;
	}	
	
	input[type=text] {
	    padding:5px; 
	    border:2px solid #ccc; 
	    -webkit-border-radius: 5px;
	    border-radius: 5px;
		}
	
	
	input[type=submit] {
	    margin-top: 20px;
	    background-color: #c0b283;
	    border: 15px;
	    -webkit-border-radius: 5px;
	    border-radius: 5px;
	    color: white;
	    padding: 12px 32px;
	    text-align: center;
	    text-decoration: none;
	    display: inline-block;
	    font-family: 'Zilla Slab', serif;
	    font-size: 20px;
		}
			
</style>

<title>Welcome</title>
</head>
<body>

<h2>welcome to</h2>
<h1>GRAND CIRCUS GOURMET COFFEE</h1>
<p>Please enter your name below to become a customer.</p>


<form action="/addnewuser">
Your Name: <input type="text" name="user_name"><br> <!-- should match @RequestParam in "" same color -->
<input type="submit" value="Add">
</form>

<h1> ${index}</h1>

<h2> OUR FINE COFFEES, AVAILABLE BY THE POUND:</h2>

<table border="1">
	<tr>
	    <th>PLU#</th>
	    <th>Coffee</th>
	    <th>Roast</th>
	    <th>Pounds in Stock</th>
	    <th>Price per Pound</th>
	</tr>
	<c:forEach var="item" items="${products}"> 
		<tr>
			<td> ${ item.item_id }</td>
			<td> ${ item.name }</td>
			<td> ${ item.description }</td>
			<td> ${ item.quantity } lb.</td>
			<td> $ ${ item.price }</td>
		</tr>
	</c:forEach>
</table>

</body>
</html>