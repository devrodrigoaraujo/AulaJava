package Aula_Java7;

public class TestaIngresso {
    public static void main(String[] args) {
        Ingresso i1 = new Ingresso(123, "VIP", "Show da Banda X", 150.0, false);
        Ingresso i2 = new Ingresso(456, "Normal", "Cinema", 20.0, true);
        
        i1.visualizar();
        System.out.println("-----------------------------");
        i2.visualizar();
    }
}
