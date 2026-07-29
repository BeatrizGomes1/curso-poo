package application_capitulo10;

import java.util.Scanner;

public class Maior_Posicao {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int posMaior = 0;
        double maior;

        System.out.println("Quantos números você vai digitar? ");
        int n = sc.nextInt();
        int [] vect = new int [n];

        for (int i = 0; i < vect.length; i++){
            System.out.println("Digite um número: ");
            vect[i] = sc.nextInt();
        }

        maior = vect[0];

        for (int i = 0; i < vect.length; i++){
            if (vect[i] > maior) {
                maior = vect[i];
                posMaior = i;
            }
        }

        System.out.printf("MAIOR VALOR = %.1f\n", maior);
        System.out.printf("POSICAO DO MAIOR VALOR = %d\n", posMaior);

        sc.close();
    }
}
