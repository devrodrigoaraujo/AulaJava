package Aula_Java6V1;

import java.util.Scanner;

public class ex3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] matriz = new int[3][3];

		// Lendo a matriz
		System.out.println("Digite os valores da matriz:");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}

		// Imprimindo os elementos da diagonal principal
		System.out.print("Elementos da Diagonal Principal:\nmatriz\n");
		for (int i = 0; i < 3; i++) {
			System.out.print(matriz[i][i] + " ");
		}
		System.out.println();

		// Imprimindo os elementos da diagonal secundária
		System.out.print("\nElementos da Diagonal Secundária:\n");
		for (int i = 0; i < 3; i++) {
			System.out.print(matriz[i][2 - i] + " ");
		}
		System.out.println();

		// Calculando a soma dos elementos da diagonal principal
		int somaDP = 0;
		for (int i = 0; i < 3; i++) {
			somaDP += matriz[i][i];
		}

		// Calculando a soma dos elementos da diagonal secundária
		int somaDS = 0;
		for (int i = 0; i < 3; i++) {
			somaDS += matriz[i][2 - i];
		}

		// Imprimindo a soma dos elementos da diagonal principal e secundária
		System.out.println("\nSoma dos Elementos da Diagonal Principal: " + somaDP);
		System.out.println("Soma dos Elementos da Diagonal Secundária: " + somaDS);
	}
}
