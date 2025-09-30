package livraria.model;

public abstract class Produto {

	private int id;
	private String item;
	private int categoria;
	private float preco;

	public Produto(int id, String item, int categoria, float preco) {
		this.id = id;
		this.item = item;
		this.categoria = categoria;
		this.preco = preco;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getitem() {
		return item;
	}

	public void setitem(String item) {
		this.item = item;
	}

	public int getCategoria() {
		return categoria;
	}

	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public void visualizar() {

		String categoria = " ";

		switch (this.categoria) {
		case 1 -> categoria = "Livro";
		case 2 -> categoria = "Papelaria";
		default -> categoria = "Inválido";
		}
		System.out.println("\n********************************************");
		System.out.println("Dados do item");
		System.out.println("********************************************");
		System.out.printf("Id do item: %d%n", this.id);
		System.out.printf("Categoria do item: %s%n", categoria);
		System.out.printf("Nome do item: %s%n", this.item);
		System.out.printf("Preço do item: R$ %.2f%n", this.preco);

	}
}
