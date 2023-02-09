package Aula_Java;

import java.util.Scanner;

public class Calculo_produto {

	public static void main(String[] args) {
		//Exercicio 4
		
	      		
					Scanner leia = new Scanner (System.in);
					
					 double nota1,nota2,nota3,nota4,media;
					
					System.out.println("\nEntre com a primeira nota:");
					nota1= leia.nextDouble();
					System.out.println("\nEntre com a segunda nota:");
					nota2= leia.nextDouble();
					System.out.println("\nEntre com a terceira nota:");
					nota3= leia.nextDouble();
					System.out.println("\nEntre com a quarta nota:");
					nota4= leia.nextDouble();
					
				media= (nota1+nota2)-(nota3*nota4);
					
				    System.out.printf("\nMédia do aluno foi de: %.1f ",media);

	}

}
