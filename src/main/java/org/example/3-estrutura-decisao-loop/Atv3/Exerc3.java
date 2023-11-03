package src.main.java.org.example.Atv3;

import java.util.Scanner;

public class Exerc3 {
    public static void main(String[] args){
        // ler capital e taxa de porcentagem

        float c, p;
        Scanner input = new Scanner(System.in);
        c = input.nextFloat();
        p = input.nextFloat();

        // converter taxa de porcetagem para aumento percentual 13% = 1 + 0,13

        float aumentoPercentual = (p/100) + 1;

        // laço de repetição de 12 meses, aplicando acrescimo percentual e printando na tela

        for(int i=0; i < 12; i++){
            c *= aumentoPercentual;
            System.out.printf("Mês %d: %f\n", i+1, c);
        }


    }
}
