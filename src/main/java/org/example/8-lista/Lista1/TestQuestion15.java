package src.main.java.org.example.aula08.Lista1;
import java.util.Scanner;
public class TestQuestion15 {
    public static void test(){
        Question15 t = new Question15();

        Scanner input = new Scanner(System.in);
        double temp = 0;

        System.out.println("Entre com a temperatura em Celsius, digite -1 para parar.");

        while(temp!=-1){
            temp = input.nextDouble();
            t.setTemp(temp);
            t.calculo();
            t.exibaDados();
        }
    }
}
