package Aula_Java7;

public class TestaFarmacia {
    public static void main(String[] args) {
        Farmacia produto1 = new Farmacia(1, "Dipirona", "Analgésico e antitérmico", 3.50, 50);
        Farmacia produto2 = new Farmacia(2, "Omeprazol", "Inibidor da bomba de prótons", 25.00, 20);

        produto1.visualizar();
        System.out.println("-----");
        produto2.visualizar();
    }
}
