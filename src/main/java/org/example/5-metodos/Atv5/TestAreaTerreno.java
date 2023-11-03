package src.main.java.org.example.Atv5;

public class TestAreaTerreno {
    public static void test() {

        AreaTerreno a = new AreaTerreno();

        // Calcular a área de um terreno quadrado
        a.setLado(5.0);

        // Calcular a área de um terreno retangular
        a.setComprimento(6.0);
        a.setLargura(4.0);

        // exibe o resultado
        a.exibeDados();

    }
}
