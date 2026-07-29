package application_capitulo10;

import entities_capitulo10.Pessoa;

import java.util.Scanner;

public class Registro {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double somaAlturas = 0.0;
        double media;
        double porcentagem = 0.0;
        int menores = 0;

        System.out.println("Quantas pessoas serão registradas? ");
        int n = sc.nextInt();
        Pessoa[] vect = new Pessoa[n];

        for (int i = 0; i < vect.length; i++) {
            sc.nextLine();
            System.out.println("Dados da " + (i + 1) + "a " + "pessoa: ");
            System.out.println("Nome: ");
            String nome = sc.nextLine();
            System.out.println("Idade: ");
            int idade = sc.nextInt();
            System.out.println("Altura: ");
            double altura = sc.nextDouble();
            vect[i] = new Pessoa(nome, idade, altura);
        }

        //Media
        for (int i = 0; i < vect.length; i++) {
            somaAlturas += vect[i].getAltura();
        }
        media = (somaAlturas / vect.length);
        System.out.println("Altura média: " + String.format("%.2f", media));

        //Contagem de menores de 16 anos
        for (int i = 0; i < vect.length; i++) {
            if (vect[i].getIdade() < 16) {
                menores++;
            }
        }

        porcentagem = (menores * 100.0) / vect.length;

        System.out.println("Pessoas com menos de 16 anos: " + String.format("%.2f", porcentagem));

        //Imprime todos os menores de 16 anos
        for (int i = 0; i < vect.length; i++) {
            if (vect[i].getIdade() < 16) {
                System.out.println(vect[i].getNome());
            }
        }

        sc.close();
    }
}
