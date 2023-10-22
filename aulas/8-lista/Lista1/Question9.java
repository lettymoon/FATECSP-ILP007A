package src.main.java.org.example.aula08.Lista1;

// 9) Faça um programa que leia 3 valores inteiros, encontre e exiba o maior deles.

import java.util.Arrays;
public class Question9 {
    private int[] arr;

    public void setArr(int[] n){
        arr = n;
    }
    public int maior(){
        int maior = 0;
        for(int i=0; i<3; i++){
            if(arr[i] > maior)
                maior = arr[i];
        }
        return maior;
    }
    public int[] getArr(){
        return arr;
    }
    public int getMaior(){
        return maior();
    }
    public void exibeDados(){
        System.out.println("===========================================");
        System.out.println("Lista de números = " + Arrays.toString(getArr()));
        System.out.println("Maior valor = " + getMaior());
        System.out.println("===========================================");

    }
    public static void main(String[] args){
        TestQuestion9.test();
    }
}
