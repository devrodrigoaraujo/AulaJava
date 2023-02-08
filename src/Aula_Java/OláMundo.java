package Aula_Java;

import java.util.Scanner;

public class OláMundo {

	public static void main(String[] args) {
		
		String nome="Rodrigo Araujo";
		int idade=27;
		double altura=1.74,nota1,nota2,nota3,media;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\nSeu nome é: "+nome);
		System.out.println("\nSua idade é: "+idade);
		System.out.println("\nSua altura é: "+altura);
		
		System.out.println("\nEntre com a primeira nota:");
		nota1= leia.nextDouble();
		System.out.println("\nEntre com a segunda nota:");
		nota2= leia.nextDouble();
		System.out.println("\nEntre com a terceira nota:");
		nota3= leia.nextDouble();
		
		media= (nota1+nota2+nota3)/3;
		
		System.out.println("\nMédia do aluno "+nome+" foi de: "+media);
		System.out.printf("\nMédia do aluno %s foi de: %.2f e a nota 3 foi de : %.2f",nome,media,nota3);
		
	}

}
