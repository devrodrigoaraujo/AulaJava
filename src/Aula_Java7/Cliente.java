package Aula_Java7;

//Classe Cliente
public class Cliente {
 private int id;
 private String nome;
 private String email;
 private String telefone;
 private String endereco;

 // Construtor
 public Cliente(int id, String nome, String email, String telefone, String endereco) {
     this.id = id;
     this.nome = nome;
     this.email = email;
     this.telefone = telefone;
     this.endereco = endereco;
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

 public String getEmail() {
     return email;
 }

 public void setEmail(String email) {
     this.email = email;
 }

 public String getTelefone() {
     return telefone;
 }

 public void setTelefone(String telefone) {
     this.telefone = telefone;
 }

 public String getEndereco() {
     return endereco;
 }

 public void setEndereco(String endereco) {
     this.endereco = endereco;
 }

 // Método visualizar
 public void visualizar() {
     System.out.println("Id: " + getId());
     System.out.println("Nome: " + getNome());
     System.out.println("Email: " + getEmail());
     System.out.println("Telefone: " + getTelefone());
     System.out.println("Endereço: " + getEndereco());
 }
}