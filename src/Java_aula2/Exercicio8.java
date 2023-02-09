package Java_aula2;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		// Exercicio 8
		
		
		 double custo,fb,impostos,distribuidor,p1;
		
		 Scanner leia= new Scanner (System.in);
		 
		 System.out.printf("Escreva o custo de Fabrica:");
		fb= leia.nextDouble();
		
		distribuidor= fb*0.28;
		impostos= fb*0.45;
		
		 custo = fb+distribuidor+impostos;
		 
		 
		 System.out.println("Custo para o consumidor R$.2f: "+custo);
		 
		 

		 
		 
		
		
		
		
		
		
		
		
		
	}

}
