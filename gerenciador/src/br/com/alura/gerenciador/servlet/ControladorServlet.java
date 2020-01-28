package br.com.alura.gerenciador.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.alura.gerenciador.acao.Acao;

@WebServlet("/entrada")
public class ControladorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String paramAcao = request.getParameter("acao");
		
//		HttpSession sessao = request.getSession();
//		
//		boolean usuarioNaoEstaLogado = (sessao.getAttribute("usuarioLogado") == null);
//		boolean ehUmaAcaoProtegida = !(paramAcao.equals("Login") || paramAcao.equals("LoginForm"));	
//		
//		if(usuarioNaoEstaLogado && ehUmaAcaoProtegida) {
//			response.sendRedirect("entrada?acao=LoginForm");
//			return;
//			}	

		String nomeDaClasse = "br.com.alura.gerenciador.acao." + paramAcao;

		String nome = null;

		try {
			Class classe = Class.forName(nomeDaClasse);
			Acao acao = (Acao) classe.newInstance();
			nome = acao.executa(request, response);
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {

			throw new ServletException(e);
		}
		String[] tipo = nome.split(":");

		if (tipo[0].equals("forward")) {
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/" + tipo[1]);
			rd.forward(request, response);
		} else {
			response.sendRedirect(tipo[1]);
		}
		
//		String nome = null;
//		if(paramAcao.equals("ListaEmpresas")) {
//			ListaEmpresas acao = new ListaEmpresas();
//			nome = acao.executa(request, response);
//		}
//		if(paramAcao.equals("RemoveEmpresa")) {
//			RemoveEmpresa acao = new RemoveEmpresa();
//			nome = acao.executa(request, response);
//		}
//		if(paramAcao.equals("AlteraEmpresa")) {
//			AlteraEmpresa acao = new AlteraEmpresa();
//			nome = acao.executa(request, response);
//		}
//		if(paramAcao.equals("UpdateEmpresa")) {
//			UpdateEmpresa acao = new UpdateEmpresa();
//			nome =  acao.executa(request, response);
//		}
//		if(paramAcao.equals("NovaEmpresa")) {
//			NovaEmpresa acao = new NovaEmpresa();
//			nome = acao.executa(request, response);
//		}
//		if(paramAcao.equals("NovaEmpresaForm")) {
//			NovaEmpresaForm acao = new NovaEmpresaForm();
//			nome = acao.executa(request, response);
//		}		
	}
}
