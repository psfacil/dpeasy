package br.com.fiap.modelos;

public class Editora {
	private String razaoSocial;
	private String cnpj;
	private String fone;

	public String getAll(){
		return razaoSocial + "\n" +
				cnpj + "\n" + 
				fone; 
	}
	public void setAll(String razaoSocial, String cnpj, String fone) {
		setRazaoSocial(razaoSocial);
		setCnpj(cnpj);
		setFone(fone);
	}
	
	public Editora() {
		super();
	}
	public Editora(String razaoSocial, String cnpj, String fone) {
		super();
		setRazaoSocial(razaoSocial);
		setCnpj(cnpj);
		setFone(fone);
	}
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getFone() {
		return fone;
	}
	public void setFone(String fone) {
		this.fone = fone;
	}

}
