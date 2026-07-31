package application_capitulo10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lista {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> list = new ArrayList<>();

        //Adicionando elementos a lista
        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");

        //Adicionando elemento em posição já ocupada
        list.add(2, "Marco");

        //Ver tamanho da lista
        System.out.println(list.size());

        for (String x : list) {
            System.out.println(x);
        }

        System.out.println("----------------");
        //Remover elemento passando o nome no parametro
        list.remove("Bob");

        //Remover baseado na posição
        list.remove(1);

        //Removendo baseado no predicado
        list.removeIf(x -> x.charAt(0) == 'M');
        for (String x : list) {
            System.out.println(x);
        }

        sc.close();
    }
}
