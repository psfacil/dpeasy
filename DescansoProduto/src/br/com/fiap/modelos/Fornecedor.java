package br.com.fiap.modelos;

public class Fornecedor {
private String razaoSocial;
private String cnpj;
private String fone;

public String getAll(){
	return razaoSocial + "\n"+ cnpj + "\n" + fone;
}

public void setAll(String r, String c, String f){
	setRazaoSocial(r);
	cnpj=c;
	fone=f;
}

public Fornecedor() {
	super();
}
public Fornecedor(String razaoSocial, String cnpj, String fone) {
	super();
	setRazaoSocial(razaoSocial);
	this.cnpj = cnpj;
	this.fone = fone;
}
public String getRazaoSocial() {
	return razaoSocial;
}
public void setRazaoSocial(String razaoSocial) {
	this.razaoSocial = razaoSocial.toUpperCase();
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
