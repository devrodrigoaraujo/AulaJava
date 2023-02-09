package Aula_Java3;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		// ex7

		Scanner leia = new Scanner(System.in);
       
		float num1, num2, resultado;
        int operacao;

        System.out.println("Digite o 1º número: ");
        num1 = leia.nextFloat();
        System.out.println("Digite o 2º número: ");
        num2 = leia.nextFloat();
        System.out.println("Operação (1-Soma, 2-Subtração, 3-Multiplicação, 4-Divisão): ");
        operacao = leia.nextInt();

        switch (operacao) {
            case 1:
                resultado = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + resultado);
                break;
            case 2:
                resultado = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + resultado);
                break;
            case 3:
                resultado = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + resultado);
                break;
            case 4:
                resultado = num1 / num2;
                System.out.println(num1 + " / " + num2 + " = " + resultado);
                break;
            default:
                System.out.println("Operação Inválida!");
        }
    }
}