package application;

import java.util.Scanner;

public class Versao1 {

    //Final serve para informar que esse valor é constante e não pode mudar
    //Padrao para nomes de constante são todas as letras maiusculas
    public static final double PI = 3.14159;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter radius: ");
        double radius = sc.nextDouble();

        double c = circumference(radius);

        double v = volume(radius);

        System.out.printf("Circumference: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI value: %.2f%n", PI);

        sc.close();
    }

    //Como main é static os métodos tambem precisam ser static
    public static double circumference(double radius) {
        return 2.0 * PI * radius;
    }

    public static double volume(double radius) {
        return 4.0 * PI * Math.pow(radius, 3) / 3.0;
    }
}
