package Aula_Java5;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
	    int calm = 0;
	    int nervousWomen = 0;
	    int aggressiveMen = 0;
	    int calmOthers = 0;
	    int nervousOver40 = 0;
	    int calmUnder18 = 0;
	    
	    int count = 0;
	    while (count < 150) {
	      System.out.print("Digite a idade: ");
	      int age = input.nextInt();
	      System.out.print("Digite a identificação de gênero (1-feminino / 2-masculino / 3-Outros): ");
	      int gender = input.nextInt();
	      System.out.print("Digite a característica psicológica (1-calma / 2-nervosa / 3-agressiva): ");
	      int psychologicalCharacteristic = input.nextInt();
	      
	      if (psychologicalCharacteristic == 1) {
	        calm++;
	        if (gender == 1) {
	          if (age < 18) {
	            calmUnder18++;
	          }
	        } else if (gender == 3) {
	          calmOthers++;
	        }
	      } else if (psychologicalCharacteristic == 2) {
	        if (gender == 1) {
	          nervousWomen++;
	        }
	        if (age > 40) {
	          nervousOver40++;
	        }
	      } else if (psychologicalCharacteristic == 3) {
	        if (gender == 2) {
	          aggressiveMen++;
	        }
	      }
	      count++;
	    }
	    System.out.println("Número de pessoas calmas: " + calm);
	    System.out.println("Número de mulheres nervosas: " + nervousWomen);
	    System.out.println("Número de homens agressivos: " + aggressiveMen);
	    System.out.println("Número de outros calmos: " + calmOthers);
	    System.out.println("Número de pessoas nervosas com mais de 40 anos: " + nervousOver40);
	    System.out.println("Número de pessoas calmas com menos de 18 anos: " + calmUnder18);
	  }
	
	}


