package src.main.java.org.example.Atv2;

/* Atividade 01 - Exercício 01 Temperatura

Faça um programa em Java que leia uma temperatura em Fahrenheit, calcule e exiba seu valor em Celsius.
Fórmula: C = (F-32) * 5 / 9.
 */

import java.util.Scanner;

public class Temperatura{

    public static void main(String args[]){

        float f, c;
        Scanner input = new Scanner(System.in);
        System.out.printf("Entre com a temperatura em fahrenheit: ");
        f = input.nextFloat();

        c = ((f-32)*5)/9;

        System.out.printf("Celsius: %5.2f°\n", c);
    }
}