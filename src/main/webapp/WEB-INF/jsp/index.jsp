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
<title>Página Inicial</title>
</head>
<body>
	<center>
		<h1>${mensagem}</h1>
		<br> 
		${warning}
		<br>
		<form action='/index/logar' method="get">
			<label>Usuário:</label> <br>
			<input type="text" name="login"> <br> <br>
			<label>Senha:</label> <br>
			<input type="password" name="senha"> <br> <br>
			<button type="submit" class="btn btn-primary">Logar</button>
		</form>
		<br>
		<br>
		<label>Ainda não possui cadastro? Cadastre-se <a href="/cadastro-usuario">aqui!</a></label>
	</center>
</body>
</html>