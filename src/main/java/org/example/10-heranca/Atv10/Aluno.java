package src.main.java.org.example.Atv9;

public class Aluno extends Pessoa{
    private String curso;

    public Aluno(String nome, long RA, String curso){
        super(nome, RA);
        this.curso = curso;
    }

    public void setCurso(String c){
        curso = c;
    }

    public void exibeDados(){
        super.exibeDados();
        System.out.println("Curso: " + curso);
    }

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Letícia", 20482312049L, "ADS");
        aluno1.exibeDados();
    }
}