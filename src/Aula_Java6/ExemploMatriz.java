package Aula_Java6;

import java.util.Scanner;

public class ExemploMatriz {

	public static void main(String[] args) {
		
		
		
		int[][] valor = new int[2][3];
		int linha,coluna,somaValor=0;
		
		Scanner leia = new Scanner(System.in);
		
		for(linha=0;linha<2;linha++) {
			for(coluna=0;coluna<3;coluna++) {
				System.out.println("\nEntre com um valor:");//9  3
				valor[linha][coluna] = leia.nextInt();
				somaValor += valor[linha][coluna];
			}
		}
		
		System.out.println("\nSomatoria dos valores da matriz foi de: "+somaValor);
		

	}


		
		
		
	}


