package br.com.fiap.principal;

import br.com.fiap.modelo.Elevador;

public class Principal {

	public static void main(String[] args) {
		Elevador e = new Elevador();
		e.inicializar(10, 20);
		e.sair();
		System.out.println(e.getAll());
		e.entrar();
		e.entrar();
		e.entrar(10);
		System.out.println(e.getAll());
	}

}
