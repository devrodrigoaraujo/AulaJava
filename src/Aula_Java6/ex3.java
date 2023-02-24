package Aula_Java6;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {

		
		        int[][] matriz = new int[3][3];
		        Scanner leia = new Scanner(System.in);

		        // Lendo os valores da matriz
		        for (int i = 0; i < 3; i++) {
		            for (int j = 0; j < 3; j++) {
		                System.out.print("Digite o valor da posição [" + i + "][" + j + "]: ");
		                matriz[i][j] = leia.nextInt();
		            }
		        }

		        System.out.println("Elementos da diagonal principal:");
		        for (int i = 0; i < 3; i++) {
		            System.out.print(matriz[i][i] + " ");
		        }
		        System.out.println();

		        System.out.println("Elementos da diagonal secundária:");
		        for (int i = 0; i < 3; i++) {
		            System.out.print(matriz[i][2-i] + " ");
		        }
		        System.out.println();

		        int somaDiagonalPrincipal = 0;
		        int somaDiagonalSecundaria = 0;
		        for (int i = 0; i < 3; i++) {
		            somaDiagonalPrincipal += matriz[i][i];
		            somaDiagonalSecundaria += matriz[i][2-i];
		        }
		        System.out.println("Soma dos elementos da diagonal principal: " + somaDiagonalPrincipal);
		        System.out.println("Soma dos elementos da diagonal secundária: " + somaDiagonalSecundaria);
		    }
		

	}


