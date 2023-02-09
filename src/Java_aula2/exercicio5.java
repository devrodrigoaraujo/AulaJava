package Java_aula2;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		// exercicio 5
		
		float media,n1,n2,n3;
	
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\nDigite a Nota 1");
		n1= leia.nextFloat();
		System.out.println("\nDigite a Nota 2");
		n2= leia.nextFloat();
		System.out.println("\nDigite a Nota 3");
		n3= leia.nextFloat();
		
		
		//p1=2,p2=3,p3=5
		
		media= ((n1*2)+(n2*3)+(n3*5))/(2+3+5);
		
		System.out.println("Media Ponderada é:" +media);
		
		
	}

}
