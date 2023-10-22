package src.main.java.org.example.aula08.Lista1;

import java.util.Scanner;
public class TestQuestion12 {
    public static void test(){
        Question12 media = new Question12();

        Scanner input = new Scanner(System.in);
        int sexo = 0;
        double altura = 1.0;
        double somaAlturaM = 0.0;
        double somaAlturaH = 0.0;
        int contM = 0;
        int contH = 0;

        while(altura != 0){
            sexo = input.nextInt();
            altura = input.nextDouble();
            input.nextLine();

            if (altura != 0) {
                media.setSexo(sexo);
                media.setAltura(altura);
                media.calculo();
                media.exibeDados();

                if (sexo == 1) {
                    somaAlturaH += altura;
                    contH++;
                }
                if (sexo == 2) {
                    somaAlturaM += altura;
                    contM++;
                }
            }
        }

        double mH = somaAlturaH/contH;
        double mM = somaAlturaM/contM;
        media.setMedia(mH, mM);
        media.exibeMedia();
    }
}
