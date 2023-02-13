package Aula_Java5;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		//Exercicio3
		
		Scanner leia= new Scanner (System.in);
		
		int menos21=0, mais50=0, idade;
		
		 do {
	            System.out.print("Informe a idade: ");
	            idade = leia.nextInt();
	            if (idade < 21) {
	                menos21++;
	            }
	            if (idade > 50) {
	                mais50++;
	            }
	        } while (idade != -99);

	        System.out.println("Total de pessoas com menos de 21 anos: " + menos21);
	        System.out.println("Total de pessoas com mais de 50 anos: " + mais50);
	    }
	}
