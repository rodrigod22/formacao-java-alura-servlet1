 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
  <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%> 
 <c:url value="/alteraEmpresa" var="linkForm"/> 
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<fmt:formatDate value="${empresa.dataAbertura}" var="data"/>
	<form method="post" action="${linkForm}">
		<label for="nome">Nome</label>		
		<input type="text" name="nome" id="nome" value="${empresa.nome }">		
		<label for="dataAbertura">Data Abertura</label>	
		<input type="text" name="dataAbertura" id="dataAbertura" value="${data}" >	
		
		<input type="hidden" name="id" value="${empresa.id }">		
		<input type="submit" value="Cadastrar">
	</form>
</body>
</html>