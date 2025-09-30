package livraria.model;

public class Papelaria extends Produto {

	private int quantidade;

	public Papelaria(int id, String item, int categoria, float preco, int quantidade) {
		super(id, item, categoria, preco);
		this.quantidade = quantidade;
	}

	public int getquantidade() {
		return quantidade;
	}

	public void setquantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.printf("quantidade da papelaria: %d\n", this.quantidade);
	}


}
