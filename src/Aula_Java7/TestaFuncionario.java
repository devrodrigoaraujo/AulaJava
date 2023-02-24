package Aula_Java7;

//Classe TestaFuncionario
public class TestaFuncionario {
public static void main(String[] args) {
   Funcionario funcionario1 = new Funcionario(1, "José da Silva", "Analista de Sistemas", 5000.0, true);
   Funcionario funcionario2 = new Funcionario(2, "Maria Santos", "Coordenadora de Projetos", 8000.0, false);

   funcionario1.visualizar();
   System.out.println("----------");
   funcionario2.visualizar();
}
}