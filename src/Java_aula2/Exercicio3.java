package Java_aula2;

import java.util.Scanner;

public class Exercicio3  {

	public static void main(String[] args) {
		//Exercicio 3
	
	
		
        int duracaodoevento,segundos,minutos,horas;
            
		
		Scanner leia = new Scanner (System.in);
		
			
		System.out.println("\nEntre com a duração de um evento em segundos:");
		duracaodoevento= leia.nextInt();
	
         // segundos=1;		
		 //minutos=60;
		 //horas=3600;
	
	     horas=duracaodoevento/3600;
		 minutos=(duracaodoevento % 3600) / 60;
		 segundos=(duracaodoevento % 3600) % 60;
		    
		 System.out.println(horas +" horas, " + minutos +" minutos e "+ segundos +" segundos");

	}

}
