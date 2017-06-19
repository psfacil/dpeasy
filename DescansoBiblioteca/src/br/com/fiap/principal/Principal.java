package br.com.fiap.principal;

import javax.swing.JOptionPane;

import br.com.fiap.modelos.Autor;
import br.com.fiap.modelos.Editora;
import br.com.fiap.modelos.Livro;

public class Principal {
	
	static double decimal(String msg){
		return Double.parseDouble(JOptionPane.showInputDialog(msg));
	}
	static String texto(String msg){
		return JOptionPane.showInputDialog(msg);
	}
	
	static int inteiro(String msg){
		return Integer.parseInt(JOptionPane.showInputDialog(msg));
	}
	
	static int totalCaracteres(String msg){
		return msg.length();
	}
	
	static String confNome(String msg){
		String palavra = texto(msg);
	if (totalCaracteres(palavra)<=1){
		return "Nome Desconhecido";
	}else{
		return palavra;
	}
		
	
	}
	
	
public static void main(String[] args) {
	Autor a = new Autor();
	
	a.setNome(confNome("Digite o nome"));
	System.out.println(a.getNome());
}
}









