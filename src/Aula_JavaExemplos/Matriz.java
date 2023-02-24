package Aula_JavaExemplos;

public class Matriz {

	public static void main(String[] args) {
		
		int matriz[][] = { {1,2}, {3,4} };
		//int matriz2[][] = new int[2][3];
		
		for (int indiceLinha = 0; indiceLinha < 2; indiceLinha++) {
            for (int indiceColuna = 0; indiceColuna < 2; indiceColuna++) {
                System.out.println(
                    "O valor armazenado na posição [" + indiceLinha + "][" + indiceColuna + "] é: " + matriz[indiceLinha][indiceColuna]);
            }
        }
	}
}