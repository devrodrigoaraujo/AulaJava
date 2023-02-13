package Aula_Java5;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
	    int num, sum = 0, count = 0;
	    do {
	      System.out.print("Digite um número inteiro (0 para sair): ");
	      num = sc.nextInt();
	      if (num != 0 && num % 3 == 0) {
	        sum += num;
	        count++;
	      }
	    } while (num != 0);
	    if (count == 0) {
	      System.out.println("Não há números múltiplos de 3");
	    } else {
	      System.out.println("A média dos números múltiplos de 3 é: " + (double)sum/count);
	    }
	  }
	}