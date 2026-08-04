package application_lista_de_arraylist;

import entities_lista_de_arraylist.Contato;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Telefone {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Contato> list = new ArrayList<>();

        System.out.println("Cadastrar quantos contatos ?");
        int n  = sc.nextInt();

        System.out.println();

        for (int i = 0; i < n; i++) {
            System.out.println("ID: ");
            int id = sc.nextInt();
            System.out.println("Nome: ");
            String nome = sc.next();
            System.out.println("Telefone: ");
            String telefone = sc.next();

            list.add(new Contato(id, nome, telefone));
        }

        sc.close();

    }
}
