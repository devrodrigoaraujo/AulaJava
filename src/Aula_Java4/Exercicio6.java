package Aula_Java4;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		// ex6
		   Scanner leia = new Scanner(System.in);
		    int num, contar = 0;
		    double sum = 0, media;
		    
		    do {
		      System.out.print("Digite um número: ");
		      num = leia.nextInt();
		      
		      if (num != 0 && num % 3 == 0) {
		        sum += num;
		        contar++;
		      }
		    } while (num != 0);
		    
		    if (contar == 0) {
		      System.out.println("Não houve números múltiplos de 3 digitados.");
		    } else {
		       media = sum / contar;
		      System.out.printf("A média de todos os números múltiplos de 3 é: %.1f\n", media);
		    }
		
	}

}
