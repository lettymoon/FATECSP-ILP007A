package src.main.java.org.example.aula08.Lista2;

public class Question2 {
    private double total;
    private int contagem;

    public Question2() {
        total = 0.0;
        contagem = 0;
    }

    public void totalize(double valor) {
        total += valor;
        contagem++;
    }
    public double media() {
        if (contagem == 0) {
            return 0.0;
        }
        return total / contagem;
    }
    public double getTotal() {
        return total;
    }

    public int getContagem() {
        return contagem;
    }
    public double getMedia(){
        return media();
    }
    public void exibaDados(){
        System.out.println("Total acumulado: " + getTotal());
        System.out.println("Contagem de valores: " + getContagem());
        System.out.println("Média dos valores: " + getMedia());
    }
    public static void main(String[] args) {
        TestQuestion2.test();
    }
}
