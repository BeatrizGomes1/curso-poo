package application_capitulo10;

import entities_capitulo10.Dados;

import java.util.Scanner;

public class Dados_Pessoa {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double somaMedia = 0.0;
        int contMulheres = 0;
        int contHomens = 0;
        double mediaFeminina = 0.0;

        System.out.println("Quantas pessoas serão digitadas? ");
        int n = sc.nextInt();
        Dados[] vect = new Dados[n];

        for (int i = 0; i < vect.length; i++) {
            sc.nextLine();
            System.out.println("Altura da " + (i + 1) + "a pessoa: ");
            double altura = sc.nextDouble();
            System.out.println("Genero da " + (i + 1) + "a pessoa: (f/m)");
            char genero = sc.next().charAt(0);

            vect[i] = new Dados(altura, genero);
        }

        double maiorAltura = vect[0].getAltura();
        double menorAltura = vect[0].getAltura();

        for (int i = 0; i < vect.length; i++) {
            if (vect[i].getAltura() < menorAltura) {
                menorAltura = vect[i].getAltura();
            }
        }

        for (int i = 0; i < vect.length; i++) {
            if (vect[i].getAltura() > maiorAltura) {
                maiorAltura = vect[i].getAltura();
            }
        }

        for (int i = 0; i < vect.length; i++) {
            if (vect[i].getSexo() == 'f') {
                somaMedia += vect[i].getAltura();
                contMulheres++;
            } else {
                contHomens++;
            }
        }

        mediaFeminina = (double) somaMedia / contMulheres;

        System.out.printf("Menor altura = %.2f%n ", menorAltura);
        System.out.printf("Maior altura = %.2f%n ", maiorAltura);
        System.out.printf("Média das alturas das mulheres = %.2f%n ", mediaFeminina);
        System.out.println("Número de homens = " + contHomens);

        sc.close();
    }
}
