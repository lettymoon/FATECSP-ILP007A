package src.main.java.org.example.aula08.Lista2;
import java.util.Scanner;
public class TestQuestion1 {
    public static void test(){
        Question1 n = new Question1();

        Scanner input = new Scanner(System.in);
        int number;
        System.out.println("Entre com um número inteiro: ");
        number = input.nextInt();

        n.setNumber(number);
        n.isPrime();
        n.isPair();
        n.fat(number);
        n.exibeDados();

    }
}
