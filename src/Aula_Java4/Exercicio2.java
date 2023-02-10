package Aula_Java4;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// Ex2

		Scanner leia = new Scanner(System.in);
	    int i,num, totalPar = 0, totalImpar = 0;

	    for (i = 1; i <= 10; i++) {
	      System.out.print("Digite o " + i + "º número: ");
	      num = leia.nextInt();

	      if (num % 2 == 0) {
	        totalPar++;
	      } else {
	        totalImpar++;
	      }
	    }

	    System.out.println("Total de números pares: " + totalPar);
	    System.out.println("Total de números ímpares: " + totalImpar);
	}

}
