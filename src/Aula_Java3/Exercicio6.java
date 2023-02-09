package Aula_Java3;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		// ex6
		
		Scanner leia = new Scanner(System.in);
		
		String nc,cargo;
		
		int codcargo; 		
		double sl,reajuste,nsl;
		
				
		System.out.print("\n\t\tReajuste Salarial");
		System.out.print("\nDigite o nome do colaborador: ");
        nc = leia.nextLine();
        System.out.print("Digite o código do cargo do colaborador (1 a 6): ");
        codcargo = leia.nextInt();
        System.out.print("Digite o salário do colaborador: ");
        sl = leia.nextFloat();
        
        reajuste=0;
        cargo= "";
        
               
        switch (codcargo) {
        case 1:
            cargo = "Gerente";
            reajuste = 0.1;
            break;
        case 2:
            cargo = "Vendedor";
            reajuste = 0.07;
            break;
        case 3:
            cargo = "Supervisor";
            reajuste = 0.09;
            break;
            
        case 4:
            cargo = "Motorista";
            reajuste = 0.06;
            break;
            
        case 5:
            cargo = "Estoquista";
            reajuste = 0.05;
            break;
            
        case 6:
            cargo = "Tecnico de TI";
            reajuste = 0.08;
            break;
        default:
			System.out.println("\nCódigo de Cargo Inválido");
						      }
        
        nsl= sl + (reajuste * sl);	
        
        System.out.println("Nome do colaborador:"+ nc);     
        System.out.println("Cargo:"+ cargo); 
        System.out.println("Novo Salário:"+ nsl); 
                    
                              
}
}