package br.com.fiap.principal;

import javax.swing.JOptionPane;

import br.com.fiap.modelos.CD;
import br.com.fiap.modelos.Editora;
import br.com.fiap.modelos.Fornecedor;
import br.com.fiap.modelos.Livro;
import br.com.fiap.modelos.Produto;

public class PrincipalHeranca {
	static double decimal(String msg){
		return Double.parseDouble(JOptionPane.showInputDialog(msg));
	}
	static String texto(String msg){
		return JOptionPane.showInputDialog(msg);
	}
	
	static int inteiro(String msg){
		return Integer.parseInt(JOptionPane.showInputDialog(msg));
	}
	
	public static void main(String[] args) {
		Produto objeto;
		
		if(texto("Digite L para livro ou C para CD")
				.toUpperCase().equals("L")){
			objeto = new Livro(
					inteiro("Código"), 
					texto("Descricao"), 
					decimal("Valor"), 
					new Fornecedor(
							texto("Razão Social"), 
							texto("CNPJ"), 
							texto("FONE")
							), 
					inteiro("ISBN"), 
					texto("Autor"), 
					new Editora(
							texto("Editora"), 
							texto("ED CNPJ"), 
							texto("ED FONE")
							),
					inteiro("Total Paginas"));
		}else{
			objeto = new CD(
					inteiro("Código"), 
					texto("Descrição"), 
					decimal("Valor"), 
					new Fornecedor(
							texto("Razão Social"), 
							texto("CNPJ"), 
							texto("FONE")
							), 
					texto("Artista"), 
					texto("Genero"),
					inteiro("Total Faixas")
					);
		}
		System.out.println(objeto.getAll());
		
	}
}
