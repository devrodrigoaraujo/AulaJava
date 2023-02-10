package Aula_Java4;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// ex4
		

		
		    Scanner leia = new Scanner(System.in);

		    int backend = 0,frontendfem = 0,mobilemascmaior40 = 0,fullstackfem30menos = 0;
		    int idade,genero,categoria;

		    String continueReading;
		    do {
		      System.out.print("Digite a Idade: ");
		    idade = leia.nextInt();

		      System.out.print("Digite o Sexo (1 - Masculino, 2 - Feminino, 3 - Neutro): ");
		      genero = leia.nextInt();

		      System.out.print("Digite a Categoria (1 - Backend, 2 - Frontend, 3 - Mobile, 4 - FullStack): ");
		      categoria = leia.nextInt();

		      switch (categoria) {
		        case 1:
		        	backend++;
		          break;
		        case 2:
		          if (genero == 2) {
		        	  frontendfem++;
		          }
		          break;
		        case 3:
		          if (genero == 1 && idade > 40) {
		        	  mobilemascmaior40++;
		          }
		          break;
		        case 4:
		          if (genero == 2 && idade < 30) {
		        	  fullstackfem30menos++;
		          }
		          break;
		      }

		      System.out.print("Deseja continuar (S/N): ");
		      continueReading = leia.next();
		    } while (continueReading.equalsIgnoreCase("S"));

		    System.out.println("\nTotal de pessoas desenvolvedoras Backend: " + backend);
		    System.out.println("Total de mulheres desenvolvedoras Frontend: " + frontendfem);
		    System.out.println("Total de homens desenvolvedores Mobile maiores de 40 anos: " + mobilemascmaior40);
		    System.out.println("Total de mulheres desenvolvedoras FullStack menores de 30 anos: " + fullstackfem30menos);
		  }
		
	
	}

