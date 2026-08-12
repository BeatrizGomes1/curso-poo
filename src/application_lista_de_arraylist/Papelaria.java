package application_lista_de_arraylist;

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
                System.out.println("Digite o código do produto: ");
                int codigo = sc.nextInt();
                System.out.println("Digite o nome do produto: ");
                String nome = sc.nextLine();
                System.out.println("Digite a quantidade do produto: ");
                int quantidade = sc.nextInt();

                Produto1 produto1 = new Produto1(codigo, nome, quantidade);
                produto.add(produto1);
            } if (resp == 2) {

            }

        } while (resp != 6);

        sc.close();

    }

}
