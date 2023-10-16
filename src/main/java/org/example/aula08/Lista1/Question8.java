package src.main.java.org.example.aula08.Lista1;

// 8) Faça um programa que leia 3 valores inteiros, exiba os valores em ordem crescente.

import java.util.Arrays;

public class Question8 {
    private int[] arr;

    public void setArr(int[] n){
        arr = n;
    }

    public void Sort(){
        Arrays.sort(arr);
    }

    public int[] getArr(){
        return arr;
    }

    public void exibaDados(){
        System.out.println("============================================");
        System.out.println("Lista ordenada = " + Arrays.toString(getArr()));
        System.out.println("============================================");
    }

    public static void main(String[] args){
        TestQuestion8.test();
    }
}
