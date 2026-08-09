package application_lista_de_arraylist;

import entities_lista_de_arraylist.Funcionarios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RecursosHumanos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Funcionarios> funcionarios = new ArrayList<>();

        int resp;
        do {

            System.out.println("Opção 1 - Cadastrar novo funcionário: ");
            System.out.println("Opção 2 - Aumentar salário: ");
            System.out.println("Opção 3 - Mudança de departamento: ");
            System.out.println("Opção 4 - Relatório do funcionário: ");
            System.out.println("Opção 5 -Encerrar: ");
            resp = sc.nextInt();



        } while (resp != 5);

        sc.close();
    }
}
