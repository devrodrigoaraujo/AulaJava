package Aula_JavaExemplos;

import java.util.Scanner;

public class lacos_de_repeticoes_while2 {

	public static void main(String[] args) {

		// Cria uma instância para a entrada do usuário
		Scanner leia = new Scanner(System.in);

		// Declarando às variaveis
		int idade, sexo, categoria = 0, pessoas_back_end = 0, mulheres_front_end = 0, homens_mobile_quarenta = 0,
				mulheres_full_trinta = 0;
		String continua = "s";

		// Laço que irá repetir um questionário sobre a Idade, o Sexo e a Profissão.
		while (!continua.equals("n")) {

			// Entra com um valor para a idade
			System.out.println("Digite a idade: ");
			idade = leia.nextInt();

			// Entra com um valor para o Sexo
			System.out.println("\nDigite o Sexo: ");
			System.out.println("1 - Masculino");
			System.out.println("2 - Feminino ");
			System.out.println("3 - Outros");
			sexo = leia.nextInt();

			// Entre com um valor para o Cargo
			System.out.println("\nDigite a Categoria: ");
			System.out.println("1 – Backend");
			System.out.println("2 – Frontend");
			System.out.println("3 – Mobile");
			System.out.println("4 - FullStack");
			categoria = leia.nextInt();

			// Um Menu que perguntara ao usuário se vão querer continuar
			System.out.println("\n++++++++++++++++MENU++++++++++++++++++");
			System.out.println("\nDeseja continuar: ");
			System.out.println("\nSim (S) / Nâo(N)");
			continua = leia.next();
			System.out.println("++++++++++++++++++++++++++++++++++");

			// Laços condicionais para distribuir as pessoas de acordo com a sua Idade, seu Sexo e seu Cargo
			if (categoria == 1) {
				pessoas_back_end++;
			} if (categoria == 2) {
				if (sexo == 2) {
					mulheres_front_end++;
				}
			} if (categoria == 3) {
				if (sexo == 1) {
					if (idade > 40) {
						homens_mobile_quarenta++;
					}
				}
			} if (categoria == 4) {
				if (sexo == 2) {
					if (idade < 30) {
						mulheres_full_trinta++;
					}
				}
			}

		}

		// Mostra na tela do usuario
		System.out.printf("\nTotal de pessoas desenvolvedoras Backend: %d", pessoas_back_end);
		System.out.printf("\nTotal de mulheres desenvolvedoras Frontend: %d", mulheres_front_end);
		System.out.printf("\nTotal de homens desenvolvedores Mobile maiores de 40 anos: %d", homens_mobile_quarenta);
		System.out.printf("\nTotal de mulheres desenvolvedoras FullStack menores de 30 anos: %d", mulheres_full_trinta);

	}

}