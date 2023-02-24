package Aula_Java7;

//Classe TestaCliente
public class TestaCliente {
public static void main(String[] args) {
   Cliente cliente1 = new Cliente(1, "João Silva", "joao.silva@gmail.com", "(21) 99999-9999", "Rua A, 123");
   Cliente cliente2 = new Cliente(2, "Maria Santos", "maria.santos@hotmail.com", "(11) 88888-8888", "Avenida B, 456");

   cliente1.visualizar();
   System.out.println("----------");
   cliente2.visualizar();
}
}
