package application_capitulo10;

import java.util.Scanner;

public class Media_Pares {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int somaPares = 0;
        double media = 0.0;
        int numbPares = 0;

        System.out.println("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();
        int[] vect = new int[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.println("Digite um número: ");
            vect[i] = sc.nextInt();
        }

        for (int i = 0; i < vect.length; i++) {
            if (vect[i] % 2 == 0){
                somaPares += vect[i];
                numbPares ++;
            }
        }

        if (numbPares == 0) {
            System.out.println("NENHUM NÚMERO PAR");
        } else {
            media = (double) somaPares / numbPares;

            System.out.println("MÉDIA DOS PARES = " + media);
        }

        sc.close();
    }
}
