package src.main.java.org.example.aula08.Lista1;

/*
6) Faça um programa que leia o consumo de energia mensal de uma residência, calcule e exiba o valor da
conta seguindo os seguintes critérios:
- Consumo até 50kWh: taxa mínima de R$ 10,00
- Consumo até 100kWh: além da taxa mínima de R$ 10,00 paga 0,20 por kWh que exceder 50.
- Consumo até 200kWh: segue o critério anterior mais 0,25 por kWh que exceder 100.
- Consumo maior que 200kWh: segue o critério anterior mais 0,35 por kWh que exceder 200.

Exemplo: Consumo de 130 kWh = 50 + 50 + 30 custa 10,00 + 50*0,20 + 30*0,25 = 27,50.
 */
public class Question6 {
    private double consumo;
    private double taxa;
    public void setConsumo(int c){
        consumo = c;
    }
    public double calculo(){
        if (consumo <= 50) {
            taxa = 10;
        } else if (consumo > 50 && consumo <= 100) {
            taxa = 10 + ((consumo - 50)*0.25);
        } else if (consumo > 100 && consumo <= 200) {
            taxa = 10 + ((consumo - 100)*0.35);
        } else {
            taxa = 10 + ((consumo - 200)*0.35);
        }
        return taxa;
    }
    public double getConsumo() {
        return consumo;
    }
    public double getTaxa(){
        return calculo();
    }
    public void exibeDados(){
        System.out.println("===================================================");
        System.out.println("Consumo = " + getConsumo());
        System.out.println("Valos à pagar = " + getTaxa());
        System.out.println("===================================================");
    }
    public static void main(String[] args){
        TestQuestion6.test();
    }
}
