package Aula_JavaExemplos;

import java.util.ArrayList;
import java.util.Scanner;

public class Collection2 {

	public static void main(String[] args) {
		
		int op;
		Scanner leia = new Scanner(System.in);
		
		ArrayList<String> estoque = new ArrayList();
		
		do {
			
			System.out.println("\n-------------------------------------------------");
			System.out.println("\n(1) Deseja adicionar produtos ao estoque?");
			System.out.println("\n(2) Deseja remover produtos do estoque?");
			System.out.println("\n(3) Deseja atualizar produtos do estoque?");
			System.out.println("\n(4) Deseja mostrar todos os produtos do estoque?");
			System.out.println("\n(0) Deseja sair do sistema de estoque?");
			System.out.println("\n-------------------------------------------------");
			System.out.println("\nPor favor, digite sua opção: ");
			op = leia.nextInt();
			
			switch(op) {
			case 1:
				leia.nextLine();
				System.out.println("\nDigite o produto que deseja adicionar ao estoque: ");
				String produto = leia.nextLine();
				estoque.add(produto);
			break;
			case 2:
				leia.nextLine();
				System.out.println("\nDigite o produto que deseja remover: ");
				String produtor = leia.nextLine();
				if(estoque.contains(produtor)) {
					estoque.remove(produtor);
				}
				else
				{
					System.out.println("\nProduto não existe!!!");
				}
			break;
			case 3:
				leia.nextLine();
				System.out.println("\nDigite o nome do produto que você quer atualizar: ");
				String verifica = leia.nextLine();
				System.out.println("\nDigite o nome do produto que entrará no lugar do "+verifica+" :");
				String novo = leia.nextLine();
				
				if(estoque.contains(verifica)) {
					estoque.remove(verifica);
					estoque.add(novo);
				}
				else
				{
					System.out.println("\nProduto não existe!!!");
				}
			break;
			case 4:
				System.out.println("\nOs produtos do estoque são: ");
				System.out.println(estoque);
			break;
			case 0:
				System.out.println("\nMuito obrigado em utilizar do nosso sistema, volte sempre!!!");
			break;
			default:
				System.out.println("\nOpção inválida!!!");
				
			}
			
		}while(op !=0);

	}

}