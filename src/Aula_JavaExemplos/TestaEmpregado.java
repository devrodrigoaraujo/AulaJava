package Aula_JavaExemplos;

public class TestaEmpregado {

	public static void main(String[] args) {
		
		Empregado[] lista = new Empregado[3];
		
		lista[0] = new Empregado("Gabriela Xavier",10000);
		lista[1] = new Empregado("Diego Geraldo",15000);
		lista[2] = new Empregado("Cris",50000);
		
		for(Empregado roda:lista) {
			
			roda.imprimir();
		}
		System.out.println("\n\n");
		for(Empregado roda:lista) {
			
			roda.aumentarSalario(15);
			roda.imprimir();
		}

	}

}