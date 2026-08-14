package application_lista_de_arraylist;

import entities_lista_de_arraylist.Autor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Livro {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Autor> autores = new ArrayList<>();

        Autor a = new Autor (123, "Harry Potter", "JK", 45);
        autores.add(a);

        System.out.println("Digite o nome do autor: ");
        String nome = sc.nextLine();

        Autor at = autores.stream().filter(x -> x.getAutor().equals(nome))
                .findFirst().orElse(null);



        sc.close();

    }

    }
