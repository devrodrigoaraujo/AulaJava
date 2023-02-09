package Aula_Java3;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// ex3
		
		Scanner leia = new Scanner(System.in);
		
		
		String nomeDoador;
		int idadeDoador;
		boolean primeiraDoacao;
		

        System.out.print("Digite o Nome do doador: ");
        nomeDoador = leia.nextLine();

        System.out.print("Digite a Idade do doador: ");
        idadeDoador = leia.nextInt();

        System.out.print("Primeira doação de sangue? ");
         primeiraDoacao = leia.nextBoolean();

        if (idadeDoador >= 18 && idadeDoador <= 69) {
            
        	
        	if (idadeDoador >= 60 && idadeDoador <= 69 && !primeiraDoacao) {
                System.out.println(nomeDoador + " está apto para doar sangue!");
            
        	
            } else if (idadeDoador < 60) {
                System.out.println(nomeDoador + " está apto para doar sangue!");
            
                
        	} else {
                System.out.println(nomeDoador + " não está apto para doar sangue!");
            }
        
        
        } else {
            System.out.println(nomeDoador + " não está apto para doar sangue!");

		
		
		
		
		
		
		
		
		
        }	
		
		
	}

}
