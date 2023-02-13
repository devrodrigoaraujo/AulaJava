package Aula_Java5;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// exercicio2
		
		Scanner leia= new Scanner (System.in); //função de ler
		
		int num, par=0,impar=0; // variaveis
		
			
		for(num=1; num <=10;num++){  // for sintaxe base
			System.out.print("\n Insira o número"+num);
		num= leia.nextInt();

			if(num % 2==0) {
                par=par+1;
					
			}
		else {
			impar++;
}
	
			
		}
		
		System.out.println("A soma dos números pares são:"+par);
		System.out.println("A soma dos números impares são:"+impar);
		

	}
}
