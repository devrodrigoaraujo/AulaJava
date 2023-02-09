package Aula_Java;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		//Exercício 2
		
        double nota1,nota2,nota3,nota4,media;
		
		Scanner leia = new Scanner (System.in);
		
		
		System.out.println("\nEntre com a primeira nota:");
		nota1= leia.nextDouble();
		System.out.println("\nEntre com a segunda nota:");
		nota2= leia.nextDouble();
		System.out.println("\nEntre com a terceira nota:");
		nota3= leia.nextDouble();
		System.out.println("\nEntre com a quarta nota:");
		nota4= leia.nextDouble();
		
		media= (nota1+nota2+nota3+nota4)/4;
		
	    System.out.printf("\nMédia do aluno foi de: %.1f ",media);

	}

}
