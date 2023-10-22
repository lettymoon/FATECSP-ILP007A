package src.main.java.org.example.aula08.Lista2;

public class Question1{
    private int number;
    public void setNumber(int n){
        if (n > 0)
            number = n;
    }
    public  int getNumber(){
        return number;
    }
    public boolean isPair(){
        if(number%2 == 0)
            return true;
        else
            return false;
    }
    public boolean isPrime(){
        int cont = 0;
        for(int i = 2; i < number; i++){
            if(number % i == 0)
                cont++;
        }
        if(cont == 0)
            return true;
        else
            return false;
    }
    public int fat(int number){
        if (number < 0) {
            return 0;
        }
        if (number == 1)
                return 1;
        return number*fat(number-1);
    }
    public boolean getPrime(){
        return isPrime();
    }
    public boolean getPair(){
        return isPair();
    }
    public int getFat(){
        return fat(number);
    }
    public void exibeDados(){
        if (number > 0) {
            System.out.println("É par? " + getPair());
            System.out.println("É primo? " + getPrime());
            System.out.printf("Fat: " + getFat());
        }
        else
            System.out.println("O número deve ser um inteiro positivo.");
    }
    public static void main(String[] args){
        TestQuestion1.test();
    }

}
