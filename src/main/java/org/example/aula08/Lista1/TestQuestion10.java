package src.main.java.org.example.aula08.Lista1;

public class TestQuestion10 {

    public static void test(){
        Question10 dataTeste1 = new Question10();

        // Teste 1
        dataTeste1.setDia(25);
        dataTeste1.setMes(6);
        dataTeste1.setAno(2002);
        dataTeste1.obterMes(dataTeste1.getMes());
        dataTeste1.isBissexto();
        dataTeste1.getTipoMes();
        dataTeste1.getBissexto();
        dataTeste1.exibeDados();

        Question10 dataTeste2 = new Question10();
        // Teste 2
        dataTeste2.setDia(9);
        dataTeste2.setMes(10);
        dataTeste2.setAno(1940);
        dataTeste2.obterMes(dataTeste2.getMes());
        dataTeste2.isBissexto();
        dataTeste2.getTipoMes();
        dataTeste2.getBissexto();
        dataTeste2.exibeDados();

        Question10 dataTeste3 = new Question10();
        // Teste 1
        dataTeste3.setDia(27);
        dataTeste3.setMes(5);
        dataTeste3.setAno(1980);
        dataTeste3.obterMes(dataTeste3.getMes());
        dataTeste3.isBissexto();
        dataTeste3.getTipoMes();
        dataTeste3.getBissexto();
        dataTeste3.exibeDados();
    }
}
