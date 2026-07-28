package application_capitulo9;

import entities_capitulo9.Account;

import java.util.Scanner;

public class Banco {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account ac;

        System.out.println("Enter account number: ");
        int numero = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter account holder: ");
        String nome = sc.nextLine();
        System.out.println("Is there na initial deposit (y/n)? ");
        char resp = sc.next().charAt(0);
        if (resp == 'y'){
            System.out.println("Enter initial deposit value: ");
            double deposito = sc.nextDouble();
            ac = new Account(numero, nome, deposito);
        } else {
            ac = new Account(numero, nome);
        }

        System.out.println();
        System.out.println("Account data:");
        System.out.println(ac);

        System.out.println();
        System.out.println("Enter a deposit value: ");
        double value = sc.nextDouble();
        ac.depValor(value);
        System.out.println("Updated account data: ");
        System.out.println(ac);

        System.out.println();
        System.out.println("Enter a withdraw value: ");
        value = sc.nextDouble();
        ac.saqueValor(value);
        System.out.println("Updated account data: ");
        System.out.println(ac);

        sc.close();
    }
}
