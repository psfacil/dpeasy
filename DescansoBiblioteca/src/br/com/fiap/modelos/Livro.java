package br.com.fiap.modelos;

public class Livro {
	private int isbn;
	private String titulo;
	private double valor;
	private Autor autor;
	private Editora editora;
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		if (isbn>0){
			this.isbn = isbn;
		}
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		if (titulo.length()>3){
			this.titulo = titulo.toUpperCase();
		}
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public Autor getAutor() {
		return autor;
	}
	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	public Editora getEditora() {
		return editora;
	}
	public void setEditora(Editora editora) {
		this.editora = editora;
	}
	public Livro(int isbn, String titulo, double valor, Autor autor, Editora editora) {
		super();
		setIsbn(isbn);
		setTitulo(titulo);
		setValor(valor);
		setAutor(autor);
		setEditora(editora);
	}
	public Livro() {
		super();
	}
	public void setAll(int isbn, String titulo, double valor, Autor autor, Editora editora) {
		setIsbn(isbn);
		setTitulo(titulo);
		setValor(valor);
		setAutor(autor);
		setEditora(editora);
	}
	public String getAll(){
		return isbn + "\n" +
				titulo + "\n" + 
				valor + "\n" + 
				autor.getAll() + "\n" + 
				editora.getAll(); 
	}
}
