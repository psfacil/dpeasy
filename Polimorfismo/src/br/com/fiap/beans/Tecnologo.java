package br.com.fiap.beans;

public class Tecnologo extends Formacao{
	private boolean planoEstendido;
	
	public void setAll(String descricao, int periodo, double mensalidade, int duracao, boolean planoEstendido) {
		super.setAll(descricao, periodo, mensalidade, duracao);
		setPlanoEstendido(planoEstendido);
	}
	
	public String getAll(){
		return planoEstendido + "\n" + 
				super.getAll();
	}
	
	public Tecnologo(String descricao, int periodo, double mensalidade, int duracao, boolean planoEstendido) {
		super(descricao, periodo, mensalidade, duracao);
		setPlanoEstendido(planoEstendido);
	}

	public Tecnologo() {
		super();
	}

	public boolean isPlanoEstendido() {
		return planoEstendido;
	}

	public void setPlanoEstendido(boolean planoEstendido) {
		this.planoEstendido = planoEstendido;
	}

}
