package Aula_JavaExemplos;

import java.util.ArrayList;
import java.util.Scanner;

public class Numeros {
	
	public static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		
		int numero;
		
		ArrayList<Integer> numeros = new ArrayList<Integer>();

		for(int i=0; i<10; i ++) {
			numeros.add(i+1);
		}
		
		for(var num : numeros) {
			System.out.println(num);
		}
		
		System.out.println("\nDigite um Número: ");
		numero =  leia.nextInt();
		
		if (numeros.contains(numero))
			System.out.println("O número " + numero + " foi encontrado, na posição: " + numeros.indexOf(numero));
		else
			System.out.println("O número " + numero + " não foi encontrado!");
		
		
	}

}