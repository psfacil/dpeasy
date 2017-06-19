package br.com.fiap.principal;

import javax.swing.JOptionPane;

import br.com.fiap.modelos.Fornecedor;
import br.com.fiap.modelos.Produto;

public class TesteString {

	public static void main(String[] args) {
		String escolha = new String();
		escolha=JOptionPane.showInputDialog
				("Digite <Tudo> ou <Basico>").toUpperCase();
		Produto p = new Produto();
		if (escolha.equals("TUDO")){
			p.setAll(
					Integer.parseInt(JOptionPane.showInputDialog("Código")), 
					JOptionPane.showInputDialog("Descricao"), 
					Double.parseDouble(JOptionPane.showInputDialog("Valor")), 
					new Fornecedor(
							JOptionPane.showInputDialog("Razão Social"),
							JOptionPane.showInputDialog("CNPJ"),
							JOptionPane.showInputDialog("Telefone")
							)
					);
		}else{
			p.setBasico(
					JOptionPane.showInputDialog("Descricao"),
					Double.parseDouble(JOptionPane.showInputDialog("Valor")), 
					Integer.parseInt(JOptionPane.showInputDialog("Código"))
					);
		}

	}

}
