package br.com.fiap.modelos;

public class Livro extends Produto{
	private int isbn;
	private String autor;
	private Editora editora;
	private int totalPaginas;
	
	public Livro() {

	}
	public String getAll(){
		return isbn + "\n" +
				autor + "\n" + 
				totalPaginas + "\n" +
				editora.getAll();

	}
	public void setAll(int codigo, String descricao, double valor, Fornecedor fabricante, int isbn, String autor, Editora editora,
			int totalPaginas) {
		setIsbn(isbn);
		setAutor(autor);
		setEditora(editora);
		setTotalPaginas(totalPaginas);
	}

	
	public Livro(String d, int c, double v) {
		super(d, c, v);
	}
	public Livro(int codigo, String descricao, double valor, Fornecedor fabricante, int isbn, String autor, Editora editora,
			int totalPaginas) {
		super(codigo, descricao, valor, fabricante);
		setIsbn(isbn);
		setAutor(autor);
		setEditora(editora);
		setTotalPaginas(totalPaginas);
	}
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public Editora getEditora() {
		return editora;
	}
	public void setEditora(Editora editora) {
		this.editora = editora;
	}
	public int getTotalPaginas() {
		return totalPaginas;
	}
	public void setTotalPaginas(int totalPaginas) {
		this.totalPaginas = totalPaginas;
	}

}
