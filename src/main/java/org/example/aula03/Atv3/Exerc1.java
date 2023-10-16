package src.main.java.org.example.Atv2;

import java.util.Scanner;

public class Exerc1{
    public static void main(String[] args) {

        int dia, mes, ano;
        Scanner input = new Scanner(System.in);

        dia = input.nextInt();
        mes = input.nextInt();
        ano = input.nextInt();

        // converter inteiros para strings, concatenar e voltar para inteiro como uma variável
        String diaStr = Integer.toString(dia);
        String mesStr = Integer.toString(mes);
        String concatenado = diaStr + mesStr;
        int diames = Integer.parseInt(concatenado); // dia e mes concatenado

        // calculo de perfil
        int x = diames + ano;
        int xparte1 = x / 100;
        int xparte2 = x % 100;

        int res = (xparte1 + xparte2) % 5;
        //System.out.printf("%d", res);

        if(res==0)
            System.out.println("Tímido.");
        else if(res==1)
            System.out.println("Sonhador.");
        else if(res==2)
            System.out.println("Paquerador.");
        else if(res==3)
            System.out.println("Atraente.");
        else if(res==4)
            System.out.println("Irresistível..");

    }

}
