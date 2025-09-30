package projeto_final_bloco_01;

import java.util.InputMismatchException;
import java.util.Scanner;

import projeto_final_bloco_01.util.Cores;

public class Menu {

	private static final Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		int opcao;

		//criarlivrossTeste(); // chamando método para adicionar as livross na coleção

		while (true) {

			System.out.println(Cores.TEXT_PURPLE + Cores.ANSI_CYAN_BACKGROUND
					+ "********************************************************");
			// System.out.println("********************************************************");
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
				// cadastrarlivros();
				keypress();
				break;
			case 2:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Listar todos os livros\n" + Cores.TEXT_RESET);
				// listarlivross();
				keypress();
				break;
			case 3:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Consultar livros por ID\n");
				// procurarlivrosPorNumero();

				keypress();
				break;
			case 4:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Atualizar livros\n");
				// atualizarlivros();
				keypress();
				break;
			case 5:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Apagar livros");
				// deletarlivros();
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
}

