package src.main.java.org.example.aula12lista.Question06;

public class Programador extends Funcionario{
    private String linguagem;
    private String sistOper;

    public Programador(String nome, String email, String linguagem){
        super(nome, email);
        this.linguagem = linguagem;
    }
    public void setLinguagem(String linguagem){
        this.linguagem = linguagem;
    }
    public void setSistOper(String sistOper){
        this.sistOper = sistOper;
    }

    @Override
    public void exibeDados(){
        System.out.println("Programador");
        super.exibeDados();
        System.out.println("Linguagem: " + linguagem);
        System.out.println("Sistema Operacional " + sistOper);
        System.out.println("\n");
    }
}
