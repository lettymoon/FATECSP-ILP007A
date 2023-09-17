package src.main.java.org.example.aula05.Atv5;

public class Retangulo{
    private double base;
    private double altura;

    public void setBase(double b){
        base = b;
    }
    public void setAltura(double a){
        altura = a;
    }
    public double calcularArea(){
        return base * altura;
    }
    public double calcularPerimetro(){
        return 2 * (altura+base);
    }
    public boolean isSquare(){
        if(altura==base)
            return true;
        else
            return false;
    }
    public void exibeDados(){
        System.out.println("É quadrado? " + isSquare());
        System.out.println("Área do retângulo: " + calcularArea());
        System.out.println("Perímetro do retângulo: " + calcularPerimetro());
        System.out.println("Altura: " + altura);
        System.out.println("Base: " + base);
    }
    public static void main(String[] args){
        TestRetangulo.test();
    }
}
