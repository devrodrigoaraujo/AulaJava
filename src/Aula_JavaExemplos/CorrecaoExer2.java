package Aula_JavaExemplos;

import java.util.Scanner;

public class CorrecaoExer2 {

	public static void main(String[] args) {
		
		int totaldias,anos,meses,dias;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\nEntre com quantos dias você já viveu: ");
		totaldias = leia.nextInt();//1000
		
		anos = totaldias / 365;//2 anos
		meses = (totaldias % 365)/30;//270 / 30 = 9 meses
		dias = (totaldias % 365)%30;//270 % 30 = 0 dia
		
		System.out.println("\nVocê viveu: "+anos+" ano(s), "+meses+" mes(es) e "+dias+" dia(s) de vida...");

	}

}