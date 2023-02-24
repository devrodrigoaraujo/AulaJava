package Aula_JavaExemplos;

public class Vetor {

	public static void main(String[] args) {
		
		String cachorro[] = { "Boxer", "Pastor AlemÃ£o", "Corgi" };
		//int x;
		
		for(int x = 0; x <= 2; x++) {
			System.out.println("Cachorro: " + cachorro[x]);
		}
		
		System.out.println("\nTamanho: " + cachorro.length);
		
	}

}