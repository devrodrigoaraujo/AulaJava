package Aula_Java2;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
// Exercicio 1 
		
		int idade,mes,dia,dAno;
		
		Scanner leia = new Scanner (System.in);
		
		
		
		System.out.println("\nEntre com a Idade:");
		idade= leia.nextInt();
		System.out.println("\nEntre com o Mês:");
		mes= leia.nextInt();
		System.out.println("\nEntre com a Dia:");
		dia= leia.nextInt();
				
	
	    dAno= (idade*365)+ (mes*30)+dia;
		
		System.out.println("sua idade em dias é:"+dAno);
		
		//System.out.println("sua Idade em dias é:"+dia_ano);
		
				
		
		
	  

		
		
		

	}

}
