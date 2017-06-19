package br.com.fiap.modelos;

public class Autor {
	private String nome;
	private String email;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome.toUpperCase();
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		if (email.indexOf('@')>0){
			this.email = email.toLowerCase();
		}
	}
	public Autor(String nome, String email) {
		super();
		setNome(nome);
		setEmail(email);
	}
	public Autor() {
		super();
	}
	public void setAll(String nome, String email) {
		setNome(nome);
		setEmail(email);
	}
	public String getAll(){
		return nome + "\n" + email;
	}
	public String getServidor(){
		return email.substring(email.indexOf('@')+1);
	}
}
