package livraria.model;

public class Papelaria extends Produto {

	private String quantidade;

	public Papelaria(int id, String item, int categoria, float preco, String quantidade) {
		super(id, item, categoria, preco);
		this.quantidade = quantidade;
	}

	public String getquantidade() {
		return quantidade;
	}

	public void setquantidade(String quantidade) {
		this.quantidade = quantidade;
	}
	
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.printf("quantidade da papelaria: %s\n", this.quantidade);
	}


}
