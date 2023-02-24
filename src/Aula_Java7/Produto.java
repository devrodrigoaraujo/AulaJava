package Aula_Java7;

public class Produto {
    private String nome;
    private String descricao;
    private String plataforma;
    private double preco;
    private boolean emEstoque;

    public Produto(String nome, String descricao, String plataforma, double preco, boolean emEstoque) {
        this.nome = nome;
        this.descricao = descricao;
        this.plataforma = plataforma;
        this.preco = preco;
        this.emEstoque = emEstoque;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
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

    public boolean isEmEstoque() {
        return emEstoque;
    }

    public void setEmEstoque(boolean emEstoque) {
        this.emEstoque = emEstoque;
    }

    public void visualizar() {
        System.out.println("Nome: " + nome);
        System.out.println("Descrição: " + descricao);
        System.out.println("Plataforma: " + plataforma);
        System.out.println("Preço: R$" + preco);
        System.out.println("Em estoque: " + (emEstoque ? "Sim" : "Não"));
    }
}
