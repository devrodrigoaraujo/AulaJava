package Aula_Java2;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
// Exercicio 1 
		
		int Idade,Mes,Dia,dia_mes,dia_ano;
		
		Scanner leia = new Scanner (System.in);
		
		
		
		System.out.println("\nEntre com a Idade:");
		Idade= leia.nextInt();
		System.out.println("\nEntre com o Mês:");
		Mes= leia.nextInt();
		System.out.println("\nEntre com a Dia:");
		Dia= leia.nextInt();
				
		dia_mes=30;
		dia_ano=365;
				
		dia_mes=dia_mes*Mes;
		Idade=Idade*dia_ano;
		dia_ano=dia_ano+Idade+dia_mes;
		
		System.out.println("sua Idade em dias é:"+dia_ano);
		
				
		
		
	  

		
		
		

	}

}
