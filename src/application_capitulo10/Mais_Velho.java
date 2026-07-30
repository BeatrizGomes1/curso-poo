package application_capitulo10;

import entities_capitulo10.Pessoa_1;

import java.util.Scanner;

public class Mais_Velho {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas pessoas você vai digitar? ");
        int n = sc.nextInt();
        Pessoa_1[] vect = new Pessoa_1[n];

        for (int i = 0; i < vect.length; i++) {
            sc.nextLine();
            System.out.println("Dados da " + (i + 1) + "a pessoa: ");
            System.out.println("Nome: ");
            String nome = sc.nextLine();
            System.out.println("Idade: ");
            int idade = sc.nextInt();
            vect[i] = new Pessoa_1(nome, idade);
        }

        int maiorIdade = vect[0].getIdade();
        String posicaoMaior = vect[0].getNome();

        for (int j = 0; j < vect.length; j++) {
            if (vect[j].getIdade() > maiorIdade) {
                maiorIdade = vect[j].getIdade();
                posicaoMaior = vect[j].getNome();
            }
        }

        System.out.println("PESSOA MAIS VELHA: " + posicaoMaior);

        sc.close();
    }
}
