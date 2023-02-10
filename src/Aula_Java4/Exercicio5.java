package Aula_Java4;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
//ex5
		
		
		Scanner leia = new Scanner(System.in);
	    int num, sum = 0;

	    do {
	      System.out.print("Digite um número: ");
	      num = leia.nextInt();
	      if (num > 0) {
	        sum += num;
	      }
	    } while (num != 0);

	    System.out.println("A soma dos números positivos é: " + sum);
	  }
	}

