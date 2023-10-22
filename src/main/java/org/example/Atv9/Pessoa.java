package src.main.java.org.example.Atv9;

/*Atividade 09 - Herança
1) Elaborar uma classe genérica Pessoa com dados gerais para a identificação de qualquer pessoa.
2) Elaborar a classe específica Aluno que herde as característica da classe Pessoa e que identifique o curso ao qual
está matriculado.
3) Instancie o objeto da classe Aluno.
 */

public class Pessoa{
    private String nome;
    private long RA;

    public Pessoa(String n, long cod){
        this.nome = n;
        this.RA = cod;
    }

    public void setNome(String n){
        nome = n;
    }

    public void setRA(long cod){
        RA = cod;
    }

    public String getNome(){
        return nome;
    }

    public long getRA(){
        return RA;
    }

    public void exibeDados(){
        System.out.println("Nome: " + nome);
        System.out.println("RA: " + RA);
    }
}

