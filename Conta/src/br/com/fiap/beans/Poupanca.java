package br.com.fiap.beans;

public class Poupanca extends Conta{
	private int aniversario;
	private double rendimento;

	public String getAll(){
		return aniversario + "\n" + rendimento + "\n" + super.getAll();
	}
	public void setAll(int numero, Cliente cliente, double saldo, int aniversario, double rendimento) {
		super.setAll(numero, cliente, saldo);
		this.aniversario = aniversario;
		this.rendimento = rendimento;
	}

	public Poupanca(int numero, Cliente cliente, double saldo, int aniversario, double rendimento) {
		super(numero, cliente, saldo);
		this.aniversario = aniversario;
		this.rendimento = rendimento;
	}
	public Poupanca() {
		super();
	}
	public int getAniversario() {
		return aniversario;
	}
	public void setAniversario(int aniversario) {
		this.aniversario = aniversario;
	}
	public double getRendimento() {
		return rendimento;
	}
	public void setRendimento(double rendimento) {
		this.rendimento = rendimento;
	}

}
