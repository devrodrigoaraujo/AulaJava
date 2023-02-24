package Aula_JavaExemplos;

import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int n;//numero
        int qtd=0; //quantidade de multiplos
        int media=0; //media
        int p1=0; //parte 1 da media
        
        do {
            System.out.println("Digite um número:");
            n = s.nextInt();
            
            if(n%3==0 && n!=0) {
                p1+=n;
                qtd++;
            }
            
        }while(n!=0);
        media = p1/qtd;
        
        System.out.println("A média de todos os números múltiplos de 3 é: "+media);

    }

}