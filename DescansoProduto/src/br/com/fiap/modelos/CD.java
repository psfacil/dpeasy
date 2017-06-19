package br.com.fiap.modelos;

public class CD extends Produto{
	private String artista;
	private String genero;
	private int totalFaixas;
	
	public CD() {
	}
	public void setAll(String a, String g, int t){
		setArtista(a);
		setGenero(g);
		setTotalFaixas(t);
	}
	public String getAll(){
		return getArtista() + "\n" + 
				getGenero() + "\n" + 
				getTotalFaixas() + "\n" + 
				super.getAll(); //VOU ESQUECER NA PROVA
	}
	
	public CD(int codigo, String descricao, double valor, Fornecedor fabricante, String artista, String genero,
			int totalFaixas) {
		super(codigo, descricao, valor, fabricante);
		setArtista(artista);
		setGenero(genero);
		setTotalFaixas(totalFaixas);	
	}
	public String getArtista() {
		return artista;
	}
	public void setArtista(String artista) {
		this.artista = artista;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public int getTotalFaixas() {
		return totalFaixas;
	}
	public void setTotalFaixas(int totalFaixas) {
		this.totalFaixas = totalFaixas;
	}



}
