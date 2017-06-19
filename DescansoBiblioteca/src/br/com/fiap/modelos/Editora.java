package br.com.fiap.modelos;

public class Editora {
	private String razaoSocial;
	private String cnpj;
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		if (razaoSocial.length()>3 && razaoSocial.length()<20){
			this.razaoSocial = razaoSocial.toUpperCase();
		}
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public Editora(String razaoSocial, String cnpj) {
		super();
		setRazaoSocial(razaoSocial);
		setCnpj(cnpj);
	}
	public Editora() {
		super();
	}
	public void setAll(String razaoSocial, String cnpj) {
		setRazaoSocial(razaoSocial);
		setCnpj(cnpj);
	}
	public String getAll(){
		return razaoSocial + "\n" + cnpj;
	}
}
