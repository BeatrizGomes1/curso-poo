package entities_capitulo9;

public class Account {

    private int numbCont;
    private String titular;
    private double deposito;

    public Account (int numbCont, String titular, double deposito) {
        this.numbCont = numbCont;
        this.titular = titular;
        this.deposito = deposito;
    }

    public Account (int numbCont, String titular) {
        this.numbCont = numbCont;
        this.titular = titular;
    }

    public int getNumbCont() {
        return numbCont;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getDeposito() {
        return deposito;
    }

    public double depValor(double amount) {
        return deposito += amount;
    }

    public double saqueValor(double amount) {
        return deposito -= amount + 5.00;
    }

    public String toString (){
        return "Account "
                + numbCont
                + ", "
                + "holder: "
                + titular
                + ", "
                + "Balance: $ "
                + String.format("%.2f", deposito);
    }
}
