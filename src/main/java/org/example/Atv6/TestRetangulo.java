package src.main.java.org.example.aula05.Atv5;
import java.util.Scanner;

public class TestRetangulo{
    public static void test(){
        Retangulo ap = new Retangulo();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da base (ou pressione Enter para usar 2): ");
        String baseInput = scanner.nextLine();

        double base = 2.0; // Valor padrão
        if (!baseInput.isEmpty()) {
            try {
                base = Double.parseDouble(baseInput);
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida para base. Usando o valor padrão de 2.");
            }
        }

        System.out.print("Digite o valor da altura (ou pressione Enter para usar 1): ");
        String alturaInput = scanner.nextLine();

        double altura = 1.0; // Valor padrão
        if (!alturaInput.isEmpty()) {
            try {
                altura = Double.parseDouble(alturaInput);
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida para altura. Usando o valor padrão de 1.");
            }
        }

        scanner.close();

        ap.setBase(base);
        ap.setAltura(altura);

        ap.exibeDados();
    }
}
