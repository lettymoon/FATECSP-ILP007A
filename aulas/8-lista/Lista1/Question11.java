package src.main.java.org.example.aula08.Lista1;

/*
Dados a altura e o sexo de uma pessoa, determine seu peso ideal de acordo com as fórmulas a seguir:

para homens o peso ideal é 72.7∗altura − 58
para mulheres o peso ideal é 62.1∗altura − 44.7
Nota: Faça a leitura do sexo como um valor inteiro 1- para Homens e 2 – para Mulheres.
 */

import java.text.DecimalFormat;

public class Question11 {
    private int sexo;
    private double altura;

    public void setSexo(int s){
        if(s == 1 || s == 2)
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
    public void exibeDado(){
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("========================================");
        if (sexo == 1 || sexo == 2) {
            System.out.println("Seu peso ideal é " + df.format(getCalculo()));
        } else {
            System.out.println("Valor de sexo inválido. Deve ser 1 ou 2.");
        }
        System.out.println("========================================");
    }
    public static void main(String[] args){
        TestQuestion11.test();
    }
}
