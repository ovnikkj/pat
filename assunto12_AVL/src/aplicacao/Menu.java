package aplicacao;

import java.util.Scanner;

import arvores.AVLINT;

public class Menu {

	public static void main(String[] args) {
		Scanner le = new Scanner(System.in);
		AVLINT avl = new AVLINT();
		int opcao;
		do {
			System.out.println("0 - Sair");
			System.out.println("1 - Inserir");
			System.out.println("2 - Apresenta FB de cada no da AVL");
			opcao = le.nextInt();
			switch (opcao) {
			case 0:
				System.out.println("Encerrado o programa");
				break;
			case 1:
				System.out.print("Informa valor do dado a ser inserido: ");
				int valor = le.nextInt();
				avl.root = avl.inserirAVL(avl.root, valor);
				avl.atualizaAlturas(avl.root);
				break;
			case 2:
				System.out.println("\n*** Apresentacao de FB dos nos AVL");
				avl.mostraFB(avl.root);
				break;
			default:
				System.out.println("Opcao invalida");
			}
		} while (opcao != 0);
		le.close();

	}

}
