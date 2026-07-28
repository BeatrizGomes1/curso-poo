package application;

import entities.CalculatorStatic;

import java.util.Scanner;

public class Versao3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter radius: ");
        double radius = sc.nextDouble();

        double c = CalculatorStatic.circumference(radius);

        double v = CalculatorStatic.volume(radius);

        System.out.printf("Circumference: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI value: %.2f%n", CalculatorStatic.PI);

        sc.close();
    }
}
