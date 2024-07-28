<%@page import="bank.model.Register"%>
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
	<form action="RetriveController">
		Register Number<input type="text" name="regno"><br>
		<input type="submit" value="search">
	</form>
	
	<%List lst=null;
	Register reg=null;%>

	<%
		if(!session.isNew())
		{
			List<Register> lstreg=(List<Register>)session.getAttribute("data");
			reg=lstreg.get(0);
			out.print(reg.getRegNo()+" "+reg.getCustName()+" "+reg.getAccBalance());
		}
	%>	
	

	
</body>
</html>