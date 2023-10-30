package src.main.java.org.example.Atv7;
import java.util.Scanner;

class Matriz {
    public static void main(String[] args) {
        int shelf[][] = new int[4][3];
        Scanner read = new Scanner(System.in);
        for(int i = 0; i < 4; i++){
            System.out.printf("Prateleira %d: ", i+1);
            for(int j = 0; j < 3; j++){
                System.out.printf("Valor %d da prateleira %d: ", j+1, i+1);
                shelf[i][j] = read.nextInt();
            }
        }

        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 3; j++){
                System.out.printf("%d ", shelf[i][j]);
            }
            System.out.printf("\n");
        }
    }
}