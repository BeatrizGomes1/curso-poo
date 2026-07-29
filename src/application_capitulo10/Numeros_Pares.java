package application_capitulo10;

import java.util.Scanner;

public class Numeros_Pares {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numbPares = 0;

        System.out.println("Quantos números você vai digitar? ");
        int n = sc.nextInt();
        int[] vect = new int [n];

        for (int i = 0; i < vect.length; i++) {
            System.out.println("Digite um número: ");
            vect[i] = sc.nextInt();
        }

        System.out.println("NÚMEROS PARES:");
        for (int i = 0; i < vect.length; i++) {
            if (vect[i] % 2 == 0) {
                System.out.println(vect[i]);
                numbPares ++;
            }
        }

        System.out.println("QUANTIDADE DE PARES:" + numbPares);

        sc.close();
    }
}
