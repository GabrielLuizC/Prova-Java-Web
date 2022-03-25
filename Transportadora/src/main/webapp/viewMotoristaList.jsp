<%@page import="Model.Motorista"%>
<%@page import="Model.Usuario"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Motorista</title>
</head>
<body>
	<%@ page import="ConnectDao.MotoristaDao, Model.Motorista.*, java.util.*" %>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
				
		<h1 style="text-align: center;">Motorista</h1>
	
	<%
		List<Motorista> list = MotoristaDao.getAllMotoristas();
		request.setAttribute("list", list);	
	%>
	
	<table class="table" style="width:100%; border:1px solid; text-align: center; padding-top: 20px; padding-bottom: 20px;">
		<tr style="padding-top: 20px; padding-bottom: 20px;">
			<th>ID</th>
			<th>NOME</th>
			<th>CPF</th>
			<th>TELEFONE</th>
			<th>DATA NASCIMENTO</th>
			<th>ENDERECO</th>
			<th>PORC.COMISSAO</th>
			<th>OBSERVACAO</th>
		</tr>
		<c:forEach items="${list}" var="motorista">
			<tr>
				<td style="padding-top: 25px; padding-bottom: 25px;">${motorista.getIdMotorista()}</td>
				<td style="padding-top: 25px; padding-bottom: 25px;">${motorista.getNome()}</td>
				<td style="padding-top: 25px; padding-bottom: 25px;">${motorista.getCpf()}</td>
				<td style="padding-top: 25px; padding-bottom: 25px;">${motorista.getTelefone()}</td>
				<td style="padding-top: 25px; padding-bottom: 25px;">${motorista.getDataNascimento()}</td>
				<td style="padding-top: 25px; padding-bottom: 25px;">${motorista.getEndereco()}</td>
				<td style="padding-top: 20px; padding-bottom: 25px;">${motorista.getPorcComissao()}</td>
				<td style="padding-top: 20px; padding-bottom: 25px;">${motorista.getObservacao()}</td>
				<td> <a style="box-shadow: 0 12px 16px 0 rgba(0,0,0,0.24), 0 3px 30px 0 rgba(0,0,0,0.19); 
			padding: 17px; color: white; background-color: #006DFF; font-weight: bold; 
			text-decoration: none; margin: 10px 0px;border-radius: 20px;" 
			href = "deleteMotorista.jsp?idMotorista=${motorista.getIdMotorista()}">Excluir Motorista</a> </td>
			
				<td> <a style="box-shadow: 0 12px 16px 0 rgba(0,0,0,0.24), 0 3px 30px 0 rgba(0,0,0,0.19); 
			padding: 17px; color: white; background-color: #006DFF; font-weight: bold; 
			text-decoration: none; margin: 10px 0px;border-radius: 20px;" 
			href = "viewEditarMotorista.jsp?idMotorista=${motorista.getIdMotorista()}">Editar Motorista</a> </td>

	
			</tr>
		</c:forEach>
	</table>
	
	
	
</body>
</html>