package Aula_Java3;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		//Ex 1
		
		
		double a,b,c,soma;
		
		Scanner leia = new Scanner(System.in);
		
		
		System.out.println("\nEntre como valor A: ");
		a = leia.nextDouble();
		System.out.println("\nEntre como valor B: ");
		b = leia.nextDouble();
		System.out.println("\nEntre como valor C: ");
		c = leia.nextDouble();
		
		soma = a+b;
		
		if(soma>c) {
			System.out.printf("\nA Soma de A + B é Maior do que C",c);
		}
		else if(soma<c) {
			System.out.printf("\nA Soma de A + B é Menor do que C",c);
		}
		else if (soma == c) {
		System.out.printf("\n\nA Soma de A + B é Igual a C",c);
		
		}
	}
}
