<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
<title>Edição de Produto</title>
</head>
<body>
	<center>
	<h1>Edição de Produto</h1>
	<br> 
	<br> 
	
	<form action='/index/atualizar' method='post'>
		<input type='hidden' id='id' name='id' value="${produto.id}">
		<label>Descrição:</label> <br>
		<input type="text" name="descricao" value="${produto.descricao}"> <br> <br>
		<label>Preço:</label> <br>
		<input type="text" name="preco" value="${produto.preco}"> <br> <br>
		<label>Quantidade:</label> <br>
		<input type="text" name="quantidade" value="${produto.quantidade}"><br> <br>
		<button type="submit" class="btn btn-primary">Atualizar</button>
		<button type="button" class="btn btn-outline-primary" onClick="JavaScript:window.location='dashboard';">Voltar</button>
	</form>
</center>
</body>
</html>