package src.main.java.org.example.Atv10;

public class TesteCaminhao {
    public static void test() {
        Caminhao meuCaminhao = new Caminhao("Mercedes", "ABC1234", 2020, 75000.0, 20.5, 6);

        System.out.println("Dados do Caminhão:");
        meuCaminhao.imprime();
    }
}
