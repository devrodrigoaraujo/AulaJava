package Aula_Java3;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		// ex8
		
	    Scanner leia = new Scanner(System.in);
	    
	    
        double saldo = 1000.00, saque;
	    int operacao;

	    System.out.println("Operação - 1: Saldo");
	    System.out.println("Operação - 2: Saque");
	    System.out.println("Operação - 3: Depósito");
	    System.out.print("Digite a operação desejada: ");
	    operacao = leia.nextInt();

	    switch (operacao) {
	      case 1:
	        System.out.println("Operação - Saldo");
	        System.out.println("Saldo: R$ " + saldo);
	        break;
	      case 2:
	        System.out.print("Digite o valor do saque: R$ ");
	         saque = leia.nextFloat();
	        if (saque > saldo) {
	          System.out.println("Operação - Saque");
	          System.out.println("Saldo Insuficiente!");
	        } else {
	          saldo -= saque;
	          System.out.println("Operação - Saque");
	          System.out.println("Novo Saldo: R$ " + saldo);
	        }
	        break;
	      case 3:
	        System.out.print("Digite o valor do depósito: R$ ");
	        float deposito = leia.nextFloat();
	        saldo += deposito;
	        System.out.println("Operação - Depósito");
	        System.out.println("Novo Saldo: R$ " + saldo);
	        break;
	      default:
	        System.out.println("Operação Inválida!");
	        break;
	    }
	  }
	}