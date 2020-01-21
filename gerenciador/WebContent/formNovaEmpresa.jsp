 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
 <c:url value="/novaEmpresa" var="linkForm"/> 
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form method="post" action="${linkForm}">
		<label for="nome">Nome</label>		
		<input type="text" name="nome" id="nome">	
		
		<label for="dataAbertura">Data Abertura</label>	
		<input type="text" name="dataAbertura" id="dataAbertura">	
		<input type="submit" value="Cadastrar">
	</form>
</body>
</html>