package Aula_Java2;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		// Exercicio6
		
		
		double d,x1,y1,x2,y2,p1,p2;
		
		Scanner leia= new Scanner(System.in);
		
		System.out.println("\nDigite o Valor de X1");
		x1= leia.nextDouble();
		
		System.out.println("\nDigite o Valor de Y1");
		y1= leia.nextDouble();
		
		System.out.println("\nDigite o Valor de X2");
		x2= leia.nextDouble();
		
		System.out.println("\nDigite o Valor de Y2");
		y2= leia.nextDouble();
		
		
		
		p1= Math.pow((x2-x1),2);
		p2=Math.pow((y2-y1),2);
		
		
		d = Math.sqrt((p1+p2));
		
		
		
				 System.out.println(" Logo o Resultado de D é:"+ d);

	
	
	
	
	
	
	
	
	
	
	
	
	}

}
