package livraria.model;

public class Livro extends Produto{

	private String titulo;


	
	public Livro(int id, String item, int categoria, float preco, String titulo) {
		super(id, item, categoria, preco);
		this.titulo = titulo;
	}

	


	public String getTitulo() {
		return titulo;
	}




	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}




	@Override
	public void visualizar() {
		super.visualizar();
		System.out.printf("Gênero: %s\n", this.titulo);
	}
	
	
	
}
