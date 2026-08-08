package application_lista_de_arraylist;


import entities_lista_de_arraylist.Aluno;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Escola {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Aluno> list = new ArrayList<>();

        System.out.println("Digite a quantidade de alunos: ");
        int n = sc.nextInt();

        System.out.println();
        sc.nextLine();

        for (int i = 0; i < n; i++){
            System.out.println("Aluno #" + (i + 1) + ":");
            System.out.println("Matrícula: ");
            int matricula = sc.nextInt();
            while (verificacaoMatricula(list, matricula)){
                System.out.println("Matrícula já registrada! Digite novamente: ");
                matricula = sc.nextInt();
            }
            sc.nextLine();
            System.out.println("Nome: ");
            String nome = sc.nextLine();
            System.out.println("Nota final: ");
            double nota = sc.nextDouble();

            Aluno a = new Aluno(matricula, nome, nota);
            list.add(a);

        }

        System.out.println();

        System.out.println("Digite a matrícula para adicionar pontos extras: ");
        int matriculaPonto = sc.nextInt();

        Aluno a = list.stream().filter(x -> x.getMatricula() == matriculaPonto)
                        .findFirst().orElse(null);

        if (a == null) {
            System.out.println("Matrícula inexistente!");
        } else {
            System.out.println("Digite a quantidade de pontos: ");
            double pontoExtra = sc.nextDouble();
            a.pontosExtras(pontoExtra);

            if (a.getNotaFinal() == 100) {
                System.out.println("Pontos adicionados! A nota foi ajustada para o limite máximo de 100.");
            }
        }

        System.out.println();

        System.out.println("--- ALUNOS CADASTRADOS ---");
        for (Aluno aluno : list){
            System.out.println(aluno);
        }

        sc.close();
    }

    public static boolean verificacaoMatricula(List<Aluno> list, int matricula){
        Aluno a = list.stream().filter(x -> x.getMatricula() == matricula)
                  .findFirst().orElse(null);
        return a != null;
    }
}
