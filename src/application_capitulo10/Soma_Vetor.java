package application_capitulo10;

import java.util.Scanner;

public class Soma_Vetor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos números você vai digitar? ");
        int num = sc.nextInt();
        double[] vect = new double[num];

        for (int i = 0; i < vect.length; i++) {
            System.out.println("Digite um número: ");
            vect[i] = sc.nextDouble();
        }

        System.out.println("VALORES = ");
        double sum = 0.0;

        for (int i = 0; i < vect.length; i++) {
            System.out.println(vect[i]);
            sum += vect[i];
        }

        double avg = sum / vect.length;

        System.out.printf("SOMA = %.2f%n" , sum);
        System.out.printf("MÉDIA = %.2f%n" , avg);

        sc.close();
    }
}
