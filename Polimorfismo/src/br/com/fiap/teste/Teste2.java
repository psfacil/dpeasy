package br.com.fiap.teste;

import br.com.fiap.beans.Bacharelado;
import br.com.fiap.beans.Formacao;

public class Teste2 {

	public static void main(String[] args) {
		Formacao f = new Bacharelado();
		f.definirDuracao();
		System.out.println(f.getDuracao());
		
		
	}

}
