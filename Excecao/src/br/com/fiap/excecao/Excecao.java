package br.com.fiap.excecao;

import javax.swing.JOptionPane;

public class Excecao extends Exception{

	public Excecao(){
		JOptionPane.showMessageDialog(null,"Ocorreu um erro!!!");
	}
	
	public Excecao(Exception e){
		if (e.getClass().getName().
				equals("java.lang.NumberFormatException")){
			System.out.println("Número inválido");
		}else if(e.getClass().getName().
				equals("java.lang.ArrayIndexOutOfBoundsException")){
			System.out.println("Limite excedido no vetor");
		}else{
			e.printStackTrace();
		}
	}
	
	public Excecao(Exception e, String s){
		System.out.println(s);
		e.printStackTrace();
	}
	
	public static String getExcecao(Exception e){
		if (e.getClass().getName().
				equals("java.lang.NumberFormatException")){
			return "Número inválido";
		}else if(e.getClass().getName().
				equals("java.lang.ArrayIndexOutOfBoundsException")){
			return "Limite excedido no vetor";
		}else{
			return "Ocorreu um erro desconhecido";
		}
		
	}
	
	
	
}












