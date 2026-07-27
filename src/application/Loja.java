package application;

import entities.Product;

import java.util.Scanner;

public class Loja {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Product product = new Product();
        System.out.println("Enter product data: ");
        System.out.println("Name: ");
        product.name = sc.nextLine();
        System.out.println("Price: ");
        product.price = sc.nextDouble();
        System.out.println("Quantity in stock: ");
        product.quantity = sc.nextInt();

        System.out.println(product.name + ", "
                + product.price + ", "
                + product.quantity);
    }
}
