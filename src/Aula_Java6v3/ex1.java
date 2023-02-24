package Aula_Java6v3;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ex1 {
	public static void main(String[] args) {
		Queue<String> filaClientes = new LinkedList<>();
		Scanner scanner = new Scanner(System.in);

		int opcao = -1;
		while (opcao != 0) {
			System.out.println("\nEscolha uma opção:");
			System.out.println("1: Adicionar um novo Cliente na fila");
			System.out.println("2: Listar todos os Clientes na fila");
			System.out.println("3: Chamar (retirar) uma pessoa da fila");
			System.out.println("0: Sair");

			opcao = scanner.nextInt();
			scanner.nextLine(); // Para consumir a quebra de linha após o número digitado

			switch (opcao) {
			case 1:
				System.out.println("Digite o nome do cliente:");
				String nomeCliente = scanner.nextLine();
				filaClientes.add(nomeCliente);
				System.out.println("Cliente adicionado com sucesso.");
				break;
			case 2:
				if (filaClientes.isEmpty()) {
					System.out.println("A fila está vazia.");
				} else {
					System.out.println("Clientes na fila:");
					for (String cliente : filaClientes) {
						System.out.println(cliente);
					}
				}
				break;
			case 3:
				if (filaClientes.isEmpty()) {
					System.out.println("A fila está vazia.");
				} else {
					String clienteChamado = filaClientes.remove();
					System.out.println("O cliente " + clienteChamado + " foi chamado.");
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
