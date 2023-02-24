package Aula_JavaExemplos;

public class Celular extends Telefone{

	public Celular() {
		super("Telefone Celular");
		
	}
	
	@Override
	public void toca(int codigoToque) {
		switch(codigoToque) {
		case 1:
			System.out.println("tãtãtãranran tãtã");
			break;
		case 2:
			System.out.println("Blim blim blim");
			break;
			default:
				System.out.println("Parãrã Parãrã Parãrã");
		}
	}
	
	@Override
	public void disca(String numero) {
		System.out.println("O número: "+numero+" é um celular...");
	}

	
	
}