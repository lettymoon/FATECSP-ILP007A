package src.main.java.org.example.aula08.Lista1;

/*
Considere um retângulo representado no sistema de coordenadas cartesianas e definido por dois pontos
P1(x1, y1), que corresponde ao vértice superior esquerdo do retângulo e P2(x2, y2) que corresponde ao
vértice inferior direito. Considere que o retângulo apresenta um lado paralelo ao eixo x e, conseqüentemente,
outro lado paralelo ao eixo y, conforme a figura a seguir:
 */
public class Question16{
    private double x1, y1, x2, y2;

    public void setVertices(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public double calcularBase() {
        return Math.abs(x2 - x1);
    }

    public double calcularAltura() {
        return Math.abs(y2 - y1);
    }

    public double calcularArea() {
        return calcularBase() * calcularAltura();
    }

    public boolean pontoEstaDentro(double x, double y) {
        return x >= x1 && x <= x2 && y >= y1 && y <= y2;
    }

    public void exibirDados() {
        System.out.println("Base do retângulo: " + calcularBase());
        System.out.println("Altura do retângulo: " + calcularAltura());
        System.out.println("Área do retângulo: " + calcularArea());
    }

    public static void main(String[] args) {
        TestQuestion16.test();
    }
}
