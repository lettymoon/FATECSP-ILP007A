package src.main.java.org.example.Atv5;

public class AreaTerreno {
    private double lado;
    private double comprimento;
    private double largura;

    public void setLado(double l){
        lado = l;
    }
    public void setComprimento(double c){
        comprimento = c;
    }
    public void setLargura(double lg){
        largura = lg;
    }
    public double calcularAreaQ() {
        return lado * lado;
    }
    public double calcularAreaR() {
        return comprimento * largura;
    }
    public void exibeDados(){
        System.out.println("Área do terreno quadrado: " + calcularAreaQ());
        System.out.println("Área do terreno retangular: " + calcularAreaR());
    }

    public static void main(String[] args) {
        TestAreaTerreno.test();
    }

}

