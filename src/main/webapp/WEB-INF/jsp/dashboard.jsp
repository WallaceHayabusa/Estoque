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
		<div style="width: 90%">
			<ul class="nav nav-tabs">
			  <li role="presentation" class="active"><a href="#"><b>Dashboard</b></a></li>
			  <li role="presentation"><a href="/cadastro"><b>Cadastrar Produto</b></a></li>
			  <li role="presentation"><a href="/index"><b>Logout</b></a></li>
			  <label>Usuário logado: <c:out value='<%=request.getParameter("usuarioLogado")%>'></c:out></label>
			</ul>
		</div>
	</center>
	<br>
	<br>
	<center>
		<table class="table table-hover" style="width: 80%">
			<thead>
				<tr>
					<th><b>Descrição</b></th>
					<th><b>Preço</b></th>
					<th><b>Quantidade</b></th>
					<th><b>Editar</b></th>
					<th><b>Excluir</b></th>
				</tr>
			</thead>
			<tbody>
			
				<c:forEach items="${produtos}" var="item">
				
					<tr>
						<td><c:out value="${item.descricao}"></c:out></td>
						<td><c:out value="R$ ${item.preco}"></c:out></td>
						<td><c:out value="${item.quantidade}"></c:out></td>
						<td>
				             <a href="/editar/${item.id}">
				             	<button type="submit" class="btn btn-primary">Editar</button>
				             </a>
			            </td>
			            <td>
			           		<a href="/excluir/${item.id}">
			           			<button type="submit" class="btn btn-primary">Excluir</button>
		           			</a>
			          	</td>
					</tr>
					
				</c:forEach>
				
			</tbody>
		</table>
	</center>
</body>
</html>