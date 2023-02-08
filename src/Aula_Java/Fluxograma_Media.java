package Aula_Java;

import java.util.Scanner;

public class Fluxograma_Media {

	public static void main(String[] args) {
		
		        //Exercício 1
		
				Float Salario,Abono,NovoSalario;
					
						
				Scanner leia = new Scanner (System.in);		
				
					
				System.out.println("\nEntre com o Salario:");
				Salario= leia.nextFloat();
				
				System.out.println("\nEntre com o Abono:");
				Abono= leia.nextFloat();
						
				NovoSalario= Salario+Abono;
				
				
				System.out.printf("\nNovo Salário foi de: %.2f ",NovoSalario);
				
				
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
