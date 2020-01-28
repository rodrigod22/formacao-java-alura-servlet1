<%@page import="java.io.PrintWriter"%>
<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%> 
 <%@ page import="java.util.List,br.com.alura.gerenciador.modelo.Empresa" %>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>   	
 <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>   	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<c:import url="logout-parcial.jsp"/>

	Usuario Logado : ${ usuarioLogado.login }
<br>
	<c:if test="${not empty empresa }">
		Empresa ${ empresa } cadastrada com sucesso !
	</c:if>
	
	  Lista de empresas: <br />
    <ul>
    	<c:forEach var="empresa" items="${empresas}">
    	<fmt:formatDate value="${empresa.dataAbertura }" var="dataAbertura" pattern="dd/MM/yyyy"/>
    		<li>
    		 ${ empresa.nome } - ${ dataAbertura }
    		   <a href="/gerenciador/entrada?id=${empresa.id}&acao=AlteraEmpresa">altera</a>
    		  <a href="/gerenciador/entrada?id=${empresa.id}&acao=RemoveEmpresa">remove</a>
    		 </li>
    	</c:forEach> 
    </ul>
</body>
</html>