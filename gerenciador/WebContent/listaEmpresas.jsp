<%@page import="java.io.PrintWriter"%>
<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%> 
 <%@ page import="java.util.List,br.com.alura.gerenciador.servlet.Empresa" %>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>   	
 <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>   	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	  Lista de empresas: <br />
    <ul>
    	<c:forEach var="empresa" items="${empresas}">
    	<fmt:formatDate value="${empresa.dataAbertura }" var="dataAbertura" pattern="dd/MM/yyyy"/>
    		<li> ${ empresa.nome } - ${ dataAbertura }</li>
    	</c:forEach> 
    </ul>
</body>
</html>