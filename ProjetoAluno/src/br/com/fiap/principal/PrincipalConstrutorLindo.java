package br.com.fiap.principal;

import javax.swing.JOptionPane;

import br.com.fiap.modelo.Aluno;
import br.com.fiap.modelo.Endereco;
import br.com.fiap.modelo.Telefone;

public class PrincipalConstrutorLindo {

	public static void main(String[] args) {
		Aluno objAluno = 
			new Aluno(JOptionPane.showInputDialog("Digite o nome"), Integer.parseInt(JOptionPane.showInputDialog("Digite o RM")), JOptionPane.showInputDialog("Digite o CPF"),
			new Endereco(JOptionPane.showInputDialog("Digite o Logradouro"), JOptionPane.showInputDialog("Digite o número"), JOptionPane.showInputDialog("Digite o CEP")),
			new Telefone(Integer.parseInt(JOptionPane.showInputDialog("Digite o DDD")),JOptionPane.showInputDialog("Digite o fone"),JOptionPane.showInputDialog("Digite a operadora"))
			);
		System.out.println(objAluno.getAll());
	}

}
