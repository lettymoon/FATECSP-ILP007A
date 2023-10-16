package src.main.java.org.example.aula06.Atv6;
import java.util.Scanner;

public class Vetor{

    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        int position = 0;
        int arr[] = {20,21,28,45,78,98,100,45,56,70,88,12,3,63,66,11,5,44,85,14};

        int value;
        System.out.println("Fale qual o valor que deseja fazer a busca: ");
        value = read.nextInt();
        int i = 0;
        boolean isFound = false;
        for(; i < 20; i++){
            if(arr[i] == value){
                position = i + 1;
                System.out.printf("Valor = %d na posição %d\n", arr[i], position);
                isFound = true;
                break;
            }
        }

        if(!isFound){
            System.out.println("O número desejado não contém no vetor.");
        }
    }
}
