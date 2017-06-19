package br.com.fiap.beans;

public class Cliente {
	private String nome;
	private String cpf;
	
	public String getPrimeiroNome(){
		return nome.substring(0, nome.indexOf(' '));
	}
	public String getAll(){
		return getNome() + "\n" + cpf;
	}
	public void setAll(String nome, String cpf) {
		setNome(nome);
		this.cpf = cpf;
	}
	public Cliente(String nome, String cpf) {
		super();
		setNome(nome);
		this.cpf = cpf;
	}
	public Cliente() {
		super();
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome.toUpperCase();
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}
