import javax.swing.JOptionPane;

public class TesteExcecao {

	public static void main(String[] args) {
		double resultado=0;
		try{
			double v1=Double.parseDouble
					(JOptionPane.showInputDialog
							("Digite o primeiro valor"));
			double v2=Double.parseDouble
					(JOptionPane.showInputDialog
							("Digite o segundo valor"));
			resultado = v1/v2;
		}catch (NumberFormatException e){
			e.printStackTrace();
			System.out.println("Não digitou um número");
		}catch (Exception e){
			System.out.println("Exceção desconhecida");
		}
		finally{
			System.out.println(resultado);
		}

	}

}
