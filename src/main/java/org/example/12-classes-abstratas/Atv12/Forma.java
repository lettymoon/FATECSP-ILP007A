package src.main.java.org.example.Atv10;

public abstract class Forma {

    private String cor;

    public Forma() {
    }

    public Forma(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public abstract double area();
    public static void main(String[] args) {
        Forma[] formas = new Forma[3];
        formas[0] = new Retangulo("Azul", 4.0, 5.0);
        formas[1] = new Circulo("Vermelho", 3.0);
        formas[2] = new Retangulo("Verde", 6.0, 8.0);

        for (Forma forma : formas) {
            if (forma instanceof Retangulo) {
                Retangulo retangulo = (Retangulo) forma;
                System.out.printf("Retângulo de cor %s tem área:%5.1f\n", retangulo.getCor(), retangulo.area());
            } else if (forma instanceof Circulo) {
                Circulo circulo = (Circulo) forma;
                System.out.printf("Círculo de cor %s tem área:%5.1f\n", circulo.getCor(), circulo.area());
            }
        }
    }
}
