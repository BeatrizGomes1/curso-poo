package application_lista_de_arraylist;

import entities_lista_de_arraylist.Funcionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CadastroFuncionario {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Funcionario> fun = new ArrayList<>();

        System.out.println("Número de funcionários a cadastrar: ");
        int n = sc.nextInt();

        System.out.println();
        sc.nextLine();

        for (int i = 0; i < n; i++){
            System.out.println("Funcionário #" + (i + 1) + ": ");
            System.out.println("Id: ");
            int id = sc.nextInt();
            while(verificacaoId(fun, id)){
                System.out.println("Id já registrado! Digite novamente: ");
                id = sc.nextInt();
            }
            sc.nextLine();
            System.out.println("Nome: ");
            String nome = sc.nextLine();
            System.out.println("Cargo: ");
            String cargo = sc.nextLine();

            Funcionario f = new Funcionario(id, nome, cargo);
            fun.add(f);
        }

        System.out.println();

        System.out.println("Digite o ID do funcionário a ser removido: ");
        int remover = sc.nextInt();

        Funcionario f = fun.stream().filter(x -> x.getId() == remover)
                .findFirst().orElse(null);

        if (f == null) {
            System.out.println("Id não encontrado!");
        } else {
            fun.remove(f);
            System.out.println("Funcionário " + "' " + f.getNome() + " ' " + "(" + "ID "+ remover + ") " + "removido com sucesso!");
        }

        System.out.println();
        System.out.println("--- LISTA ATUALIZADA DE FUNCIONÁRIOS ---");
        for (Funcionario funcionario : fun){
            System.out.println(funcionario);
        }

        sc.close();

    }

    //Verificar id
    public static boolean verificacaoId(List<Funcionario> list, int id){
        Funcionario f = list.stream().filter(x -> x.getId() == id)
                .findFirst().orElse(null);
        return f != null;
    }
}
