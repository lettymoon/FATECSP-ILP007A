package src.main.java.org.example.aula12lista.Question06;

public class Instrutor extends Funcionario {
    private String disciplina;
    public Instrutor(String nome, String email, String disciplina) {
        super(nome, email);
        this.disciplina = disciplina;
    }
    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
    @Override
    public void exibeDados() {
        System.out.println("Instrutor ");
        super.exibeDados();
        System.out.println("Disciplina: " + disciplina);
        System.out.println("\n");
    }
}
