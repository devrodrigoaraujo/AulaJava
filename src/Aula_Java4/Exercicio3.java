package Aula_Java4;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// ex3

		  Scanner leia = new Scanner(System.in);

		    int idade, totalMenores = 0, totalMaiores = 0;

		    System.out.print("Digite uma idade: ");
		    idade = leia.nextInt();

		    while (idade >= 0) {
		      if (idade < 21) {
		        totalMenores++;
		      } else if (idade > 50) {
		        totalMaiores++;
		      }
		      System.out.print("Digite uma idade: ");
		      idade = leia.nextInt();
		    }

		    System.out.println("Total de pessoas menores de 21 anos: " + totalMenores);
		    System.out.println("Total de pessoas maiores de 50 anos: " + totalMaiores);
	
	
	}

}
