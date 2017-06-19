package br.com.fiap.implantacao;

import javax.swing.JOptionPane;

import br.com.fiap.modelos.Aluno;
import br.com.fiap.modelos.Endereco;
import br.com.fiap.modelos.Telefone;

public class PrincipalConan {

	public static void main(String[] args) {
		Aluno a = new Aluno(
				JOptionPane.showInputDialog("Digite o nome"),
				787877,
				"12345678900",
				new Endereco(
						"Av Paulista",
						"1234Fundos",
						"12345-123"
						),
				new Telefone(
						11,
						"1234-1234",
						"Morta"
						)
				);
		System.out.println(a.getAll());
		System.out.println(a.getEndereco().getLogradouro());
	}

}
