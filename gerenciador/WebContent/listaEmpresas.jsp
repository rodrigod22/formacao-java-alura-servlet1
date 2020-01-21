<%@page import="java.io.PrintWriter"%>
<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%> 
 <%@ page import="java.util.List,br.com.alura.gerenciador.servlet.Empresa" %>
    	
   <%
        List<Empresa> lista = (List<Empresa>)request.getAttribute("empresas");
       
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	  Lista de empresas: <br />
    <ul>
    <%
       
        for (Empresa empresa : lista) { 
    %>
        <li><%= empresa.getNome() %></li>
    <%
        }
    %>
    </ul>

</body>
</html>