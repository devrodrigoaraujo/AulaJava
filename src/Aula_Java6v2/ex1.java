package Aula_Java6v2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ex1 {

    public static void main(String[] args) {
        
        // Criando um ArrayList de Strings
        ArrayList<String> cores = new ArrayList<String>();
        
        // Criando um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Solicitando ao usuário que digite 5 cores
        System.out.println("Digite 5 cores:");
        for(int i=0; i<5; i++) {
            String cor = scanner.nextLine();
            cores.add(cor);
        }
        
        // Mostrando na tela todas as cores adicionadas
        System.out.println("\nListar todas as cores:");
        for(String cor : cores) {
            System.out.println(cor);
        }
        
        // Ordenando as cores em ordem crescente
        Collections.sort(cores);
        
        // Mostrando na tela as cores em ordem crescente
        System.out.println("\nOrdenar as cores:");
        for(String cor : cores) {
            System.out.println(cor);
        }
        
        // Fechando o objeto Scanner
        scanner.close();
    }

}
