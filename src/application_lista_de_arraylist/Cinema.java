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
            while (verificacaoId(filme, id)){
                System.out.println("Id já cadastrado! Digite novamente: ");
                id = sc.nextInt();
            }
            sc.nextLine();
            System.out.println("Nome: ");
            String nome = sc.nextLine();
            System.out.println("Ingressos: ");
            int ingressos = sc.nextInt();

            Filme f = new Filme(id, nome, ingressos);
            filme.add(f);
        }

        System.out.println();

        System.out.println("Digite o ID do Filme: ");
        int comprarIngresso = sc.nextInt();

        //Verificar ID
        Filme f = filme.stream().filter(x -> x.getId() == comprarIngresso)
                .findFirst().orElse(null);

        if (f == null) {
            System.out.println("ID não encontrado!");
        } else {
            System.out.println("Quantidade de ingressos: ");
            int quant = sc.nextInt();
            if (quant >= 1 && quant <= f.getQuantidade()){
                f.vendaIngresso(quant);
                System.out.println("Venda realizada com sucesso! " + quant + " ingressos emitidos.");
            } else {
                System.out.println("Ingressos esgotados ou assentos insuficientes para essa compra!");
            }
        }

        System.out.println();

        System.out.println("--- FILMES EM CARTAZ ---");
        for (Filme f1 : filme) {
            System.out.println(f1);
        }

        sc.close();

    }

    //Verificação de id
    public static boolean verificacaoId(List<Filme> list, int id){
        Filme f = list.stream().filter(x -> x.getId() == id)
                .findFirst().orElse(null);
        return f != null;
    }
}
