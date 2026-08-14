package application_lista_de_arraylist;

import entities_lista_de_arraylist.Autor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Livro {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Autor> autores = new ArrayList<>();

        Autor a = new Autor (123, "Harry Potter", "JK", 45.99);
        Autor b = new Autor (456, "Dom Quixote", "Miguel de Cervantes", 55.99);
        Autor c = new Autor (789, "1984", "George Orwell", 38.99);

        autores.add(a);
        autores.add(b);
        autores.add(c);

        System.out.println("Digite o nome do autor: ");
        String nome = sc.nextLine();

        Autor at = autores.stream().filter(x -> x.getAutor().equalsIgnoreCase(nome))
                .findFirst().orElse(null);

        if  (at == null) {
            System.out.println("Autor não encontrado!");
        } else {
            System.out.println("--- INFORMAÇÕES ---");

            System.out.println(at);
        }

        sc.close();

    }

    }
