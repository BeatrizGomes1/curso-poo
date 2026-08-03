package application_lista_de_arraylist;

import entities_lista_de_arraylist.Conta;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Banco {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Conta> list = new ArrayList<>();

        System.out.println("Quantidade de contas a cadastrar: ");
        int n = sc.nextInt();

        System.out.println();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Conta: #" + (i + 1) + ": ");
            System.out.println("Número da conta: ");
            int numero = sc.nextInt();
            while (temCodigo(list, numero)) {
                System.out.println("Conta já cadastrada! Digite novamente: ");
                numero = sc.nextInt();
            }
            sc.nextLine();
            System.out.println("Títular: ");
            String nome = sc.nextLine();
            System.out.println("Saldo inicial: ");
            double saldo = sc.nextDouble();

            Conta c = new Conta(numero, nome, saldo);
            list.add(c);
        }

        System.out.println();

        System.out.println("--- OPERAÇÃO DE DEPÓSITO ---");
        System.out.println("Conta para depósito: ");
        int conta = sc.nextInt();

        Conta c =  list.stream().filter(x -> x.getNumbConta() == conta)
                .findFirst().orElse(null);

        if (c == null){
            System.out.println("Conta não encontrada!");
        } else {
            System.out.println("Digite o valor do depósito: ");
            double dep = sc.nextDouble();
            c.deposito(dep);
            System.out.println("Depósito efetuado! Novo saldo: " + String.format("%.2f", c.getSaldo()));
        }

        System.out.println();

        System.out.println("--- OPERAÇÃO DE SAQUE ---");
        System.out.println("Conta para saque: ");
        int contaSaque = sc.nextInt();

        Conta cont =  list.stream().filter(x -> x.getNumbConta() == contaSaque)
                .findFirst().orElse(null);

        if (cont == null){
            System.out.println("Conta não encontrada!");
        } else {
            System.out.println("Digite o valor do saque: ");
            double saque = sc.nextDouble();

            if (cont.getSaldo() >= saque + 5.00) {
                cont.saque(saque);
                System.out.println("Saque realizado! (Taxa de R$ 5.00 aplicada). Novo saldo: "
                        + String.format("%.2f", cont.getSaldo()));
            } else {
                System.out.println("Saldo insuficiente!");
            }
        }

        System.out.println();

        System.out.println("--- RELATÓRIO FINAL DE CONTAS ---");
        for (Conta cc : list){
            System.out.println(cc);
        }

        sc.close();

    }

    public static boolean temCodigo(List<Conta> list, int codigo) {
        Conta c =  list.stream().filter(x -> x.getNumbConta() == codigo)
                .findFirst().orElse(null);
        return c != null;
    }
}
