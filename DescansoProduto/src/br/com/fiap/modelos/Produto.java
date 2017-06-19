package br.com.fiap.modelos;

public class Produto {
	private int codigo;
	private String descricao;
	private double valor;
	private Fornecedor fabricante;

	// Primeiro exercício => Método get
	public double gerarDesconto(){
		return valor -valor * 0.1;
	}
	//public String gerarDesconto(){
	//	return "Valor com Desconto:" + (valor -valor * 0.1);
	//}

	// Segundo exercício => Método set
	public void setBasico(String d, double v, int c){
		descricao=d.toUpperCase();
		valor=v;
		codigo=c;
		fabricante=null;
	}

	// Terceiro exercício => Método Worker
	public String atualizarValor(double p){
		valor = valor + valor * (p/100);
		return "Valor atualizado";
	}

	// Quarto exercício => Método Construtor
	public Produto(String d, int c, double v){
		descricao=d.toUpperCase();
		codigo=c;
		valor=v;
	}

	public String getAll(){
		return codigo + "\n" + 
				descricao + "\n" +
				valor + "\n" +
				fabricante.getAll();
	}
	public void setAll(int c, String d, double v, Fornecedor f){
		codigo =c;
		descricao=d.toUpperCase();
		valor=v;
		fabricante=f;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao.toUpperCase();
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public Fornecedor getFabricante() {
		return fabricante;
	}
	public void setFabricante(Fornecedor fabricante) {
		this.fabricante = fabricante;
	}
	public Produto(int codigo, String descricao, double valor, Fornecedor fabricante) {
		super();
		this.codigo = codigo;
		this.descricao = descricao;
		this.valor = valor;
		this.fabricante = fabricante;
	}
	public Produto() {
		super();
	}

}
