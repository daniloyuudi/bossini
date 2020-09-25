<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="model.Pais" %>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="utf-8">
<title>Pais</title>

<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/style.css" rel="stylesheet">

</head>
<body>
	<% Pais pais = (Pais) request.getAttribute("pais"); %>
	<div id="main" class="container">
		<h3 class="page-header">Visualizar Cliente #<%= pais.getId() %></h3>
		<div class="row">
			<div class="col-md-12">
			<p><strong>Nome</strong></p>
			<p><%= pais.getNome() %></p>
			</div>
		</div>
		<div class="row">
			<div class="col-md-6">
				<p><strong>População</strong></p>
				<p><%= pais.getPopulacao() %></p>
			</div>
			<div class="col-md-6">
				<p><strong>Área</strong></p>
				<p><%= pais.getArea() %></p>
			</div>
		</div>
		
		<div id="actions" class="row">
			<div class="col-md-12">
				<a href="index.html" class="btn btn-default">Voltar</a>
			</div>
		</div>
	</div>
	
	<script src="js/jquery.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
</body>
</html>