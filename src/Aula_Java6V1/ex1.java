package Aula_Java6V1;

import java.util.Scanner;

public class ex1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[] vetor = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };

		System.out.println("Vetor:");

		for (int i = 0; i < vetor.length; i++) {
			System.out.println(i + "\t" + vetor[i]);
		}

		System.out.print("Digite o número que você deseja encontrar: ");
		int numero = input.nextInt();

		int posicao = -1;

		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] == numero) {
				posicao = i;
				break;
			}
		}

		if (posicao == -1) {
			System.out.println("O número " + numero + " não foi encontrado!");
		} else {
			System.out.println("O número " + numero + " está localizado na posição: " + posicao);
		}

		input.close();
	}
}
