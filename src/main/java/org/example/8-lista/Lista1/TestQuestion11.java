package src.main.java.org.example.aula08.Lista1;

public class TestQuestion11 {
    public static void test(){
        Question11 peso = new Question11();

        // Teste 1
        peso.setSexo(2);
        peso.setAltura(1.67);
        peso.calculo();
        peso.exibeDado();

        // Teste 2
        peso.setSexo(1);
        peso.setAltura(1.67);
        peso.calculo();
        peso.exibeDado();

        // Teste 3
        peso.setSexo(1);
        peso.setAltura(1.83);
        peso.calculo();
        peso.exibeDado();

    }
}
