package br.com.fiap.principal;

import javax.swing.JOptionPane;

import br.com.fiap.modelos.Fornecedor;
import br.com.fiap.modelos.Produto;

public class Teste {

	public static void main(String[] args) {
		Produto p = new Produto(
				Integer.parseInt
				(JOptionPane.showInputDialog("Digite o código")),
				JOptionPane.showInputDialog("Digite a descricao"),
				Double.parseDouble
				(JOptionPane.showInputDialog("Digite o valor")),
				new Fornecedor(
					JOptionPane.showInputDialog("Razão Social"),
					JOptionPane.showInputDialog("CNPJ"),
					JOptionPane.showInputDialog("Fone")
				));
		System.out.println(p.getAll());
		System.out.println(p.gerarDesconto());

		System.out.println("Valor" + p.getValor());
		p.atualizarValor
			(Double.parseDouble
			(JOptionPane.showInputDialog("Digite a porcentagem")));
		System.out.println("Novo Valor: " + p.getValor());
	}

}




