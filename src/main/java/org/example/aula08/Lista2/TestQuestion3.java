package src.main.java.org.example.aula08.Lista2;

public class TestQuestion3 {
    public static void test(){
        Question3 data1 = new Question3(25, 06, 2002);
        Question3 data2 = new Question3(9, 1980);
        Question3 data3 = new Question3(2023);

        data1.exibirData();
        data2.exibirData();
        data3.exibirData();

        System.out.println("Ano bissexto (data1): " + data1.bissexto());
        System.out.println("Ano bissexto (data2): " + data2.bissexto());
        System.out.println("Ano bissexto (data3): " + data3.bissexto());
    }

    public static void main(String[] args) {
        test();
    }

}

