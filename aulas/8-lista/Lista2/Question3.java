package src.main.java.org.example.aula08.Lista2;

public class Question3 {
    private int dia;
    private int mes;
    private int ano;

    public Question3(int d, int m, int a) {
        setData(d, m, a);
    }

    public Question3(int m, int a) {
        setData(1, m, a);
    }

    public Question3(int a) {
        setData(1, 1, a);
    }

    public void setData(int d, int m, int a) {
        if (validarData(d, m, a)){
            dia = d;
            mes = m;
            ano = a;
        }
        else
            System.out.println("Data inválida.");
    }

    public boolean bissexto() {
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }

    private boolean validarData(int d, int m, int a) {
        if (a < 1 || m < 1 || m > 12 || d < 1 || d > 31)
            return false;
        if ((m == 4 || m == 6 || m == 9 || m == 11) && d > 30)
            return false;

        if (m == 2) {
            if (bissexto())
                return d <= 29;
            else
                return d <= 28;
        }
        if (d > 31) {
            return false;
        }
        return true;
    }
    public void exibirData() {
        System.out.println("Data: " + dia + "/" + mes + "/" + ano);
    }
    public static void main(String[] args){
        TestQuestion3.test();
    }
}
