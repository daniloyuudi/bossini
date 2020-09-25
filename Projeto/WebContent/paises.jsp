<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<link href="css/style.css" rel="stylesheet">
<meta charset="UTF-8">
<title>País</title>
</head>
<body>
	<table>
		<thead>
			<tr>
				<td>Nome</td>
				<td>População</td>
				<td>Área</td>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="pais" items="${paises}">
				<tr>
					<td>${pais.nome}</td>
					<td>${pais.populacao}</td>
					<td>${pais.area}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<a href="cadastrar_pais.html">Cadastrar Novo Pais</a>
</body>
</html>