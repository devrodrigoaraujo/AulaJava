package Aula_Java;

import java.util.Scanner;

public class salario_liquido {

	public static void main(String[] args) {
		
    
		float sb,an,he,d,sl;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\nEntre com o Salário Bruto:");
		sb= leia.nextFloat();
		System.out.println("\nEntre com o Adicional Noturno:");
		an= leia.nextFloat();
		System.out.println("\nEntre com o Horas Extras:");
		he= leia.nextFloat();
		System.out.println("\nEntre com o Descontos:");
		d= leia.nextFloat();
		
		
		sl= sb+an+(he*5)-d;
		
		System.out.printf("\nO Salário Líquido é: %.1f ",sl);
		
		
		
		
		
	}

}
