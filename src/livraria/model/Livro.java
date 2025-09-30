package livraria.model;

public class Livro extends Produto{

	private String titulo;

	public Livro(int id, int categoria, float preco, String titulo) {
		super(id, titulo, categoria, preco);
		this.titulo = titulo;
	}

	public String gettitulo() {
		return titulo;
	}

	public void settitulo(String titulo) {
		this.titulo = titulo;
	}
	
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.printf("Gênero: %s\n", this.titulo);
	}
	
	
	
}
