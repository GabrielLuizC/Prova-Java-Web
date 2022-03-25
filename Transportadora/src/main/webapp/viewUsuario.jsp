<%@page import="Model.Usuario"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
	<%@ page import="ConnectDao.UsuarioDao, Model.Usuario.*, java.util.*" %>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	
	<h1 style="text-align: center">Listagem de Usuarios</h1>
	
	<%
		List<Usuario> list = UsuarioDao.getAllUsuarios();
		request.setAttribute("list", list);	
	%>
	
	<table class="table" style="width:100%; border:1px solid; text-align: center;">
		<tr>
			<th>ID</th>
			<th>Usuario</th>
			<th>Senha</th>
		</tr>
		<c:forEach items="${list}" var="usuario">
			<tr>
				<td>${usuario.getIdUsuario()}</td>
				<td>${usuario.getUsuario()}</td>
				<td>${usuario.getSenha()}</td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>