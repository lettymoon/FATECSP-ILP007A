package src.main.java.org.example.Atv10;

public class Caminhao extends Veiculo {
    private double capacidade;
    private int numeroEixos;

    public Caminhao(String modelo, String placa, int anoFabr, double valor, double capacidade, int numeroEixos) {
        super(modelo, placa, anoFabr, valor);
        setCapacidade(capacidade);
        setNumeroEixos(numeroEixos);
    }

    public double getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(double capacidade) {
        if (capacidade >= 0)
            this.capacidade = capacidade;
        else
            this.capacidade = 0;
    }

    public int getNumeroEixos() {
        return numeroEixos;
    }

    public void setNumeroEixos(int numeroEixos) {
        if (numeroEixos >= 0)
            this.numeroEixos = numeroEixos;
        else
            this.numeroEixos = 0;
    }
    public void imprime() {
        System.out.printf("\nMarca: %s\nPlaca: %7s\nAno: %4d\nValor: R$%.2f\nCapacidade: %.2f toneladas\nNúmero de " + "Eixos: %d\n", getModelo(), getPlaca(), getAnoFabr(), getValor(), capacidade, numeroEixos);
    }
    public static void main(String[] args){
        TesteCaminhao.test();
    }
}
