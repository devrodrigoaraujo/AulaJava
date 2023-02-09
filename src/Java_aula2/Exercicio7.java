package Java_aula2;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		// Exercicio 7
		
         
		
		int a,b,c,d,e,f,x,y;
		
		Scanner leia = new Scanner (System.in);
 
      System.out.println("\nEntre com o valor de A: ");
      a= leia.nextInt();
      
      System.out.println("\nEntre com o valor de B: ");
      b= leia.nextInt();
      
      System.out.println("\nEntre com o valor de C: ");
      c= leia.nextInt();
      
      System.out.println("\nEntre com o valor de D: ");
      d= leia.nextInt();
      
      System.out.println("\nEntre com o valor de E: ");
      e= leia.nextInt();
      
      System.out.println("\nEntre com o valor de F: ");
      f= leia.nextInt();
      
          
      x=((c*e)-(b*f)) / ((a*e)-(b*d));
      y=((a*f)-(c*d)) / ((a*e)-(b*d));
      
      System.out.println(" Resultado de x é: "+x + "\n Resultado de y é:"+ y);
      
		
		
		
		
	}

}
