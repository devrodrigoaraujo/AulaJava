package Aula_Java6v2;

import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

public class ex3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Set<Integer> set = new HashSet<Integer>();

        // Entrada de dados
        System.out.println("Digite 10 valores inteiros não repetidos:");

        for (int i = 1; i <= 10; i++) {
            System.out.print("Valor " + i + ": ");
            int valor = input.nextInt();

            // Verifica se o valor já foi adicionado
            if (set.contains(valor)) {
                System.out.println("Valor repetido, digite novamente!");
                i--;
            } else {
                set.add(valor);
            }
        }

        // Saída de dados utilizando o Iterator
        System.out.println("\nListar dados do Set:");
        Iterator<Integer> iterator = set.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
