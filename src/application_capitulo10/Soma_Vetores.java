package application_capitulo10;

import java.util.Scanner;

public class Soma_Vetores {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos valores vai ter cada vetor? ");
        int n = sc.nextInt();

        int [] vect1 = new int [n];
        int [] vect2 = new int [n];
        int [] vect3 = new int [n];

        for (int i = 0; i < n; i++) {
            System.out.println("Digite os valores do vetor A: ");
            vect1[i] = sc.nextInt();
        }

        System.out.println();

        for (int j = 0; j < n; j++) {
            System.out.println("Digite os valores do vetor B: ");
            vect2[j] = sc.nextInt();
        }

        System.out.println("VETOR RESULTANTE: ");
        for (int i=0; i<n; i++) {
            vect3[i] = vect1[i] + vect2[i];
        }

        for (int i=0; i<n; i++) {
            System.out.println(vect3[i]);
        }

        sc.close();
    }
}
