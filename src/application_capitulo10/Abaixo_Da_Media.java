package application_capitulo10;

import java.util.Scanner;

public class Abaixo_Da_Media {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double somaVetor = 0.0;
        double media = 0.0;

        System.out.println("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();
        double [] vect = new double [n];

        for (int i = 0; i < vect.length; i++) {
            System.out.println("Digite um número: ");
            vect[i] = sc.nextDouble();

            somaVetor += vect[i];
        }

        media = somaVetor / vect.length;

        System.out.println("MÉDIA DO VETOR = " + media);

        System.out.println("ELEMENTOS ABAIXO DA MÉDIA:");
        for (int i = 0; i < vect.length; i++) {
            if (vect[i] < media) {
                System.out.println(vect[i]);
            }
        }

        sc.close();
    }

}
