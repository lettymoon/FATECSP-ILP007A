package src.main.java.org.example.aula08.Lista1;

/*
7) Faça um programa que leia as 2 notas de um aluno, calcule e exiba a média aritmética das notas e a
situação final do aluno (MF >= 7 - APROVADO, MF >= 4 E MF < 7 - EXAME, MF < 4 - REPROVADO). */
public class Question7 {
    private double nota1;
    private double nota2;
    private double media;

    public void setNota(double n1, double n2){
        nota1 = n1;
        nota2 = n2;
    }
    public double calculoMedia(){
        media = (nota1+nota2)/2;
        return media;
    }
    public String getSituacao(){
        if(media >= 7)
            return "Aprovado.";
        else if(media < 7 && media >= 4)
            return "Exame.";
        else
            return "Reprovado.";
    }
    public double getNota1(){
        return nota1;
    }
    public double getNota2(){
        return nota2;
    }
    public double getMedia(){
        return calculoMedia();
    }

    public void exibeDados(){
        System.out.println("============================================");
        System.out.println("Nota 1 = " + getNota1());
        System.out.println("Nota 2 = " + getNota2());
        System.out.println("Média final = " + getMedia());
        System.out.println("Situação do aluno = " + getSituacao());
        System.out.println("============================================");

    }

    public static void main(String[] args){
        TestQuestion7.test();
    }
}
