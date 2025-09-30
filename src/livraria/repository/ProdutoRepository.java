package livraria.repository;

import livraria.model.Produto;

public interface ProdutoRepository {

	public void cadastrar(Produto produto);
	public void listarTodos();
	public void consultarPorId(int id);
	public void atualizar(Produto produto);
	public void deletar(int id);
	
}
