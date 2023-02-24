package Aula_JavaExemplos;

import java.util.Scanner;

public class ArrayVetor {

	public static void main(String[] args) {
		//final int x=4;
		float[] media = new float[4]; 
		float n1,n2,n3,somaMedia=0,mg;
		int x;
		
		Scanner leia = new Scanner(System.in);
		
		for(x=0;x<media.length;x++) {
			System.out.println("\nEntre com a primeira nota: ");
			n1 = leia.nextFloat();
			System.out.println("\nEntre com a segunda nota: ");
			n2 = leia.nextFloat();
			System.out.println("\nEntre com a terceira nota: ");
			n3 = leia.nextFloat();
			
			media[x] = (n1+n2+n3)/3;
			System.out.println("\nMédia: "+media[x]);
			somaMedia += media[x];//somaMedia = somaMedia + media[x]
		}
		
		mg = somaMedia / 4;
		System.out.printf("\nMédia geral da turma foi de: %.2f",mg);

		for(x=0;x<4;x++) {
			System.out.println("\nMédia do alune"+(x+1)+" foi de: "+media[x]);
		}
	}

}