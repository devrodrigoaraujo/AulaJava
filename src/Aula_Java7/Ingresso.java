package Aula_Java7;

public class Ingresso {
    private int numero;
    private String tipo;
    private String evento;
    private double valor;
    private boolean vendido;
    
    public Ingresso(int numero, String tipo, String evento, double valor, boolean vendido) {
        this.numero = numero;
        this.tipo = tipo;
        this.evento = evento;
        this.valor = valor;
        this.vendido = vendido;
    }
    
    public int getNumero() {
        return numero;
    }
    
    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public String getTipo() {
        return tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public String getEvento() {
        return evento;
    }
    
    public void setEvento(String evento) {
        this.evento = evento;
    }
    
    public double getValor() {
        return valor;
    }
    
    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public boolean isVendido() {
        return vendido;
    }
    
    public void setVendido(boolean vendido) {
        this.vendido = vendido;
    }
    
    public void visualizar() {
        System.out.println("Número: " + numero);
        System.out.println("Tipo: " + tipo);
        System.out.println("Evento: " + evento);
        System.out.println("Valor: R$" + valor);
        System.out.println("Vendido: " + (vendido ? "Sim" : "Não"));
    }
}

