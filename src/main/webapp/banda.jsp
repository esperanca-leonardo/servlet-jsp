<%@page import="servlet.model.Banda"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<% List<Banda> bandaList = (List<Banda>) request.getAttribute("bandaList"); %>

	<table>
		<tr>
			<th>ID</th>
			<th>NOME</th>
			<th>GENERO</th>
		</tr>
		<% for (Banda banda : bandaList) { %>
		<tr>
			<td><%= banda.getId() %></td>
			<td><%= banda.getNome() %></td>
			<td><%= banda.getGenero().getNome() %></td>
		</tr>
		<% } %>
	</table>
</body>
</html>