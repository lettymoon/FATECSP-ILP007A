package src.main.java.org.example.aula08.Lista1;

import java.util.Scanner;

public class TestQuestion6 {
    public static void test(){
        Question6 ce = new Question6();

        // Teste 1
        ce.setConsumo(50);
        ce.getTaxa();
        ce.exibeDados();

        // Teste 2
        ce.setConsumo(150);
        ce.getTaxa();
        ce.exibeDados();

        // Teste 3
        ce.setConsumo(230);
        ce.getTaxa();
        ce.exibeDados();

        //Teste 4
        ce.setConsumo(300);
        ce.getTaxa();
        ce.exibeDados();

    }
}
