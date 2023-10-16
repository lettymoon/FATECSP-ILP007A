package src.main.java.org.example.Atv2;

// Utilizando HashMap

import java.util.Map;
import java.util.Scanner;

public class Exerc1Alt{
    public static void main(String[] args) {

        int dia, mes, ano;
        Scanner input = new Scanner(System.in);

        dia = input.nextInt();
        mes = input.nextInt();
        ano = input.nextInt();

        // converter inteiros para strings, concatenar e voltar para inteiro como uma variável
        String diaStr = Integer.toString(dia);
        String mesStr = Integer.toString(mes);
        String concatenado = diaStr + mesStr;
        int diames = Integer.parseInt(concatenado); // dia e mes concatenado

        // calculo de perfil
        int x = diames + ano;
        int xparte1 = x / 100;
        int xparte2 = x % 100;

        int res = (xparte1 + xparte2) % 5;
        //System.out.printf("%d", res);
        System.out.println(ClassificadoDePerfil.obterPerfil(res));
    }

    public static class ClassificadoDePerfil {
          /*
        utilizar o HashMap

        0, timido
        1, sonhador
        2, paquerador
        3, atraente
        4, irresistível

         */
        public static String obterPerfil(int num){
            Map<Integer,String> tabelaPerfil = Map.of(
                    0, "Tímido.",
                    1, "Sonhador.",
                    2, "Paquerdor.",
                    3, "Atraente.",
                    4, "Irresistível."
            );
            return tabelaPerfil.get(num);
        }
    }
}
