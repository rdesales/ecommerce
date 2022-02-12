<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix ="c" uri="http://java.sun.com/jsp/jstl/core"%>	
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<!DOCTYPE html> 
<html>

<head>
<meta charset ="ISO-8859-1">
<title>Shopping Cart</title>
</head>

<body>

	<h1>Shopping Cart</h1>

	<div align="center">
	<form:form action="buy" method="post" modelAttribute="cart">
		<table>
			<tr>
				<td>Product name </td>
				<td>Category </td>
				<td>Price </td>
				<td>Quantity </td>
			</tr>
			
			<c:forEach items ="${cart}" var="prod">
				<tr>
					<td>${prod.productName}</td>
					<td>${prod.category}</td>
					<td>${prod.price}</td>
					<td>${prod.producQuantity} </td>
					<td><input type="submit" value="add to cart"></td>
				</tr>
			</c:forEach>
			
			<tr>
				<td>
					<a href="viewCart?userId=${userId}"> View Cart</a>
				</td>
			</tr>
		</table>
		
	</form:form>

	</div>

</body>