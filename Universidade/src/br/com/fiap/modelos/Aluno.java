package br.com.fiap.modelos;

public class Aluno {
	private String nome;
	private int rm;
	private String cpf;
	private Endereco endereco;
	private Telefone fone;
	
	public Aluno(String n, int r, 
			String c, Endereco e, Telefone f){
		setNome(n);
		rm=r;
		cpf=c;
		endereco=e;
		fone=f;
	}
	
	public Aluno(){} 
	
	public Aluno(String x){
		nome=x;
	}
	
	public Telefone getFone() {
		return fone;
	}
	public void setFone(Telefone fone) {
		this.fone = fone;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public void setAll
		(String n, int r, String c, 
				Endereco e, Telefone f){
		setNome(n);
		rm=r;
		cpf=c;
		endereco=e;
		fone = f;
	}
	public String getAll(){
		return nome + "\n" + rm + "\n" + 
				cpf + "\n" + endereco.getAll() + "\n" + 
				fone.getAll();
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if (nome.length()>1){
			this.nome = nome.toUpperCase();
		}
	}
	public int getRm() {
		return rm;
	}
	public void setRm(int rm) {
		this.rm = rm;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


}



