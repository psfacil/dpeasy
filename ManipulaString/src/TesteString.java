import javax.swing.JOptionPane;

public class TesteString {

	public static void main(String[] args) {
		char genero;
		genero = JOptionPane.showInputDialog("Digite o genero").toUpperCase().charAt(0);
		
		System.out.println(genero);
		if (genero=='M'){
			System.out.println("Masculino");
		}else if (genero=='F'){
			System.out.println("Feminino");
		}else{
			System.out.println("Genero invalido");
		}
		
		String nome = JOptionPane.showInputDialog("Digite um nome");
		
		System.out.println(nome.length());
		
		if (nome.length()>2){
			System.out.println(nome);
		}
		
		
		String email= JOptionPane.showInputDialog("Digite o email");
		
		System.out.println(email.indexOf('@'));
		
		if(email.indexOf('@')<=0){
			System.out.println("E-mail inv�lido");
		}
		
		nome="ksljf sjflks fkljsklfjsdl j";
		String novoNome= nome.replace("O ", "A ");
		System.out.println(novoNome);
		
		System.out.println(nome.substring(0,5));
		
		// retornar a segunda metade da vari�vel nome
		System.out.println(nome.substring(nome.length()/2));
		
		//retornar a primeira metade da vari�vel nome
		System.out.println(nome.substring(0, nome.length()/2));
		
		//retornar da variavel email a substring at� o encontrar 
		// o @
		System.out.println(email.substring(0,email.indexOf('@')));
		
	}

}










