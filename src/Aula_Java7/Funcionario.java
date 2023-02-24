package Aula_Java7;

//Classe Funcionario
public class Funcionario {
 private int id;
 private String nome;
 private String cargo;
 private double salario;
 private boolean ativo;

 // Construtor
 public Funcionario(int id, String nome, String cargo, double salario, boolean ativo) {
     this.id = id;
     this.nome = nome;
     this.cargo = cargo;
     this.salario = salario;
     this.ativo = ativo;
 }

 // Métodos Get e Set
 public int getId() {
     return id;
 }

 public void setId(int id) {
     this.id = id;
 }

 public String getNome() {
     return nome;
 }

 public void setNome(String nome) {
     this.nome = nome;
 }

 public String getCargo() {
     return cargo;
 }

 public void setCargo(String cargo) {
     this.cargo = cargo;
 }

 public double getSalario() {
     return salario;
 }

 public void setSalario(double salario) {
     this.salario = salario;
 }

 public boolean isAtivo() {
     return ativo;
 }

 public void setAtivo(boolean ativo) {
     this.ativo = ativo;
 }

 // Método visualizar
 public void visualizar() {
     System.out.println("Id: " + getId());
     System.out.println("Nome: " + getNome());
     System.out.println("Cargo: " + getCargo());
     System.out.println("Salário: " + getSalario());
     System.out.println("Ativo: " + isAtivo());
 }
}


