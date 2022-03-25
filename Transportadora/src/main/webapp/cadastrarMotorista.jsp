<%@ page import="ConnectDao.MotoristaDao"%>
<jsp:useBean id="u" class="Model.Motorista"></jsp:useBean>
<jsp:setProperty property="*" name="u"/>

<%

	int i = MotoristaDao.cadastrarMotorista(u);
	if(i > 0){
		response.sendRedirect("Home.jsp");
	}

%>