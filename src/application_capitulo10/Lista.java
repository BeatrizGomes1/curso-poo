package application_capitulo10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Lista {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> list = new ArrayList<>();

        //Adicionando elementos a lista
        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");
        list.add("Amanda");
        list.add("Aline");

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
        System.out.println("----------------");
        //Encontar posição de elemento
        System.out.println("Index of Anna: " + list.indexOf("Anna"));

        //Posição de quem nao existe
        System.out.println("Index of Lais: " + list.indexOf("Lais"));

        //Imprimir apenas as pessoas com a letra A
        System.out.println("----------------");
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
        for (String x : result) {
            System.out.println(x);
        }

        //Encontrar primeiro elemento que comece com letra A
        System.out.println("---------------------");
        String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
        System.out.println(name);

        sc.close();
    }
}
