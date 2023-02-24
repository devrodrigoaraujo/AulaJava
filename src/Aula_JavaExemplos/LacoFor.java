package Aula_JavaExemplos;

import java.util.Scanner;

public class LacoFor {

	public static void main(String[] args) {
		
		float n1,n2,n3,media,somaMedia=0,mg;
		int x;
		
		Scanner leia = new Scanner(System.in);
		
		for(x=1;x<=4;x++)//x = x + 1  x-- x = x - 1
		{
			System.out.println("\nEntre com a primeira nota: ");
			n1 = leia.nextFloat();
			System.out.println("\nEntre com a segunda nota: ");
			n2 = leia.nextFloat();
			System.out.println("\nEntre com a terceira nota: ");
			n3 = leia.nextFloat();
			media = (n1+n2+n3)/3;//8  7  5  8
			System.out.println("\nMédia do alune "+x+" foi de: "+media);
			
			somaMedia += media;//somaMedia = somaMedia + media 28
		}
		mg = somaMedia / (x-1);
		
		System.out.printf("\nMédia geral: %.2f",mg);

	}

}