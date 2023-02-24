package Aula_JavaExemplos;

import java.util.Scanner;

public class CorrecaoExer7 {

	public static void main(String[] args) {
		
		float a,b,c,d,e,f,x,y;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com o valor de A: ");
		a = leia.nextFloat();
		System.out.println("\nEntre com o valor de B: ");
		b = leia.nextFloat();
		System.out.println("\nEntre com o valor de C: ");
		c = leia.nextFloat();
		System.out.println("\nEntre com o valor de D: ");
		d = leia.nextFloat();
		System.out.println("\nEntre com o valor de E: ");
		e = leia.nextFloat();
		System.out.println("\nEntre com o valor de F: ");
		f = leia.nextFloat();
		
		x = (c*e - b*f) / (a*e - b*d);
		y = (a*f - c*d)/ (a*e - b*d);
		
		System.out.println("\nO valor de X foi de: "+x);
		System.out.println("\nO valor de Y foi de: "+y);

	}

}