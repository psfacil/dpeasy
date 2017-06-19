package br.com.fiap.modelo;

public class Elevador {
	private int capacidadePessoas;
	private int totalAndares;
	private int andarAtual;
	private int qtdePessoas;
	
	public void inicializar(int c, int t){
		capacidadePessoas=c;
		totalAndares=t;
	}
	public void subir(){
		andarAtual++;
	}
	
	public void descer(){
		andarAtual--;
	}

	public void entrar(){
		qtdePessoas++;
		//qtdePessoas=qtdePessoas+1;
		//qtdePessoas+=1;
	}
	public void sair(){
		qtdePessoas--;
	}
	
	public void entrar(int x){
		qtdePessoas+=x;
	}
	
	
	public int getCapacidadePessoas() {
		return capacidadePessoas;
	}
	public void setCapacidadePessoas(int capacidadePessoas) {
		this.capacidadePessoas = capacidadePessoas;
	}
	public int getTotalAndares() {
		return totalAndares;
	}
	public void setTotalAndares(int totalAndares) {
		this.totalAndares = totalAndares;
	}
	public int getAndarAtual() {
		return andarAtual;
	}
	public void setAndarAtual(int andarAtual) {
		this.andarAtual = andarAtual;
	}
	public int getQtdePessoas() {
		return qtdePessoas;
	}
	public void setQtdePessoas(int qtdePessoas) {
		this.qtdePessoas = qtdePessoas;
	}
	public Elevador() {
		super();
	}
	public Elevador(int capacidadePessoas, int totalAndares, int andarAtual, int qtdePessoas) {
		super();
		this.capacidadePessoas = capacidadePessoas;
		this.totalAndares = totalAndares;
		this.andarAtual = andarAtual;
		this.qtdePessoas = qtdePessoas;
	}
	public void setAll(int capacidadePessoas, int totalAndares, int andarAtual, int qtdePessoas) {
		this.capacidadePessoas = capacidadePessoas;
		this.totalAndares = totalAndares;
		this.andarAtual = andarAtual;
		this.qtdePessoas = qtdePessoas;
	}
	public String getAll(){
		return "Capacidade de Pessoas..:" + capacidadePessoas + "\n" +
				"Total de Andares......:" + totalAndares + "\n" + 
				"Quantidade de Pessoas.:" + qtdePessoas + "\n" + 
				"Andar Atual...........:" + andarAtual;
	}
}
