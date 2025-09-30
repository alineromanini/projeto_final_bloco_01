package livraria.controller;

import java.util.ArrayList;
import java.util.List;

import livraria.model.Produto;
import livraria.repository.ProdutoRepository;

public class ProdutoController implements ProdutoRepository {

	private List<Produto> listaProdutos = new ArrayList<Produto>();
	int id = 0;

	@Override
	public void listarProdutos() {
		for (var produto : listaProdutos) {

			produto.visualizar();
		}
	}

	@Override
	public void cadastrar(Produto produto) {
		listaProdutos.add(produto);
		System.out.println("\n 🙌 produto cadastrado com sucesso!");
	}

	@Override
	public void atualizar(Produto produto) {
		var buscarproduto = buscarNaCollection(produto.getId());

		if (buscarproduto != null) {
			listaProdutos.set(listaProdutos.indexOf(buscarproduto), produto);
			System.out.printf("\nO produto id %d foi atualizado com sucesso!\n", produto.getId());
		} else {
			System.out.printf("O produto id %d não foi encontrado.", produto.getId());
		}
	}

	@Override
	public void consultarPorId(int id) {

		var produto = buscarNaCollection(id);

		if (produto != null) {
			produto.visualizar();
		} else {
			System.out.printf("\nQue pena! O Produto id: %d não foi encontrado. 😕%n", id);
		}

	}

	@Override
	public void deletar(int id) {

		var produto = buscarNaCollection(id);

		if (produto != null) {
			if (listaProdutos.remove(produto) == true) {
				System.out.printf("\nO produto id %d foi deletado com sucesso!%n", id);
			}
		} else {
			System.out.printf("\nO Produto id: %d não foi encontrado!%n", id);
		}

	}
	// Métodos Auxiliares

	public int gerarId() {
		return ++id;
	}

	public Produto buscarNaCollection(int id) {
		for (var produto : listaProdutos) {
			if (produto.getId() == id) {
				return produto;
			}
		}

		return null;
	}

}
