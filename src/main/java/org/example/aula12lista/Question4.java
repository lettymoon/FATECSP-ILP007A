package src.main.java.org.example.aula12lista;

/*
4. Faça um programa que leia e armazene as alturas de grupo de 20 pessoas, calcule a média e indique quantas
pessoas estão acima dessa média.
 */

import javax.sound.midi.Soundbank;

public class Question4 {
    private static double[] arrHeight = new double[20];
    private static int aboveAverage;
    private static double Average;

    public static void main(String[] args){
        Test();
        exibeDados();
    }

    public static void Test(){
        arrHeight = new double[] {1.80, 1.65, 1.75, 1.90, 1.83, 1.76, 1.50, 1.68, 1.67, 1.78, 1.81, 1.85, 1.63, 1.69, 1.73, 1.66, 1.74, 1.77, 1.55, 1.59};

        float sum = 0;
        for(int i=0; i<20; i++){
            sum += arrHeight[i];
        }

        double a = sum/20;

        int counter = 0;
        for(int i=0; i<20; i++){
            if(arrHeight[i] > a)
                counter++;
        }

        aboveAverage = counter;
        Average = a;
    }
    public static void exibeDados(){
        System.out.println("\n");
        System.out.print("Altura: ");
        for (int i = 0; i < arrHeight.length; i++) {
            if (i != 0) {
                System.out.print(" - ");
            }
            System.out.print(arrHeight[i]);
        }
        System.out.println("\n");

        System.out.printf("Média: %.2f", Average);
        System.out.println("\n");

        System.out.printf("Quantidade de pessoas a cima da média: %d", aboveAverage);
        System.out.println("\n");
    }
}
