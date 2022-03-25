<%@ page import="ConnectDao.MotoristaDao"%>
<jsp:useBean id="u" class="Model.Motorista"></jsp:useBean>
<jsp:setProperty property="*" name="u"/>

<%

	MotoristaDao.deletarMotorista(u);
	response.sendRedirect("viewMotoristaList.jsp");

%>