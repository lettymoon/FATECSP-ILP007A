package src.main.java.org.example.aula08.Lista1;

/*
10) Faça um programa que leia os valores de uma data: o dia, o mês e o ano, com três variáveis inteiras. Faça a
consistência da data. Considere:

Meses com 30 dias: 4, 6, 9, 11
Meses com 31 dias: 1, 3, 5, 7, 8, 10, 12
Ano bissexto: Divisível por 4, mas não por 100.
 */

import java.util.HashMap;

public class Question10 {
    private int dia;
    private int mes;
    private int ano;

    public void setDia(int d) {
        dia = d;
    }

    public void setMes(int m) {
        mes = m;
    }

    public void setAno(int n) {
        ano = n;
    }
    public int obterMes(int mes) {
        HashMap<Integer, Integer> tabelaMes = new HashMap<>();
        tabelaMes.put(4, 30);
        tabelaMes.put(6, 30);
        tabelaMes.put(9, 30);
        tabelaMes.put(11, 30);
        tabelaMes.put(1, 31);
        tabelaMes.put(3, 31);
        tabelaMes.put(5, 31);
        tabelaMes.put(7, 31);
        tabelaMes.put(8, 31);
        tabelaMes.put(10, 31);
        tabelaMes.put(12, 31);
        return tabelaMes.get(mes);
    }
    public boolean isBissexto(){
        return ano%4==0 && ano%100!=0;
    }
    public int getDia(){
        return dia;
    }
    public int getMes(){
        return mes;
    }
    public int getAno(){
        return ano;
    }
    public int getTipoMes(){
        return obterMes(mes);
    }
    public String getBissexto(){
        if(isBissexto())
            return "É bissexto.";
        else
            return "Não é bissexto.";
    }

    public void exibeDados(){
        System.out.println("===================================================");
        System.out.println("Dia: " + getDia());
        System.out.println("Mês: " + getMes());
        System.out.println("Ano: " + getAno());
        System.out.println("Tipo do mês = " + getTipoMes());
        System.out.println("O ano é bissexto? " + getBissexto());
        System.out.println("===================================================");
    }

    public static void main(String[] args){
        TestQuestion10.test();
    }
}
