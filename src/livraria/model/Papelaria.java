package livraria.model;

public class Papelaria extends Item {

	private String produto;

	public Papelaria(int id, String item, int categoria, float preco, String produto) {
		super(id, item, categoria, preco);
		this.produto = produto;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}
	
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.printf("Produto da papelaria: %s\n", this.produto);
	}


}
