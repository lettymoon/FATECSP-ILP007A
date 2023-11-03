package src.main.java.org.example.aula08.Lista1;

public class TestQuestion7 {
    public static void test(){
        Question7 a = new Question7();

        int aluno = 1;

        // Teste 1
        System.out.println("Aluno = " + aluno);
        a.setNota(7, 8);
        a.exibeDados();
        aluno++;

        // Teste 2
        System.out.println("Aluno = " + aluno);
        a.setNota(3, 8);
        a.exibeDados();
        aluno++;

        // Teste 3
        System.out.println("Aluno = " + aluno);
        a.setNota(2,5);
        a.exibeDados();
        aluno++;

        // Teste 4
        System.out.println("Aluno = " + aluno);
        a.setNota(0, 8);
        a.exibeDados();
    }
}
