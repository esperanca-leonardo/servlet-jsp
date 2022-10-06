<%@page import="java.util.List"%>
<%@page import="servlet.model.Genero"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<% List<Genero> generoList = (List<Genero>) request.getAttribute("generoList"); %>
	<table>
		<tr>
			<th>ID</th>
			<th>NOME</th>
		</tr>
		<% for (Genero genero : generoList) { %>
		<tr>
			<td><%= genero.getId() %></td>
			<td><%= genero.getNome() %></td>
		</tr>
		<% } %>

	</table>
</body>
</html>