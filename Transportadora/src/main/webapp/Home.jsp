<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Transportadora</title>
</head>
<body style="background-color: #f2f2f2">

	<%@ page import="ConnectDao.MotoristaDao, Model.Motorista.*, java.util.*" %>
	
	<div class="Principal" style="background-color: white; border-radius: 20px; padding: 6%;
		margin: 40px 450px; display: flex; justify-content: center; align-items: center; flex-direction: column;
		">
		<h1 style="text-align: center;">Transportadora</h1>
		
		<a style="box-shadow: 0 12px 16px 0 rgba(0,0,0,0.24), 0 3px 30px 0 rgba(0,0,0,0.19); 
		padding: 17px; color: white; background-color: #006DFF; font-weight: bold; 
		text-decoration: none; margin: 10px 0px;border-radius: 20px; "href = "viewMotoristaCad.jsp">Cadastrar Motorista</a>
		
		<a style="box-shadow: 0 12px 16px 0 rgba(0,0,0,0.24), 0 3px 30px 0 rgba(0,0,0,0.19); 
		padding: 17px; color: white; background-color: #006DFF; font-weight: bold; 
		text-decoration: none; margin: 10px 0px;border-radius: 20px; "href = "viewMotoristaList.jsp">Listar Motoristas</a>
	</div>
</body>
</html>