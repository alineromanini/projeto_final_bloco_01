package livraria;

import java.util.InputMismatchException;
import java.util.Scanner;

import livraria.controller.ProdutoController;
import livraria.model.Livro;
import livraria.model.Papelaria;
import livraria.model.Produto;
import livraria.util.Cores;

public class Menu {

	private static final Scanner leia = new Scanner(System.in);

	private static final ProdutoController produtoController = new ProdutoController();

	public static void main(String[] args) {

		int opcao;

		criarItensTeste(); // chamando método para adicionar os itens na coleção

		Livro l1 = new Livro(1, "livro", 1, 15.00f, "O alienista");
		l1.visualizar();

		while (true) {

			System.out.println(Cores.TEXT_PURPLE + Cores.ANSI_CYAN_BACKGROUND
					+ "********************************************************");
			System.out.println("                                                        ");
			System.out.println("                   LIVRARIA DA GEN                      ");
			System.out.println("                                                        ");
			System.out.println("********************************************************");
			System.out.println("                                                        ");
			System.out.println("                1 - Cadastrar livros                    ");
			System.out.println("                2 - Listar todos os livros              ");
			System.out.println("                3 - Buscar livros por ID                ");
			System.out.println("                4 - Atualizar livros                    ");
			System.out.println("                5 - Apagar livros                       ");
			System.out.println("                0 - Sair                                ");
			System.out.println("                                                        ");
			System.out.println("********************************************************");
			System.out.println("Entre com a opção desejada:                             ");
			System.out.println("                                                        " + Cores.TEXT_RESET);

			try {
				opcao = leia.nextInt();
				leia.nextLine();
			} catch (InputMismatchException e) {
				opcao = -1;
				System.out.println("\nDigite um número entre 0 e 5");
				leia.nextLine();
			}

			if (opcao == 0) {
				System.out.println(Cores.TEXT_BLUE_BOLD + "\nBem-vinde à Livraria da Gen!");
				System.out.println(Cores.TEXT_RESET);
				sobre();
				leia.close();
				System.exit(0);
			}

			switch (opcao) {
			case 1:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Cadastrar livros\n");
				cadastrar();
				keypress();
				break;
			case 2:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Listar todos os livros\n" + Cores.TEXT_RESET);
				listarProdutos();
				keypress();
				break;
			case 3:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Consultar livros por ID\n");
				consultarPorId();

				keypress();
				break;
			case 4:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Atualizar livros\n");
				atualizar();
				keypress();
				break;
			case 5:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Apagar livros");
				deletar();
				keypress();
				break;

			default:
				System.out.println(Cores.TEXT_RED_BOLD + "Opção Inválida!\n" + Cores.TEXT_RESET);
				keypress();
				break;

			}
		}
	}

	public static void sobre() {
		System.out.println("*************************************************");
		System.out.println("\nProjeto Desenvolvido por: Aline Romanini da Silva");
		System.out.println("Generation Brasil - AlineSi@genstudents.org");
		System.out.println("https://github.com/alineromanini");
		System.out.println("**************************************************");
	}

	public static void keypress() {
		System.out.println(Cores.TEXT_RESET + "\n\nPressione Enter para continuar");
		leia.nextLine();
	}

	private static void criarItensTeste() {
		produtoController.cadastrar(new Livro(produtoController.gerarId(), "livro", 1, 15.00f, "O alienista"));
	}

	private static void listarProdutos() {
		produtoController.listarProdutos();
	}

	private static void cadastrar() {

		System.out.print("Digite o nome do item: ");
		String item = leia.nextLine();
		

		System.out.print("Digite o Categoria da produto (1 - Livro | 2 - Papelaria): ");
		int categoria = leia.nextInt();
		leia.nextLine();

		System.out.print("Digite o preço: ");
		float preco = leia.nextFloat();
		leia.nextLine();

		switch (categoria) {
		case 1 -> {
			System.out.print("Digite o título: ");
			String titulo = leia.nextLine();

			// Automatiza o id da produto através do método gerarId()
			produtoController.cadastrar(new Livro(produtoController.gerarId(), item, categoria, preco, titulo));
		}
		case 2 -> {
			System.out.print("Digite a quantidade de itens: ");
			int quantidade = leia.nextInt();
			leia.nextLine();
			produtoController.cadastrar(new Papelaria(produtoController.gerarId(), item, categoria, preco, quantidade));
		}
		default -> System.out.println(Cores.TEXT_RED + "Categoria de produto inválido!" + Cores.TEXT_RESET);
		}
	}

	private static void consultarPorId() {

		System.out.print("Digite o ID do produto: ");
		int id = leia.nextInt();
		leia.nextLine();

		produtoController.consultarPorId(id);
	}

	private static void deletar() {

		System.out.print("Digite o ID do produto: ");
		int id = leia.nextInt();
		leia.nextLine();

		// Busca a produto pelo id
		Produto produto = produtoController.buscarNaCollection(id);

		// Verifica se a produto existe
		if (produto != null) {

			// Confirmação da exclusão
			System.out.print("\nTem certeza que deseja excluir esta produto? (S/N): ");
			String confirmacao = leia.nextLine();

			if (confirmacao.equalsIgnoreCase("S")) {
				produtoController.deletar(id);
			} else {
				System.out.println("\nOperação cancelada!");
			}

		} else {
			System.out.printf("\nO produto id %d não foi encontrado!", id);
		}
	}

	private static void atualizar() {

		System.out.print("Digite o ID do produto: ");
		int id = leia.nextInt();
		leia.nextLine();

		// Busca o produto pelo id
		Produto produto = produtoController.buscarNaCollection(id);

		if (produto != null) {

			// Obtém os dados atuais
			String item = produto.getItem();
			int categoria = produto.getCategoria();
			float preco = produto.getPreco();

			// Atualiza o nome do nome (ou mantém valor atual se apertar Enter)
			System.out.printf(
					"Nome atual: %s\nDigite o novo nome do Nome (Pressione ENTER para manter o valor atual): ", item);
			String entrada = leia.nextLine();
			item = entrada.isEmpty() ? item : entrada;

			// Atualiza preco (ou mantém valor atual se apertar Enter)
			System.out.printf("Preco atual: %.2f\nDigite o novo Preco (Pressione ENTER para manter o valor atual): ",
					preco);
			entrada = leia.nextLine();

			preco = entrada.isEmpty() ? preco : Float.parseFloat(entrada.replace(",", "."));

			switch (categoria) {
			case 1 -> {

				String titulo = ((Livro) produto).getTitulo();

				System.out.printf(
						"Título do livro é é: %s\nDigite o novo titulo (Pressione ENTER para manter o valor atual): ",
						titulo);
				entrada = leia.nextLine();
				titulo = entrada.isEmpty() ? titulo : entrada;

				produtoController.atualizar(new Livro(id, item, categoria, preco, titulo));

			}
			case 2 -> {
				int quantidade = ((Papelaria) produto).getquantidade();

				System.out.printf(
						"Quantidade atual é: %d\nDigite a quantidade (Pressione ENTER para manter o valor atual): ",
						quantidade);

				entrada = leia.nextLine();
				quantidade = entrada.isEmpty() ? quantidade : Integer.parseInt(entrada); // casting

				produtoController.atualizar(new Papelaria(id, item, categoria, preco, quantidade));

			}

			default -> System.out.println(Cores.TEXT_RED + "Categoria de produto inválido!" + Cores.TEXT_RESET);

			}

		} else {
			// Caso o produto não exista
			System.out.printf("\nA produto número %d não foi encontrada!", id);

		}
	}
}