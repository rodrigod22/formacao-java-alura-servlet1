 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
 <c:url value="/entrada?acao=NovaEmpresa" var="linkForm"/> 
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:import url="logout-parcial.jsp"/>

	<form method="post" action="${linkForm}">
		<label for="nome">Nome</label>		
		<input type="text" name="nome" id="nome">	
		
		<label for="dataAbertura">Data Abertura</label>	
		<input type="text" name="dataAbertura" id="dataAbertura">	
		
		<input type="hidden" name="acao" value="NovaEmpresa">	
		<input type="submit" value="Cadastrar">
	</form>
</body>
</html>