package Aula_JavaExemplos;

import java.util.Scanner;

public class CorrecaoIf2 {

	public static void main(String[] args) {
		
		int num;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com um número: ");
		num = leia.nextInt();
		
		if(num % 2 == 0) {
			if(num>=0) {
				System.out.println("\nNúmero par e positivo!!!");
			}
			else {
				System.out.println("\nNúmero par e negativo!!!");
			}
		}else {
			if(num>0) {
				System.out.println("\nNúmero ímpar e positivo!!!");
			}else {
				System.out.println("\nNúmero ímpar e negativo!!!");
			}
		}

	}

}