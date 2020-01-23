package br.com.alura.gerenciador.acao;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.modelo.Banco;
import br.com.alura.gerenciador.modelo.Empresa;

public class AlteraEmpresa implements Acao{

	public String executa(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {		
		System.out.println("Alterando Empresa");
	
		String empresaId = (String) request.getParameter("id");
		Integer id= Integer.parseInt(empresaId);
		System.out.println(id);
		Banco banco = new Banco();
		Empresa empresa = banco.buscaEmpresaId(id);
		
		request.setAttribute("empresa", empresa);
		
		return "forward:formAlteraEmpresa.jsp";	
		
	}
	
}
