package br.com.fiap.implantacao;

import br.com.fiap.modelos.Aluno;
import br.com.fiap.modelos.Endereco;
import br.com.fiap.modelos.Telefone;

public class PrincipalMedio {

	public static void main(String[] args) {
		Endereco e = new Endereco(
				"Av Paulista", 
				"1109", 
				"00000-001");
		Telefone t = new Telefone(
				11, 
				"996151212", 
				"Tchau"
				);
		Aluno a = new Aluno(
				"Braufagélio", 
				77000, 
				"123456789-00", 
				e, 
				t);
		System.out.println(a.getAll());

	}

}
