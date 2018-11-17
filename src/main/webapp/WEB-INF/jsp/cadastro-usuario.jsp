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
<title>Cadastro de Usuário</title>
</head>
<body>
	<center>
		<h1>${mensagem}</h1>
		<br> <br>
		<label>Digite as informações abaixo e clique em <b>"<u>Cadastrar</u>"</b> para concluir.</label>
		<br> <br>
		<form action='/index/salvar-usuario' method="post">
			<label>Usuário:</label> <br> 
			<input type="text" name="login">
			<br> <br> 
			<label>Senha:</label> <br> 
			<input type="password" name="senha">
			<br> <br>
			<button type="submit" class="btn btn-primary">Cadastrar</button>
			<button type="button" class="btn btn-outline-primary" onClick="JavaScript:window.location='index';">Voltar</button>
		</form>
		<br> <br>
	</center>
</body>
</html>