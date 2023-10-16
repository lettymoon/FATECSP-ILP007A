package src.main.java.org.example.aula08.Lista1;

/*
Faça um programa que leia um dado n positivo e uma seqüência de n temperaturas em Celsius. Calcule e
exiba seus valores correspondentes em Fahrenheit. (F = 32 + C * 5 / 9).
 */
public class Question15 {
    private double celsius;

    public void setTemp(double c){
        celsius = c;
    }
    public double calculo(){
        double f = 0;
        return f = 32 + celsius * 5 / 9;
    }
    public double getCelsius(){
        return celsius;
    }
    public double getFahrenheit(){
        return calculo();
    }
    public void exibaDados(){
        System.out.println("Temperatura em Fahrenheit: " + getFahrenheit());
        System.out.println("---------------------------------------------------------------------------");
    }
    public static void main(String[] args){
        TestQuestion15.test();
    }
}
