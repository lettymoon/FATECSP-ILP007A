package src.main.java.org.example.aula08.Lista1;

public class TestQuestion8 {
    public static void test(){
        Question8 arr = new Question8();

        // Teste 1
        int[] arr1 = {10,78,45};
        arr.setArr(arr1);
        arr.getArr();
        arr.Sort();
        arr.exibaDados();

        // Teste 2
        int[] arr2 = {7,200,4};
        arr.setArr(arr2);
        arr.getArr();
        arr.Sort();
        arr.exibaDados();

        // Teste 3
        int[] arr3 = {5, 20, 78};
        arr.setArr(arr3);
        arr.getArr();
        arr.Sort();
        arr.exibaDados();
    }
}
