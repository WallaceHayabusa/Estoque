<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
	crossorigin="anonymous">
<title>Dashboard</title>
</head>
<body>
	<center>
		<h1>
			<c:out value="${titulo}" />
		</h1>
	</center>
	<br>
	<br>
	<center>
		<table class="table table-hover" style="width: 80%">
			<thead>
				<tr>
					<th><b>Descrição</b></th>
					<th><b>Preço</b></th>
				</tr>
			</thead>
			<tbody>
			
				<c:forEach items="${produtos}" var="item">
				
					<tr>
						<td><c:out value="${item.descricao}"></c:out></td>
						<td><c:out value="${item.preco}"></c:out></td>
					</tr>
					
				</c:forEach>
				
			</tbody>
		</table>
	</center>
</body>
</html>