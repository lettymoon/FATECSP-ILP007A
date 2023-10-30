package src.main.java.org.example.Atv10;

public class Veiculo{
	protected String modelo, placa;
    protected int anoFabr;
    protected double valor;

	public Veiculo(String pModelo, String pPlaca, int pAnoFabr, double pValor){
        setModelo(pModelo);
        setPlaca(pPlaca);
        setAnoFabr(pAnoFabr);
        setValor(pValor);
   }

	public void setModelo(String pModelo){
   		modelo = pModelo;
	}
    public String getModelo( )  {
        return this.modelo; 		// uso opcional nesse caso
      }
    
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    
    public String getPlaca() {
        return placa;
    }  
    
    public void setAnoFabr(int anoFabr) {
        this.anoFabr = anoFabr;
    }
    
    public int getAnoFabr() {
        return anoFabr;
    } 
    public void setValor(double valor) {
        if (valor >= 0)	
        this.valor = valor;
        else 		
        this.valor = 0;
        }
    
    public double getValor()	{
            return valor;
    }  
    
    public void deprecia(float taxa) {
        setValor(valor -= valor * taxa/100);
    }
    
    public void imprime(){
        System.out.printf(" \nVeiculo: %s\nPlaca: %7s\nAno: %4d\nValor: R$%.2f\n", modelo, placa, anoFabr, valor);                       
    }

    public static void main(String[] args){
        TesteVeiculo.test();
    }
}