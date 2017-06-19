package br.com.fiap.principal;

import br.com.fiap.modelo.Aluno;
import br.com.fiap.modelo.Endereco;
import br.com.fiap.modelo.Telefone;

public class PrincipalConstrutor {

	public static void main(String[] args) {
		Endereco objEndereco = 
				new Endereco("logr", "num", "cep");
		Telefone objTelefone = 
				new Telefone(11,"12345","Morto");
		Aluno objAluno = 
				new Aluno("ANA",77712, 
				"1235", objEndereco, objTelefone);
		
		System.out.println(objAluno.getAll());

	}

}
