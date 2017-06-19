package br.com.fiap.modelo;

public class Livro extends Produto{
	private int totalPaginas;
	private String autor;
	private String editora;
	
		
	public Livro() {
		super();
	}
	
	public Livro(String descricao, double valor, int codigo, int totalPaginas, String autor, String editora) {
		super(descricao, valor, codigo);
		setTotalPaginas(totalPaginas);
		setAutor(autor);
		setEditora(editora);
	}
	public void setAll(String descricao, double valor, int codigo, int totalPaginas, String autor, String editora) {
		super.setAll(descricao, valor, codigo);
		setTotalPaginas(totalPaginas);
		setAutor(autor);
		setEditora(editora);
	}
	public String getAll(){
		return super.getAll() + "\n" + totalPaginas + "\n" + 
				autor + "\n" + 
				editora;
	}
	public int getTotalPaginas() {
		return totalPaginas;
	}
	public void setTotalPaginas(int totalPaginas) {
		this.totalPaginas = totalPaginas;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}

}
