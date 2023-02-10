package Aula_Java4;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// ex1

		Scanner leia = new Scanner(System.in);
        
		int i,primeiron, segundon;

        System.out.print("Digite o primeiro número do intervalo: ");
        primeiron = leia.nextInt();
        System.out.print("Digite o último número do intervalo: ");
        segundon = leia.nextInt();

        if (primeiron >= segundon) {
            System.out.println("Intervalo inválido!");
            return;
        }

        System.out.println("No Intervalo entre " + primeiron + " e " + segundon + ":");

        for ( i = primeiron; i <= segundon; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + " é múltiplo de 3 e 5");
            }
        }		
		
	}

}
