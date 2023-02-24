package Aula_Java6v2;

import java.util.*;

public class ex4 {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>(Arrays.asList(2, 5, 1, 3, 4, 9, 7, 8, 10, 6));

        System.out.println("Digite o número que você deseja encontrar:");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        if (set.contains(num)) {
            System.out.println("O número " + num + " foi encontrado!");
        } else {
            System.out.println("O número " + num + " não foi encontrado!");
        }
    }
}
