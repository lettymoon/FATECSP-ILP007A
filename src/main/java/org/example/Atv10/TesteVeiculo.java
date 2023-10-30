package src.main.java.org.example.Atv10;

public class TesteVeiculo{
    public static void test(){
        Veiculo v;
        v = new Veiculo ("Fiesta", "ABC1678", 2007, 34000);
        v.imprime();

        v.deprecia(10);
        System.out.println("Veiculo depreciado");
        v.imprime();
    }
}