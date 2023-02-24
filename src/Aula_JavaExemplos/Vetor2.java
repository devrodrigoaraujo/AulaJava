package Aula_JavaExemplos;

import java.util.Scanner;

public class Vetor2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		String nomes[] = new String[3];
		
		for(int x = 0; x < nomes.length; x++) {
			System.out.println("Insira um nome: ");
			nomes[x] = leia.nextLine();
		}
		
		for(int x = 0; x < nomes.length; x++) {
			System.out.println("Nomes: " + nomes[x]);
		}

	}

}