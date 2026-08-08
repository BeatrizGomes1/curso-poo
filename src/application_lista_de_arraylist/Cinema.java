package application_lista_de_arraylist;

import entities_lista_de_arraylist.Filme;
import entities_lista_de_arraylist.Funcionario;

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
            while (verificacaoId(filme, id)){
                System.out.println("Id já cadastrado! Digite novamente: ");
                id = sc.nextInt();
            }
            sc.nextLine();
            System.out.println("Nome: ");
            String nome = sc.next();
            System.out.println("Ingressos: ");
            int ingressos = sc.nextInt();

            Filme f = new Filme(id, nome, ingressos);
            filme.add(f);
        }

        System.out.println();

        System.out.println("Digite o ID do Filme: ");
        int comprarIngresso = sc.nextInt();


        sc.close();

    }

    public static boolean verificacaoId(List<Filme> list, int id){
        Filme f = list.stream().filter(x -> x.getId() == id)
                .findFirst().orElse(null);
        return f != null;
    }
}
