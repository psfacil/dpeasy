package br.com.fiap.modelo;

public class Produto {
	private String descricao;
	private double valor;
	private int codigo;
	
	
	public Produto() {
		super();
	}
	public Produto(String descricao, double valor, int codigo) {
		super();
		this.descricao = descricao;
		this.valor = valor;
		this.codigo = codigo;
	}
	public void setAll(String descricao, double valor, int codigo) {
		setDescricao(descricao);
		setValor(valor);
		setCodigo(codigo);
	}
	public String getAll(){
		return descricao + "\n" +
				valor + "\n" + 
				codigo; 
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

}

