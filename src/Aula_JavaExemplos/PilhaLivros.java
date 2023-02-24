package Aula_JavaExemplos;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class PilhaLivros {

	public static void main(String[] args) throws InterruptedException {

		Scanner leia = new Scanner(System.in);

		Stack<String> pilha = new Stack<String>();
		
		int opcao;
		String titulo;

		while (true) {

			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Adicionar Livro na pilha            ");
			System.out.println("            2 - Listar todos os Livros             ");
			System.out.println("            3 - Retirar Livro da pilha              ");
			System.out.println("            0 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     ");

			opcao = leia.nextInt();

			if (opcao == 0) {
				System.out.println("\nPrograma Finalizado!!");
				leia.close();
				System.exit(0);
			}

			switch (opcao) {
				case 1:
					System.out.println("Adicionar Livro na pilha\n\n");
					
					System.out.println("\nDigite o nome do Livro: ");
					leia.skip("\\R?");
					titulo = leia.nextLine();
					
					pilha.push(titulo);
					
					System.out.println("\nLivro Adicionado");
					
					break;
				case 2:
					System.out.println("Listar Livros na pilha\n\n");
					
					Iterator<String> iterator = pilha.iterator();
					
					while(iterator.hasNext()){
					   System.out.println(iterator.next());
					}
					
					break;
				case 3:
					System.out.println("Retirar Livro da pilha\n\n");

					if (pilha.isEmpty())
						System.out.println("\nA Pilha está vazia!");
					else
						pilha.pop();
					
					System.out.println("\nLivro Retirado da pilha");
										
					break;
				default:
					System.out.println("\nOpção Inválida!\n");
					break;
			}
		}

	}

}