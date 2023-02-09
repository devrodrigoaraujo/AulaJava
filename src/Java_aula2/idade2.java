package Java_aula2;

import java.util.Scanner;

public class idade2 {

	public static void main(String[] args) {
		// Exercicio 2
		
        int idadeEmDias,anos,meses,dias;
		
		Scanner leia = new Scanner (System.in);
		
			
		System.out.println("\nEntre com a Idade em Dias:");
		idadeEmDias= leia.nextInt();
	
        // dias=1;		
		//meses=30;
		//anos=365;
	
	     anos=idadeEmDias/365;
		 meses=(idadeEmDias % 365) / 30;
		 dias=(idadeEmDias % 365) % 30;
		    
		    System.out.println(anos +" anos, " + meses +" meses e "+ dias +" dias");
		

	}

}
