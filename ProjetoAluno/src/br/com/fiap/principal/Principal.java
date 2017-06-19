package br.com.fiap.principal;

import javax.swing.JOptionPane;

import br.com.fiap.modelo.Aluno;
import br.com.fiap.modelo.Endereco;
import br.com.fiap.modelo.Telefone;

public class Principal {

	public static void main(String args[]) {
		Aluno objAluno =new Aluno();
		Endereco objEndereco =new Endereco();
		Telefone objTelefone = new Telefone();

		objAluno.setAll("Ana", 77777, "123456", 
				objEndereco,objTelefone);
		objEndereco.setAll("Rua x", "12345", "4A");
		objTelefone.setAll(11, "996151212", "TOM");

		//VOU ERRAR NA PROVA
		//System.out.println(objEndereco.getAll());
		System.out.println(objAluno.getAll());
		
		Aluno objAluno2 = new Aluno();
		objAluno2.setNome(JOptionPane.showInputDialog("Digite o nome"));
		objAluno2.setRm(
				Integer.parseInt(
				JOptionPane.showInputDialog("Digite o RM")
				));
		objAluno2.setCpf(JOptionPane.showInputDialog("Digite o cpf"));
		objAluno2.setEndereco(new Endereco());
		objAluno2.setFone(new Telefone());
		System.out.println("Do JOptionPane" + 
				objAluno2.getAll());
	}

}







