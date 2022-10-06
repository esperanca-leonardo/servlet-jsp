<%@page import="servlet.model.Integrante"%>
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
	<% List<Integrante> integranteList = (List<Integrante>) request.getAttribute("integranteList"); %>

	<table>
		<tr>
			<th>ID</th>
			<th>NOME</th>
			<th>Banda</th>
      <th>Genero</th>
		</tr>
		<% for(Integrante integrante : integranteList) { %>
		<tr>
			<td><%= integrante.getId() %></td>
			<td><%= integrante.getNome() %></td>
			<td><%= integrante.getBanda().getNome() %></td>
      <td><%= integrante.getBanda().getGenero().getNome() %></td>
		</tr>
		<% } %>
	</table>
</body>
</html>