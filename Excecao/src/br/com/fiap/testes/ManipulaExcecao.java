package br.com.fiap.testes;

import javax.swing.JOptionPane;

import br.com.fiap.excecao.Excecao;

public class ManipulaExcecao {

	public static void main(String[] args) {
		byte churros=0;
		try{
			churros = Byte.parseByte(JOptionPane.showInputDialog
					("Numero"));
			int xpto[] = new int[2];
			//xpto[2]=30;
		}catch (Exception e){
			System.out.println(Excecao.getExcecao(e));
		}finally{
			System.out.println("O número é: " + churros);
		}
	}

}
