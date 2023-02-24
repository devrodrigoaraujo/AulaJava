package Aula_Java7;

public class TestaGame {
    public static void main(String[] args) {
        Produto game1 = new Produto("The Last of Us Part II", "Jogo de aventura e sobrevivência", "PlayStation 4", 199.90, true);
        Produto game2 = new Produto("FIFA 22", "Jogo de futebol", "Xbox One", 299.99, false);

        System.out.println("Informações do jogo 1:");
        game1.visualizar();

        System.out.println();

        System.out.println("Informações do jogo 2:");
        game2.visualizar();
    }
}
