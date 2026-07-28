package application_capitulo8;

import entities_capitulo8.CurrencyConverter;

import java.util.Scanner;

public class ConversaoDolar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("What is the dollar price? ");
        double dollar = sc.nextDouble();
        System.out.println("How many dollars will be bought? ");
        double money = sc.nextDouble();

        double result = CurrencyConverter.taxDolar(dollar, money);

        System.out.printf("Amount to be paid in reais = %.2f%n", result);

    }
}
