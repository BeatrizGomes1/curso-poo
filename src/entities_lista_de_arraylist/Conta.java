package entities_lista_de_arraylist;

public class Conta {

    private int numbConta;
    private String titular;
    private double saldo;

    public Conta(int numbConta, String titular, double saldo) {
        this.numbConta = numbConta;
        this.titular = titular;
        this.saldo = saldo;
    }

    public int getNumbConta() {
        return numbConta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void deposito (double quantia){
        saldo += quantia;
    }

    public void saque (double quantia){
        saldo -= quantia + 5.00;
    }

    @Override
    public String toString (){
        return "Conta: " + numbConta + " | " + "Titular: " + titular + " | " + "Saldo: " + String.format("%.2f", saldo);
    }
}
