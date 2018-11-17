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
<title>Cadastrar Produto</title>
</head>
<body>
<center>
	<h1>${titulo}</h1>
	<div style="width: 90%">
		<ul class="nav nav-tabs">
		  <li role="presentation"><a href="/dashboard"><b>Dashboard</b></a></li>
		  <li role="presentation" class="active"><a href="#"><b>Cadastrar Produto</b></a></li>
		  <li role="presentation"><a href="/index"><b>Logout</b></a></li>
		</ul>
	</div>
	<br> 
	<br> 
	<form action='/index/salvar' method='post'>
		<label>Descrição:</label> <br>
		<input type="text" name="descricao"> <br> <br>
		<label>Preço:</label> <br>
		<input type="text" name="preco"> <br> <br>
		<label>Quantidade:</label> <br>
		<input type="text" name="quantidade"><br> <br>
		<button type="submit" class="btn btn-primary">Cadastrar</button>
	</form>
</center>
</body>
</html>