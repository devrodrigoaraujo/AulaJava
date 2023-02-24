package Aula_Java6v2;

import java.util.ArrayList;
import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Criando um ArrayList de Integers com 10 valores
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		numeros.add(2);
		numeros.add(5);
		numeros.add(1);
		numeros.add(3);
		numeros.add(4);
		numeros.add(9);
		numeros.add(7);
		numeros.add(8);
		numeros.add(10);
		numeros.add(6);

		// Criando um objeto Scanner para ler a entrada do usuário
		Scanner scanner = new Scanner(System.in);

		// Solicitando ao usuário que digite um número
		System.out.print("Digite o número que você deseja encontrar: ");
		int numero = scanner.nextInt();

		// Verificando se o número existe na coleção e mostrando a posição em que ele se
		// encontra
		boolean encontrado = false;
		for (int i = 0; i < numeros.size(); i++) {
			if (numeros.get(i) == numero) {
				System.out.printf("O número %d está localizado na posição: %d\n", numero, i);
				encontrado = true;
				break;
			}
		}

		// Caso o número não seja encontrado, exibir mensagem informando isso
		if (!encontrado) {
			System.out.printf("O número %d não foi encontrado!\n", numero);
		}

		// Fechando o objeto Scanner
		scanner.close();
	}

}
