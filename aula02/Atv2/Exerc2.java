package aula02.Atv2;

import java.util.Scanner;
import java.util.Map;

public class Exerc2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // estrtura para armazenar os candidatos

        int[] votos = new int[6]; // 0 = nulo, 1 = branco, 2 = monica, 3 = cebolinha, 4 = cascão, 5 = magali

        int num = 0;
        System.out.println("Mônica: 10\nCebolinha: 20\nCascão: 30\nMagali: 40\nBranco: 1\nNulo: 0\nPara parar a votação: -1\nEntre com os votos: ");
        while(num!=-1){
            num = scanner.nextInt();
            if(num==10)
                votos[2]++;
            else if(num==20)
                votos[3]++;
            else if(num==30)
                votos[4]++;
            else if(num==40)
                votos[5]++;
            else if(num==0)
                votos[0]++;
            else if(num==1)
                votos[1]++;
        }

        // verificando empate

        if(votos[2]==votos[3] || votos[2]==votos[4] || votos[2]==votos[5] || votos[3]==votos[4] || votos[3]==votos[5] || votos[4]==votos[5]){
            System.out.println("Empate entre os candidatos ou nenhuma candidato eleito ou votado.");
            scanner.close();
            return;
        }

        // verificando o candidato eleito

        int maior = 0, sel = 0;
        for(int i=2; i < votos.length; i++){
            if(maior < votos[i]){
                maior = votos[i];
                sel = i;
            }
        }
        System.out.printf("O candidato eleito foi: %s", declararGov(sel));
        scanner.close();
    }
        public static String declararGov(int num){
            Map<Integer,String> tabelaDeVotos = Map.of(
                    2, "Mônica",
                    3, "Cebolinha.",
                    4, "Cascão.",
                    5, "Magali."
                    );
            return tabelaDeVotos.get(num);
        }
}

