package src.main.java.org.example.aula08.Lista1;

public class TestQuestion16 {
    public static void test(){
        Question16 retangulo = new Question16();

        retangulo.setVertices(1.0, 3.0, 5.0, 1.0);
        retangulo.exibirDados();

        double x = 3.0;
        double y = 2.0;
        if (retangulo.pontoEstaDentro(x, y)) {
            System.out.println("O ponto está dentro do retângulo.");
        } else {
            System.out.println("O ponto está fora do retângulo.");
        }
    }
}
