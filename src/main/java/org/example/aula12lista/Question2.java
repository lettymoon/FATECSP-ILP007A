package src.main.java.org.example.aula12lista;

/*
2. Declare vetores em Java preparados para armazenar:
a. As letras vogais do alfabeto;
b. Número de dias em cada um dos meses do ano.
c. Temperatura mínima e máxima de cada dia de uma semana;
d. As três notas de cada aluno de uma turma com 40 matriculados.
*/

public class Question2 {
    // Vetor alfabeto
    private static char[] arrAlphabet = new char[26];

    // Vetor vogais
    private static char[] arrVowels = new char[5];

    // Número de dias dos meses do ano
    private static int[] arrMonths = new int[31];

    // Temperatura máxima e mínima de cada dia da semana
    private static int[][] arrTemperature = new int[7][2];

    // Notas de cada aluno de uma turma com 40 matriculados
    private static int[][] arrStudent = new int[40][3];

    public static void main(String[] args) {
        Input();
        exibeDados();
    }

    private static void Input() {
        // input do alfabeto
        for (int i = 0; i < 26; i++) {
            arrAlphabet[i] = (char) ('A' + i);
        }

        // input das vogais
        arrVowels = new char[]{'A', 'E', 'I', 'O', 'U'};

        // input dos dias do mês (de um mês com 31 dias como outubro :D)
        for (int i = 0; i < 31; i++) {
            arrMonths[i] = i + 1;
        }

        // input das temperaturas
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 2; j++){
                arrTemperature[i][j] = i * 10 + j;
            }
        }

        // input das notas dos alunos
        for (int i = 0; i < 40; i++) {
            for (int j = 0; j < 3; j++) {
                arrStudent[i][j] = (i + j) % 10;
            }
        }
    }
    private static void exibeDados() {
        System.out.print("Alfabeto: ");
        for (char c : arrAlphabet) {
            System.out.print(c + " ");
        }
        System.out.println("\n");

        System.out.print("Vogais: ");
        for (char c : arrVowels) {
            System.out.print(c + " ");
        }
        System.out.println("\n");

        System.out.print("Dias dos meses: ");
        for (int days : arrMonths) {
            System.out.print(days + " ");
        }
        System.out.println("\n");

        System.out.println("Temperaturas: ");
        for (int i = 0; i < 7; i++) {
            System.out.printf("Dia %d - Mínima: %d, Máxima: %d%n", (i + 1), arrTemperature[i][0], arrTemperature[i][1]);
        }
        System.out.println("\n");

        System.out.println("Notas dos alunos: ");
        for (int i = 0; i < 40; i++) {
            System.out.printf("Aluno %d: ", (i + 1));
            for (int j = 0; j < 3; j++) {
                System.out.print(arrStudent[i][j] + " ");
            }
            System.out.println();
        }
    }
}


