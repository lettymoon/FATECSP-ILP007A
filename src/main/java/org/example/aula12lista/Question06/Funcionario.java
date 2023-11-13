package src.main.java.org.example.aula12lista.Question06;

import java.util.Locale;

public class Funcionario {
    private String nome;
    private String email;
    private int idade;

    public Funcionario(String nome, String email){
        this.nome = nome;
        this.email = email;
    }
    public Funcionario(String nome, String email, int idade){
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public void exibeDados(){
        System.out.println("Nome: " + nome);
        System.out.println("E-mail: " + email);
        System.out.println("Idade: " + idade);
    }

    // caso de teste
    public static void main(String[] args) {

        Programador programador = new Programador("Letícia Candido", "leticia@email.com", "Golang");
        programador.setSistOper("Linux");
        programador.setIdade(21);
        programador.exibeDados();

        Instrutor instrutor = new Instrutor("Clint Eastwood", "\n" + "manwithnoname@email.com", "Algoritmos Avançados");
        instrutor.setIdade(34);
        instrutor.exibeDados();

    }
}
