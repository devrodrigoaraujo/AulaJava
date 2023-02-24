package Aula_Java6V1;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int[] vetor = new int[10];
		int soma = 0;
		double media = 0;

		for (int i = 0; i < 10; i++) {
			System.out.print("Digite o " + (i + 1) + "º número inteiro: ");
			vetor[i] = input.nextInt();
			soma += vetor[i];
		}

		System.out.println("\nElementos nos índices ímpares:");
		for (int i = 1; i < 10; i += 2) {
			System.out.print(vetor[i] + " ");
		}

		System.out.println("\n\nElementos pares:");
		for (int i = 0; i < 10; i++) {
			if (vetor[i] % 2 == 0) {
				System.out.print(vetor[i] + " ");
			}
		}

		media = (double) soma / vetor.length;

		System.out.println("\n\nSoma: " + soma);
		System.out.println("\nMédia: " + media);

		input.close();
	}
}
