package entities_capitulo8;

public class CurrencyConverter {

    public static final double IOF = 0.06;

    public static double taxDolar (double dollarPrice, double money) {
        double total = dollarPrice * money;
        double tax = total * IOF;
        return total + tax;
    }
}
