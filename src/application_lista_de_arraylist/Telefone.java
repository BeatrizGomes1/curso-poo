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
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("ID: ");
            int id = sc.nextInt();
            while (temId(list, id)) {
                System.out.println("Id já cadastrado! Digite novamente: ");
                id = sc.nextInt();
            }
            sc.nextLine();
            System.out.println("Nome: ");
            String nome = sc.nextLine();
            System.out.println("Telefone: ");
            String telefone = sc.nextLine();

            list.add(new Contato(id, nome, telefone));
        }

        int resp;
        do {
            System.out.println();
            System.out.println("Digite uma opcao que deseja fazer : ");
            System.out.println("1 - Buscar, 2 - Alterar, 3 - Remover, 4 - Listar, 5 - Sair");
            resp = sc.nextInt();
            sc.nextLine();
            if (resp == 1) {
                System.out.println();
                System.out.println("--- LISTAR CONTATO ---");
                System.out.println("Digite o nome do contato: ");
                String nomeBusca = sc.nextLine();

                Contato c =  list.stream().filter(x -> x.getNome().equals(nomeBusca))
                        .findFirst().orElse(null);

                if  (c == null) {
                    System.out.println("Contato inexistente!");
                } else {
                    System.out.println("Id: " + c.getId() + ", Nome: " + c.getNome() + ", Telefone: " + c.getNumero());
                }
            } else if (resp == 2) {
                System.out.println();
                System.out.println("--- ALTERAR TELEFONE ---");
                System.out.println("Digite o número do contato: ");
                String numeroMudar = sc.nextLine();

                Contato c =  list.stream().filter(x -> x.getNumero().equals(numeroMudar))
                        .findFirst().orElse(null);

                if  (c == null) {
                    System.out.println("Número não cadastrado!");
                } else {
                    System.out.println("Novo número: ");
                    String numeroAlterado = sc.nextLine();
                    c.setNumero(numeroAlterado);
                    System.out.println("Número do contato: " + c.getNome() + ", alterado para: " + numeroAlterado);
                }

            } else if (resp == 3) {
                System.out.println();
                System.out.println("--- REMOVER CONTATO ---");

                System.out.println("Digite o número do contato: ");
                String removerContato = sc.nextLine();

                Contato c =  list.stream().filter(x -> x.getNumero().equals(removerContato))
                        .findFirst().orElse(null);

                if  (c == null) {
                    System.out.println("Número não cadastrado!");
                } else {
                    list.remove(c);;
                    System.out.println("Contato removido com sucesso!");
                }

            } else if  (resp == 4) {
                System.out.println();
                System.out.println("--- LISTA DE CONTATOS ---");
                for (Contato c : list) {
                    System.out.println(c);
                }

            } else if (resp == 5) {
                System.out.println();
                System.out.println("Saindo da agenda...");
            }

        } while (resp != 5);

        sc.close();

    }

    public static boolean temId(List<Contato> list, int id) {
        Contato c =  list.stream().filter(x -> x.getId() == id)
                .findFirst().orElse(null);
        return c != null;
    }
}
