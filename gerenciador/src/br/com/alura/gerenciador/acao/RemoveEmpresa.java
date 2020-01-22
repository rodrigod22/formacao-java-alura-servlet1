package br.com.alura.gerenciador.acao;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.modelo.Banco;

public class RemoveEmpresa {

	public void executa(HttpServletRequest request, HttpServletResponse response) throws IOException {		
		System.out.println("Removendo Empresa");

		String empresa = (String) request.getParameter("id");
		Integer empresaId = Integer.parseInt(empresa);
	
		Banco banco = new Banco();
		banco.removeEmpresa(empresaId);
		
		response.sendRedirect("entrada?acao=ListaEmpresas");
	}
}
