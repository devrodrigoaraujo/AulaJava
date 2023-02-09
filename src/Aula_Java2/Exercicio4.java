package Aula_Java2;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			
		
		double A,B,C,D,R,S;
		
		
		
		Scanner leia = new Scanner (System.in);
		
		
		System.out.println("\nEntre com o valor de A: ");
	      A= leia.nextDouble();
	      
	      System.out.println("\nEntre com o valor de B: ");
	      B= leia.nextDouble();
	      
	      System.out.println("\nEntre com o valor de C: ");
	      C= leia.nextDouble();
	      
	     
	    
	      S=Math.pow((B+C),2);
	      
	      
	      R=Math.pow((A+B),2);
	     
	     
	      D= (R+S)/2;
	      
	      System.out.println(" Resultado de S é:, "+S + " Resultado de R é:"+ R+ " Logo o Resultado de D é:"+ D);
	     
	      
	      
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
