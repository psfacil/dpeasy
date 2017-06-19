package br.com.fiap.modelo;

public class Endereco {
	private String logradouro;
	private String numero;
	private String cep;
	
	public Endereco(){}
	
	public Endereco(String l, String n, String c){
		logradouro = l;
		numero = n;
		cep = c;
	}
	public void setAll
		(String pLogradouro,
		String pNumero, String pCep){
		
		numero = pNumero;
		logradouro = pLogradouro;
		cep= pCep;	
	}
	public String getAll(){
		return logradouro + "\n" + 
				numero + "\n" + 
				cep;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}


}
