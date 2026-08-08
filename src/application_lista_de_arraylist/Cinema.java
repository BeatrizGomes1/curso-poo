package application_lista_de_arraylist;

import entities_lista_de_arraylist.Filme;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cinema {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Filme> filme = new ArrayList<>();

        System.out.println("Quantidade de filmes em cartaz: ");
        int n = sc.nextInt();

        System.out.println();

        for (int i = 0; i < n; i++) {
            System.out.println("Filme " + (i + 1) + ":");
            System.out.println("ID: ");
            int id = sc.nextInt();
            System.out.println("Nome: ");
            String nome = sc.next();
            System.out.println("Ingressos: ");
            int ingressos = sc.nextInt();

            Filme f = new Filme(id, nome, ingressos);
            filme.add(f);
        }

        sc.close();

    }
}
