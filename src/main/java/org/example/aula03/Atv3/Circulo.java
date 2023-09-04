package src.main.java.org.example.Atv3;

public class Circulo {
    private double raio;
    public void setRaio(double r) {
        raio = r;
    }
    public double getRaio() {
        return raio;
    }
    public double calculaDiametro(){
        return raio * 2;
    }
    public double calculaArea() {
        return Math.PI * Math.pow(raio, 2);
    }
    public double calculaCircunferencia() {
        return 2 * Math.PI * raio;
    }
    public void exibeDados() {
        System.out.printf("Raio: %5.1f", raio);
        System.out.printf("Diâmetro: %5.1f",  calculaDiametro());
        System.out.printf("Área: %5.1f", calculaArea());
        System.out.printf("Circunferência: %5.1f", calculaCircunferencia());
    }
    public static void main(String[] args) {
        TestCirculo.test();
    }

}


