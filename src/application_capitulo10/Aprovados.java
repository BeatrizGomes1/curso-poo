package application_capitulo10;

import entities_capitulo10.Aluno;

import java.util.Scanner;

public class Aprovados {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double media;

        System.out.println("Quantos alunos serão digitados? ");
        int n = sc.nextInt();
        Aluno[] vect = new Aluno[n];

        for (int i = 0; i < vect.length; i++) {
            sc.nextLine();
            System.out.println("Digite nome, primeira e segunda nota do "
                    + (i + 1) + "o aluno:");
            String nome = sc.nextLine();
            double nota1 = sc.nextDouble();
            double nota2 = sc.nextDouble();
            vect[i] = new Aluno(nome, nota1, nota2);
        }

        System.out.println("Alunos aprovados:");
        for (int i = 0; i < vect.length; i++) {
            media = (vect[i].getNota1() + vect[i].getNota2()) / 2.0;
            if (media >= 6.0) {
                System.out.println(vect[i].getNome() + ", média: "
                        + String.format("%.2f", media));
            }
        }

        sc.close();
    }
}
