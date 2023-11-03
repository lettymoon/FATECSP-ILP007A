package src.main.java.org.example.Atv4.ClasseContaCorrente;
public class TestContaCorrente {
    public static void test() {
        ContaCorrente cc1 = new ContaCorrente("25252525", "Letícia", 1000.0);

        cc1.exibirDados();

        cc1.deposito(500.0);
        cc1.exibirDados();

        cc1.saque(200.0);
        cc1.setTitular("Letty");
        cc1.exibirDados();

        ContaCorrente cc2 = new ContaCorrente("99999999", "John Lennon", 99999.9);

        cc2.exibirDados();

        cc2.deposito(99.9);
        cc2.exibirDados();

        cc2.saque(9.9);
        cc2.setTitular("Johnny");
        cc2.exibirDados();
    }
}
