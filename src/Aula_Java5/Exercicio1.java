package Aula_Java5;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// Ex1
		
		Scanner leia= new Scanner(System.in);
		
		int num;
	
		System.out.println("\n\nOs números que divididos por 11 e tem resto de divisão 5 são:");
		for (num= 1000; num <= 1999; num++) {
	
		if(num%11==5) {
	         
			
			System.out.println("\t\t\t\t\t\t\t\t"+num);
		}
		} 
		
		

		
		
	}

}
