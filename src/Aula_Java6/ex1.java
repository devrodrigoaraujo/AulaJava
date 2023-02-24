package Aula_Java6;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		

	       int[] vetor = {5, 3, 7, 1, 9, 2, 4, 8, 10, 6}; // vetor com 10 números inteiros não ordenados e não repetidos
	        Scanner leia = new Scanner(System.in);
	        System.out.print("Digite um número para pesquisar: ");
	        int numero = leia.nextInt();
	        boolean encontrado = false;
	        for (int i = 0; i < vetor.length; i++) {
	            if (vetor[i] == numero) {
	                System.out.println("O número " + numero + " foi encontrado na posição " + i + " do vetor.");
	                encontrado = true;
	                break;
	            }
	        }
	        if (!encontrado) {
	            System.out.println("Não foi encontrado!");
	        }
	    }
	}

