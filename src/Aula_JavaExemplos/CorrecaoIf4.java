package Aula_JavaExemplos;

import java.util.Scanner;

public class CorrecaoIf4 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		String palavra1,palavra2,palavra3;
		
		System.out.println("\nEntre com a primeira palavra: ");
		palavra1 = ler.next();
		System.out.println("\nEntre com a segunda palavra: ");
		palavra2 = ler.next();
		System.out.println("\nEntre com a terceira palavra: ");
		palavra3 = ler.next();
		
		if(palavra1.equalsIgnoreCase("vertebrado")) {
			if(palavra2.equalsIgnoreCase("ave")) {
				if(palavra3.equalsIgnoreCase("carnivoro")) {
					System.out.println("\nÉ uma aguia");
				}else {
					System.out.println("\nÉ uma pomba");
				}
			}else {
				if(palavra3.equalsIgnoreCase("onivoro")) {
					System.out.println("\nÉ um ser humano");
				}else {
					System.out.println("\nÉ uma vaca");
				}
			}
		}else {
			if(palavra2.equalsIgnoreCase("inseto")) {
				if(palavra3.equalsIgnoreCase("hematofago")) {
					System.out.println("\nÉ uma pulga");
				}else {
					System.out.println("\nÉ uma lagarta");
				}
			}else {
				if(palavra3.equalsIgnoreCase("hematofago")) {
					System.out.println("\nÉ uma sanguessuga");
				}else {
					System.out.println("\nÉ uma minhoca");
				}
			}
		}

	}

}