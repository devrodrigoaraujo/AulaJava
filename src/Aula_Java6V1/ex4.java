package Aula_Java6V1;

import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		double[][] notas = new double[10][4];
		double[] medias = new double[10];

		// Leitura das notas dos alunos
		for (int i = 0; i < 10; i++) {
			System.out.printf("Digite as notas do aluno %d: ", i + 1);
			for (int j = 0; j < 4; j++) {
				notas[i][j] = sc.nextDouble();
			}
		}

		// Cálculo das médias dos alunos
		for (int i = 0; i < 10; i++) {
			double soma = 0;
			for (int j = 0; j < 4; j++) {
				soma += notas[i][j];
			}
			medias[i] = soma / 4;
		}

		// Impressão das médias dos alunos
		System.out.print("Médias dos alunos: ");
		for (int i = 0; i < 10; i++) {
			System.out.printf("%.1f ", medias[i]);
		}
		System.out.println();

		sc.close();
	}
}
