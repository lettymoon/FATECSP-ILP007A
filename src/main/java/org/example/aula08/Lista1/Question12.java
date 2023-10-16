package src.main.java.org.example.aula08.Lista1;

/*
Altere o exercício anterior para ler uma seqüência de valores de pessoas de uma comunidade, determinando
seu peso ideal de acordo com as fórmulas dadas no exercício anterior. Ao final (quando o usuário digitar altura
igual a 0), informe a altura média das mulheres e dos homens.
 */

import java.text.DecimalFormat;

public class Question12 {
    private int sexo;
    private double altura;
    private double mediaM;
    private double mediaH;

    public void setSexo(int s){
        sexo = s;
    }
    public void setAltura(double a){
        altura = a;
    }
    public double calculo(){
        double calculo = 0;
        if(sexo == 1)
            calculo = (72.7*altura)-58;
        else if(sexo == 2)
            calculo = (62.1*altura)-44.7;
        return calculo;
    }
    public double getCalculo(){
        return calculo();
    }
    public void setMedia(double mH, double mM){
        mediaH = mH;
        mediaM = mM;
    }
    public double getMediaM(){
        return mediaM;
    }
    public double getMediaH(){
        return mediaH;
    }
    public void exibeDados(){
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("========================================");
        if (sexo == 1 || sexo == 2) {
            System.out.println("Seu peso ideal é " + df.format(getCalculo()));
        } else {
            System.out.println("Valor de sexo inválido. Deve ser 1 ou 2.");
        }
        System.out.println("========================================");
    }
    public void exibeMedia(){
        System.out.println("Média das alturas das mulheres = " + getMediaM());
        System.out.println("Média das alturas dos homens = " + getMediaH());

    }
    public static void main(String[] args){
        TestQuestion12.test();
    }
}
