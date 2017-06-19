package br.com.fiap.beans;

public class Corrente extends Conta{
	private double limite;
	private double txCheque;
	
	public String sacar(double valor){
		double saldoFinal = super.getSaldo() + limite;
		if (saldoFinal>=valor){
			setSaldo(super.getSaldo() - valor);
			return "Realizado";
		}else{
			return "Saldo insuficiente";
		}
	}
	public double getSaldo(){
		return limite + super.getSaldo();
	}
	public String getAll(){
		return limite + "\n" + txCheque + "\n" + super.getAll();
	}
	
	public void setAll(int numero, Cliente cliente, double saldo, double limite, double txCheque) {
		super.setAll(numero, cliente, saldo);
		this.limite = limite;
		this.txCheque = txCheque;
	}
	
	public Corrente(int numero, Cliente cliente, double saldo, double limite, double txCheque) {
		super(numero, cliente, saldo);
		this.limite = limite;
		this.txCheque = txCheque;
	}
	
	public Corrente() {
		super();
	}
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}
	public double getTxCheque() {
		return txCheque;
	}
	public void setTxCheque(double txCheque) {
		this.txCheque = txCheque;
	}

}
