package Aula_Java7;

public class Curso {
    private String nome;
    private int cargaHoraria;
    private String plataforma;
    private double preco;
    private String descricao;

    public Curso(String nome, int cargaHoraria, String plataforma, double preco, String descricao) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.plataforma = plataforma;
        this.preco = preco;
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void visualizar() {
        System.out.println("Nome: " + nome);
        System.out.println("Carga Horária: " + cargaHoraria + " horas");
        System.out.println("Plataforma: " + plataforma);
        System.out.println("Preço: R$" + preco);
        System.out.println("Descrição: " + descricao);
    }
}
