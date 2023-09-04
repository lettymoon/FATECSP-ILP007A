package src.main.java.org.example.Atv3;

public class ContaCorrente {
    private String NumConta;
    private String titular;
    private double saldo;

    public ContaCorrente(String NumConta, String titular, double saldo){
        this.NumConta = NumConta;
        this.titular = titular;

        if(saldo >= 0){
            this.saldo = saldo;
        }
        else {
            this.saldo = 0;
        }
    }
    public void setTitular(String titular){
        this.titular = titular;
    }
    public void deposito(double quantia){
        if (quantia > 0) {
            saldo += quantia;
            System.out.println("Depósito de " + quantia + " realizado com sucesso.");
        } else {
            System.out.println("A quantia a ser depositada deve ser maior que zero.");
        }
    }
    public void saque(double quantia){
        if (quantia > 0 && quantia <= saldo) {
            saldo -= quantia;
            System.out.println("Saque de " + quantia + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente ou quantia inválida para saque.");
        }
    }
    public void exibirDados(){
        System.out.println("===================================================================");
        System.out.println("Número da Conta: " + NumConta);
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: " + saldo);
        System.out.println("===================================================================");

    }
    public static void main(String[] args){
        TestContaCorrente.test();
    }
}
