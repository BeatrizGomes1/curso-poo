package application_lista_de_arraylist;

import entities_lista_de_arraylist.Livro;
import entities_lista_de_arraylist.Produto1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Papelaria {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Produto1> produto = new ArrayList<>();

        int resp;
        do {

            System.out.println("--- MENU LOJA ---");
            System.out.println("1 - Cadastrar Produto");
            System.out.println("2 - Adicionar nova quantidade");
            System.out.println("3 - Venda de produto");
            System.out.println("4 - Lista de produtos");
            System.out.println("5 - Sair");
            System.out.println("Escolha uma opção: ");
            resp = sc.nextInt();

            if (resp == 1) {
                System.out.println("Digite a quantidade de produtos a ser adicionada: ");
                int n  = sc.nextInt();

                sc.nextLine();
                for (int i = 0; i < n; i++) {
                    System.out.println("Digite o código do produto: ");
                    int codigo = sc.nextInt();
                    while (temCodigo(produto, codigo)) {
                        System.out.println("Código já cadastrado! Digite novamente: ");
                        codigo = sc.nextInt();
                    }
                    sc.nextLine();
                    System.out.println("Digite o nome do produto: ");
                    String nome = sc.nextLine();
                    System.out.println("Digite a quantidade do produto: ");
                    int quantidade = sc.nextInt();

                    Produto1 produto1 = new Produto1(codigo, nome, quantidade);
                    produto.add(produto1);
                }
            } if (resp == 2) {
                System.out.println();
                System.out.println("Digite o código do produto: ");
                int codigoProduto = sc.nextInt();

                Produto1 p =  produto.stream().filter(x -> x.getCodigo() == codigoProduto)
                        .findFirst().orElse(null);

                if (p != null) {
                    System.out.println("Digite a quantidade do produto: ");
                    int quantidade = sc.nextInt();
                    p.entradaNoEstoque(quantidade);

                    System.out.println("Novo estoque do produto: " + p.getNome() + ": " + p.getEstoque());
                } else {
                    System.out.println("Nenhum produto encontrado!");
                }
            } if (resp == 3) {
                System.out.println();
                System.out.println("Digite o código do produto: ");
                int codigoProdutoVenda = sc.nextInt();

                Produto1 pr =  produto.stream().filter(x -> x.getCodigo() == codigoProdutoVenda)
                        .findFirst().orElse(null);

                if (pr != null) {
                    System.out.println("Digite a quantidade para venda: ");
                    int quantidadeVenda = sc.nextInt();
                    if (quantidadeVenda > pr.getEstoque()) {
                        System.out.println("Produto sem estoque!");
                    } else {
                        pr.saidaNoEstoque(quantidadeVenda);
                        System.out.println("Venda concluída!");
                        System.out.println("Novo estoque do produto: " + pr.getNome() + ": " + pr.getEstoque());
                    }

                } else {
                    System.out.println("Nenhum produto encontrado!");
                }
            } if (resp == 4) {
                System.out.println();
                for (Produto1 produto1 : produto) {
                    System.out.println(produto1);
                }
            } if  (resp == 5) {
                System.out.println("Encerrando...");
            }

        } while (resp != 5);

        sc.close();

    }

    public static boolean temCodigo(List<Produto1> list, int codigo) {
        Produto1 p =  list.stream().filter(x -> x.getCodigo() == codigo)
                .findFirst().orElse(null);
        return p != null;
    }
}
