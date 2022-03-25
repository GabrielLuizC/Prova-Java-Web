<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Editar Motorista</title>
</head>
<body>
	<%@ page import="ConnectDao.MotoristaDao, Model.Motorista"%>
	
	<%
	
		String idMotorista = request.getParameter("idMotorista");
		Motorista motorista = MotoristaDao.getEditId(Integer.parseInt(idMotorista));
	
	%>
	
	<h1 style="text-align: center;">Editar Motorista</h1>
	
	<form action="editarMotorista.jsp" method="post">
		<input type="hidden" name="idMotorista" value="<%=motorista.getIdMotorista()%>"/>
		<table>
		        <tr>
		            <td>Nome: </td>
		            <td><input type="text" name="nome" value="<%=motorista.getNome()%>"/></td>
		        </tr>
		        <tr>
		            <td>Cpf: </td>
		            <td><input type="text" name="cpf" value="<%=motorista.getCpf()%>"/></td>
		        </tr>
		        <tr>
		            <td>Telefone: </td>
		            <td><input type="text" name="telefone" value="<%=motorista.getTelefone()%>"/></td>
		        </tr>
		        <tr>
		            <td>dataNascimento: </td>
		            <td><input type="text" name="dataNascimento" value="<%=motorista.getDataNascimento()%>"/></td>
		        </tr>
		        <tr>
		            <td>Endereco: </td>
		            <td><input type="text" name="endereco" value="<%=motorista.getEndereco()%>"/></td>
		        </tr>
		        <tr>
		            <td>Porcentagem Comissao: </td>
		            <td><input type="text" name="porcComissao" value="<%=motorista.getPorcComissao()%>"/></td>
		        </tr>
		        
		        <tr>
		            <td>Observacao: </td>
		            <td><input type="text" name="observacao" value="<%=motorista.getObservacao()%>"/></td>
		        </tr>
		
		        <tr>
		      		<td colspan="2"> <input type="submit" value="Editar"/> </td>
		        </tr>
		    </table>
</form>
	
</body>
</html>