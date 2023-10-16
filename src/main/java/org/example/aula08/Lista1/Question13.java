package src.main.java.org.example.aula08.Lista1;

/*
Escreva um programa que leia o valor de um capital investido e a taxa de juros mensais. Supondo que
essa taxa seja constante ao longo de um ano, apresente o valor do investimento ao final de cada mês
durante um ano.
 */
public class Question13 {
    private double capinvest;
    private double taxajuros;

    public void setCapinvest(double ci){
        capinvest = ci;
    }
    public void setTaxajuros(double t){
        taxajuros = t;
    }
    public void taxaMes() {
        double investimento = capinvest;
        for (int i = 1; i <= 12; i++) {
            investimento += (investimento * (taxajuros / 100));
            System.out.printf("Mês %d: Valor do investimento: %.2f\n", i, investimento);
        }
    }
    public double getCapinvest(){
        return capinvest;
    }
    public void exibeDados(){
        System.out.println("Capital inicial: " + getCapinvest());
    }
    public static void main(String[] args){
        TestQuestion13.test();
    }

}
