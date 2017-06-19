package br.com.fiap.teste;

import br.com.fiap.entrada.Magica;
import br.com.fiap.modelo.CD;
import br.com.fiap.modelo.Livro;
import br.com.fiap.modelo.Produto;

public class Teste {

	public static void main(String[] args) {
		char opcao = Magica.texto
				("Digite:\n<C> para CD ou \n <L> para Livro")
				.toUpperCase().charAt(0);
		Produto objProduto=null;
		if (opcao=='C'){
			objProduto = new CD(
					Magica.texto("Descrição"), 
					Magica.decimal("Valor"), 
					Magica.inteiro("Codigo"), 
					Magica.inteiro("Faixas"),
					Magica.texto("Artista"), 
					Magica.texto("Gravadora")
					);
		}else if (opcao=='L'){
			objProduto = new Livro(
					Magica.texto("Descrição"), 
					Magica.decimal("Valor"), 
					Magica.inteiro("Codigo"), 
					Magica.inteiro("Páginas"),
					Magica.texto("Autor"),
					Magica.texto("Editora")
					);
			
		}else{
			System.out.println("Opção inválida!!!");
		}
		System.out.println(objProduto.getAll());
		
	}
}
