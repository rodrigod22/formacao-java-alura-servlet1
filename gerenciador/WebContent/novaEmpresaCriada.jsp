<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
    <%
    	String nome = (String) request.getAttribute("empresa");

    %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  Empresa <%= nome  %> cadastrada com sucesso !
</body>
</html>