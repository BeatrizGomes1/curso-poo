package application_lista_de_arraylist;

import entities_lista_de_arraylist.Produto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Loja {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Produto> list = new ArrayList<>();

        System.out.println("Digite quantos produtos deseja cadastrar: ");
        int n = sc.nextInt();

        System.out.println();
        sc.nextLine();
        for (int i = 0; i < n; i++){
            System.out.println("Produto #" + (i + 1));
            System.out.println("Número do código:");
            int codigo = sc.nextInt();
            //Verificar se código já foi cadastrado
            while (temCodigo(list, codigo)){
                System.out.println("Código já cadastrado! Digite novamente:");
                codigo = sc.nextInt();
            }
            sc.nextLine();
            System.out.println("Nome do produto:");
            String nome = sc.nextLine();
            System.out.println("Preço do produto:");
            double valor = sc.nextDouble();

            Produto p = new Produto(codigo, nome, valor);
            list.add(p);
        }

        System.out.println();

        System.out.println("APLICAR DESCONTO");
        System.out.println("Código do produto:");
        int codDesconto = sc.nextInt();

        //Verificar se código existe
        Produto p = list.stream().filter(x -> x.getCodigo() == codDesconto)
                .findFirst().orElse(null);

        if (p == null) {
            System.out.println("Código inexistente!");
        } else {
            System.out.println("Digite a porcentagem de desconto:");
            double desconto = sc.nextDouble();
            p.desconto(desconto);
        }

        System.out.println();

        for (Produto produto : list){
            System.out.println(produto);
        }

        sc.close();

    }

    public static boolean temCodigo(List<Produto> list, int codigo) {
        Produto p =  list.stream().filter(x -> x.getCodigo() == codigo)
                .findFirst().orElse(null);
        return p != null;
    }
}
