package Aula_Java6v3;

import java.util.Scanner;
import java.util.Stack;

public class ex2 {
	public static void main(String[] args) {
		Stack<String> pilhaLivros = new Stack<>();
		Scanner scanner = new Scanner(System.in);

		int opcao = -1;
		while (opcao != 0) {
			System.out.println("\nEscolha uma opção:");
			System.out.println("1: Adicionar um novo livro na pilha");
			System.out.println("2: Listar todos os livros da pilha");
			System.out.println("3: Retirar um livro da pilha");
			System.out.println("0: Sair");

			opcao = scanner.nextInt();
			scanner.nextLine(); // Para consumir a quebra de linha após o número digitado

			switch (opcao) {
			case 1:
				System.out.println("Digite o nome do livro:");
				String nomeLivro = scanner.nextLine();
				pilhaLivros.push(nomeLivro);
				System.out.println("Livro adicionado com sucesso.");
				break;
			case 2:
				if (pilhaLivros.isEmpty()) {
					System.out.println("A pilha está vazia.");
				} else {
					System.out.println("Livros na pilha:");
					for (String livro : pilhaLivros) {
						System.out.println(livro);
					}
				}
				break;
			case 3:
				if (pilhaLivros.isEmpty()) {
					System.out.println("A pilha está vazia.");
				} else {
					String livroRetirado = pilhaLivros.pop();
					System.out.println("O livro " + livroRetirado + " foi retirado.");
				}
				break;
			case 0:
				System.out.println("Programa finalizado.");
				break;
			default:
				System.out.println("Opção inválida. Tente novamente.");
				break;
			}
		}

		scanner.close();
	}
}
