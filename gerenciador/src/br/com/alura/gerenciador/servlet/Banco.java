package br.com.alura.gerenciador.servlet;

import java.util.ArrayList;
import java.util.List;

public class Banco {

	private static List<Empresa> lista = new ArrayList<Empresa>();
	
	//simulando um banco de dados inicializa com 2 empresas cadastradas
	static {
		Empresa empresa = new Empresa();
		empresa.setNome("Alura");
		Empresa empresa2 = new Empresa();
		empresa2.setNome("Google");
		lista.add(empresa);
		lista.add(empresa2);
	}
	
	public void adiciona(Empresa empresa) {		
		Banco.lista.add(empresa);		
	}
	
	public List<Empresa> getEmpresas() {
		return Banco.lista;
	}

}
