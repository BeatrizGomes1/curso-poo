package application;

import entities.Rectangle;

import java.util.Scanner;

public class CalculoRetangulo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Rectangle retangulo;
        retangulo = new Rectangle();

        System.out.println("Enter rectangle width and height: ");
        retangulo.width = sc.nextDouble();
        retangulo.height = sc.nextDouble();

        double area = retangulo.area();
        double perimetro = retangulo.perimeter();
        double diagonal = retangulo.diagonal();

        System.out.printf("AREA = %.2f%n" , area);
        System.out.printf("PERIMETER = %.2f%n" , perimetro);
        System.out.printf("DIAGONAL = %.2f%n" , diagonal);

        sc.close();
    }
}
