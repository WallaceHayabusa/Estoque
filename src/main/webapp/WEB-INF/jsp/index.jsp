<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Página Inicial</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css"/>
</head>
<body>
	<h1>${mensagem}</h1>
	<br> <br>
	<form action='/index/salvar' method='post'>
		<label>Descrição:</label> <br>
		<input type="text" name="descricao"> <br> <br>
		<label>Preço:</label> <br>
		<input type="text" name="preco"> <br> <br>
		<button type="submit">Enviar</button>
	</form>
</body>
</html>