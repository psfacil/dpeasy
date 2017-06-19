package br.com.fiap.beans;

public class Conta {
	private int numero;
	private Cliente cliente;
	private double saldo;
	
	public String sacar(double valor){
		if (getSaldo()>=valor){
			saldo-=valor;
			return "Realizado";
		}else{
			return "Saldo insuficiente";
		}
	}
	
	public String getAll(){
		return numero + "\n" + saldo + "\n" + cliente.getAll();
	}

	public void setAll(int numero, Cliente cliente, double saldo) {
		this.numero = numero;
		this.cliente = cliente;
		this.saldo = saldo;
	}
	public Conta(int numero, Cliente cliente, double saldo) {
		super();
		this.numero = numero;
		this.cliente = cliente;
		this.saldo = saldo;
	}
	public Conta() {
		super();
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		if(numero<999999){
			this.numero = numero;
		}else{
			this.numero=999999;
		}
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}
