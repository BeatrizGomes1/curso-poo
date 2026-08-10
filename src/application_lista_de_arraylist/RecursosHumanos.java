package application_lista_de_arraylist;

import entities_lista_de_arraylist.Funcionario;
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

            System.out.println("--- SISTEMA DE RECURSOS HUMANOS ---");
            System.out.println("Opção 1 - Cadastrar novo funcionário ");
            System.out.println("Opção 2 - Aumentar salário ");
            System.out.println("Opção 3 - Mudança de departamento ");
            System.out.println("Opção 4 - Relatório do funcionário ");
            System.out.println("Opção 5 - Encerrar ");
            System.out.println("Escolha uma opção: ");
            resp = sc.nextInt();

            if (resp == 1) {
                System.out.println("Id: ");
                int id = sc.nextInt();
                //Verifica se id já existe
                while (verificacaoId(funcionarios, id)) {
                    System.out.println("Id já cadastrado! Digite novamente: ");
                    id = sc.nextInt();
                }
                sc.nextLine();
                System.out.println("Nome: ");
                String nome = sc.nextLine();
                System.out.println("Salário: ");
                double salario = sc.nextDouble();
                sc.nextLine();
                System.out.println("Departamento: ");
                String depto = sc.nextLine();
                System.out.println("Funcionário cadastrado com sucesso!");

                Funcionarios funcionario = new Funcionarios(id, nome, salario, depto);
                funcionarios.add(funcionario);

            } else if (resp == 2) {
                System.out.println("ID do funcionário: ");
                int idMudarSalario = sc.nextInt();
                Funcionarios f = funcionarios.stream().filter(x -> x.getId() == idMudarSalario)
                        .findFirst().orElse(null);
                if (f == null) {
                    System.out.println("Id não encontrado!");
                } else {
                    System.out.println("Porcentagem de aumento: (%)");
                    double porcentagem = sc.nextDouble();
                    f.increaseSalary(porcentagem);
                    System.out.println("Aumento de " + porcentagem + "% concedido! Novo salário: R$" + String.format("%.2f", f.getSalario()));
                }
            } else if (resp == 3) {
                System.out.println("ID do funcionário: ");
                int idMudarSetor = sc.nextInt();
                Funcionarios f = funcionarios.stream().filter(x -> x.getId() == idMudarSetor)
                        .findFirst().orElse(null);
                sc.nextLine();
                if (f == null) {
                    System.out.println("Id não encontrado!");
                } else {
                    System.out.println("Novo departamento: ");
                    String dep = sc.nextLine();
                    f.setCargo(dep);
                    System.out.println("Transferência realizada com sucesso para o departamento: " + f.getCargo());
                }
            } else if (resp == 4) {
                System.out.println("--- RELATÓRIO DO FUNCIONÁRIO ---");
                for (Funcionarios f : funcionarios) {
                    System.out.println(f);
                }
            } else if (resp == 5) {
                System.out.println("Encerrando sistema de RH. Até logo!");
            }

        } while (resp != 5);

        sc.close();
    }

    //Verificação de ID
    public static boolean verificacaoId(List<Funcionarios> list, int id){
        Funcionarios f = list.stream().filter(x -> x.getId() == id)
                .findFirst().orElse(null);
        return f != null;
    }
}
