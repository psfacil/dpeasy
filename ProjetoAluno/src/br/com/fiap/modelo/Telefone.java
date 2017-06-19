package br.com.fiap.modelo;

public class Telefone {
	private int ddd;
	private String numero;
	private String operadora;
	
	public Telefone() {
	}
	public Telefone(int ddd, String numero, String operadora) {
		this.ddd = ddd;
		this.numero = numero;
		this.operadora = operadora;
	}
	public String getAll(){
		return "("+ddd + ") "+ 
				numero + " : " +
				operadora;

	}
	public void setAll
	(int pDdd, String pNumero, String pOperadora){
		ddd =pDdd;
		numero=pNumero;
		operadora=pOperadora;

	}
	public int getDdd() {
		return ddd;
	}
	public void setDdd(int ddd) {
		this.ddd = ddd;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getOperadora() {
		return operadora;
	}
	public void setOperadora(String operadora) {
		this.operadora = operadora;
	}

}
