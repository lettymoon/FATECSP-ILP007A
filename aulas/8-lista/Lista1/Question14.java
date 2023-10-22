package src.main.java.org.example.aula08.Lista1;

/*
Escreva um programa que, a partir do capital e taxa de juros informados, calcule em quantos anos (e meses)
seu investimento dobrará. Considere juros constantes.
 */
public class Question14{
    private double capinvest;
    private double taxajuros;

    public void setCapinvest(double ci){
        capinvest = ci;
    }
    public void setTaxajuros(double t){
        taxajuros = t;
    }
    public int taxaMes() {
        double investimento = capinvest;
        int meses = 0;
        while (investimento < capinvest * 2) {
            investimento += (investimento * (taxajuros / 100));
            meses++;
        }
        return meses;
    }
    public double getCapinvest(){
        return capinvest;
    }
    public int getQuantMes(){
        return taxaMes();
    }
    public int getQuantAno(){
        return taxaMes()/12;
    }
    public void exibeDados(){
        System.out.println("Capital inicial: " + getCapinvest());
        System.out.println("Quantidade de mês que levou para dobrar: " + getQuantMes());
        System.out.println("Quantidade de ano que levou para dobrar: " + getQuantAno());
    }
    public static void main(String[] args){
        TestQuestion14.test();
    }

}
