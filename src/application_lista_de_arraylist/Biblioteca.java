package application_lista_de_arraylist;

import entities_lista_de_arraylist.Livro;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Biblioteca {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Livro> list = new ArrayList<>();

        System.out.println("Quantidade de livros para cadastrar: ");
        int n = sc.nextInt();

        System.out.println();
        sc.nextLine();

        for (int i = 0; i < n; i++){
            System.out.println("Livro #" + (i + 1) + ":");
            System.out.println("Código: ");
            int codigo = sc.nextInt();
            while (temCodigo(list, codigo)){
                System.out.println("Código já cadastrado! Digite novamente:");
                codigo = sc.nextInt();
            }
            sc.nextLine();
            System.out.println("Título: ");
            String titulo = sc.nextLine();
            System.out.println("Estoque: ");
            int estoque = sc.nextInt();

            Livro livro = new Livro(codigo, titulo, estoque);
            list.add(livro);
        }

        System.out.println();

        System.out.println("Digite o código do livro para empréstimo: ");
        int emp = sc.nextInt();

        Livro l = list.stream().filter(x -> x.getCodigo() == emp)
                .findFirst().orElse(null);

        if (l == null){
            System.out.println("Código inexistente!");
        } else {
            System.out.println("Digite a quantidade a ser emprestada: ");
            int quant = sc.nextInt();
            l.emprestar(quant);

            if (quant > l.getQuantidade()){
                System.out.println("Erro: Operação cancelada. Estoque insuficiente! (Disponível: " + l.emprestar(quant));
            } else {
                System.out.println("Empréstimo feito com sucesso! Quantidade restante: " + l.emprestar(quant));
            }
        }

        System.out.println();
        System.out.println("--- CATÁLOGO DE LIVROS ---");
        for (Livro lv : list){
            System.out.println(l);
        }

        sc.close();
    }

    public static boolean temCodigo(List<Livro> list, int codigo) {
        Livro l =  list.stream().filter(x -> x.getCodigo() == codigo)
                .findFirst().orElse(null);
        return l != null;
    }
}
