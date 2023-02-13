package Aula_Java5;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner leia = new Scanner(System.in);
		    int num, sum = 0;

		    do {
		      System.out.print("Digite um número (0 para encerrar): ");
		      num = leia.nextInt();
		      sum += num;
		      
		    } while (num != 0);

		    System.out.println("A soma dos números digitados é: " + sum);
	}

}
