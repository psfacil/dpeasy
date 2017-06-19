package br.com.fiap.modelo;

public class CD extends Produto{
	private int totalFaixas;
	private String artista;
	private String gravadora;
	
	public CD() {
		super();
	}
	public CD(String descricao, double valor, int codigo, int totalFaixas, String artista, String gravadora) {
		super(descricao, valor, codigo);
		setTotalFaixas(totalFaixas);
		setArtista(artista);
		setGravadora(gravadora);
	}
	public String getAll(){
		return super.getAll() + "\n" + totalFaixas + "\n" +
				artista + "\n" + 
				gravadora;
	}
	public void setAll(String descricao, double valor, int codigo, int totalFaixas, String artista, String gravadora) {
		super.setAll(descricao, valor, codigo);
		setTotalFaixas(totalFaixas);
		setArtista(artista);
		setGravadora(gravadora);
	}
	public int getTotalFaixas() {
		return totalFaixas;
	}
	public void setTotalFaixas(int totalFaixas) {
		this.totalFaixas = totalFaixas;
	}
	public String getArtista() {
		return artista;
	}
	public void setArtista(String artista) {
		this.artista = artista.toUpperCase();
	}
	public String getGravadora() {
		return gravadora;
	}
	public void setGravadora(String gravadora) {
		this.gravadora = gravadora;
	}

}
