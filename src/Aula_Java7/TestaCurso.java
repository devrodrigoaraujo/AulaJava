package Aula_Java7;

public class TestaCurso {
    public static void main(String[] args) {
        Curso curso1 = new Curso("Java para iniciantes", 40, "Udemy", 29.90, "Aprenda os conceitos básicos de Java para programação.");
        Curso curso2 = new Curso("Python para Data Science", 60, "Alura", 49.90, "Aprenda Python para Data Science de forma prática.");

        System.out.println("Curso 1:");
        curso1.visualizar();
        System.out.println("\nCurso 2:");
        curso2.visualizar();
    }
}
