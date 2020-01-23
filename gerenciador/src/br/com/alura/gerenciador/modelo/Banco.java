package br.com.alura.gerenciador.modelo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Banco {

	private static List<Empresa> lista = new ArrayList<Empresa>();
	private static List<Usuario> listaUsuarios= new ArrayList<>();
	private static Integer chaveSequencial = 1;
	
	//simulando um banco de dados inicializa com 2 empresas cadastradas
	static {
		Empresa empresa = new Empresa();
		empresa.setNome("Alura");
		empresa.setId(chaveSequencial++);
		Empresa empresa2 = new Empresa();
		empresa2.setNome("Google");
		empresa2.setId(chaveSequencial++);
		lista.add(empresa);
		lista.add(empresa2);
		
		Usuario u1 = new Usuario();
	    u1.setLogin("nico");
	    u1.setSenha("12345");

	    Usuario u2 = new Usuario();
	    u2.setLogin("ana");
	    u2.setSenha("12345");

	    listaUsuarios.add(u1);
	    listaUsuarios.add(u2);
	}
	
	public void adiciona(Empresa empresa) {		
		empresa.setId(Banco.chaveSequencial++);
		Banco.lista.add(empresa);	
	}
	
	public List<Empresa> getEmpresas() {
		return Banco.lista;
	}

	public void removeEmpresa(Integer empresaId) {
		
		Iterator <Empresa> it = lista.iterator();
		
		while(it.hasNext()) {
			Empresa emp = it.next();
			if(emp.getId() == empresaId) {
				it.remove();
			}
		}		
	}
	
	public Empresa buscaEmpresaId(Integer id) {
		
		for (Empresa empresa : lista) {
			if(empresa.getId() == id) {
				return empresa;
			}
		}
		return null;		
	}

	public Usuario existeUsuario(String login, String senha) {
		
		for (Usuario user : listaUsuarios) {
			if(user.ehIgual(login, senha)) {
				return user;
			}
		}
		return null;
	}
}
