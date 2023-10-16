package src.main.java.org.example.aula08.Lista1;

public class TestQuestion9 {
    public static void test(){
        Question9 arr = new Question9();

        // Teste 1
        int arr1[] = {7, 8, 4};
        arr.setArr(arr1);
        arr.maior();
        arr.getArr();
        arr.getMaior();
        arr.exibeDados();

        // Teste 2
        int arr2[] = {78, 25, 7};
        arr.setArr(arr2);
        arr.maior();
        arr.getArr();
        arr.getMaior();
        arr.exibeDados();

        // Teste 3
        int arr3[] = {7, 8, 10};
        arr.setArr(arr3);
        arr.maior();
        arr.getArr();
        arr.getMaior();
        arr.exibeDados();

        // Teste 4
        int arr4[] = {78, 100, 205};
        arr.setArr(arr4);
        arr.maior();
        arr.getArr();
        arr.getMaior();
        arr.exibeDados();
    }
}
