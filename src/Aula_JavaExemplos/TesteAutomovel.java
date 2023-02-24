package Aula_JavaExemplos;

public class TesteAutomovel {

	public static void main(String[] args) {
		
		//instanciando um objeto da classe Automovel
		
		Automovel auto1 = new Automovel("Ana Sophia","Mercedez AMG","BCR6942",2023);
		
		auto1.imprimirInfo();
		
		System.out.println("\nTranferência de Proprietarie");
		auto1.setNomeProprietario("Elissandro");
		auto1.imprimirInfo();
		
		System.out.println("\nMudança de placa");
		auto1.setPlaca("PVH8B09");
		auto1.imprimirInfo();

	}

}