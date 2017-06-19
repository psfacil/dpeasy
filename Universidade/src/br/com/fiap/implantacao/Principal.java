package br.com.fiap.implantacao;

import javax.swing.JOptionPane;

import br.com.fiap.modelos.Aluno;
import br.com.fiap.modelos.Endereco;
import br.com.fiap.modelos.Telefone;

public class Principal {

	public static void main(String[] args) {
		Aluno objAluno = new Aluno();
		System.out.println(objAluno.getNome());
		objAluno.setNome
			(JOptionPane.showInputDialog
			("Digite o nome"));
		objAluno.setCpf
			(JOptionPane.showInputDialog
			("Digite o CPF"));
		objAluno.setRm
			(Integer.parseInt
			(JOptionPane.showInputDialog
			("Digite o RM")));
		System.out.println(objAluno.getNome());
		System.out.println(objAluno.getRm());
		System.out.println(objAluno.getCpf());
		Aluno objAluno2 = new Aluno("Churros 2");
		Endereco objEndereco = new Endereco();
		objEndereco.setAll("Rua x", "3A", "12345000");
		
		Telefone objTelefone = new Telefone();
		objTelefone.setDdd(11);
		objTelefone.setNumero("996151212");
		objTelefone.setOperadora("TOM");
		
		objAluno2.setAll
			("ANA", 71234, "00000",
			objEndereco, objTelefone);
		System.out.println(objAluno2.getAll());
		
		
		
		
	}
}








