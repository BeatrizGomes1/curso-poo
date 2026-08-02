package application_lista_de_arraylist;

import entities_lista_de_arraylist.Aluno;
import entities_lista_de_arraylist.Carro;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Concessionaria {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Carro> car = new ArrayList<>();

        System.out.println("Quantos carros deseja cadastrar? ");
        int n = sc.nextInt();

        System.out.println();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Carro #" + (i + 1) + ":");
            System.out.println("Placa: ");
            String placa = sc.nextLine();
            while(verificacaoPlaca(car, placa)) {
                System.out.println("Placa já registrada! Digite novamente: ");
                placa = sc.nextLine();
            }
            System.out.println("Modelo: ");
            String modelo = sc.nextLine();
            System.out.println("Quilometragem: ");
            int qui = sc.nextInt();
            sc.nextLine();

            Carro c = new Carro(placa, modelo, qui);
            car.add(c);
        }

        System.out.println();

        System.out.println("Digite a placa para atualizar a quilometragem: ");
        String placaQui = sc.nextLine();

        Carro c = car.stream().filter(x -> x.getPlaca().equals(placaQui))
                .findFirst().orElse(null);

        if (c == null){
            System.out.println("Erro: Veículo com placa " + placaQui + " não foi encontrado!");
        } else {
            System.out.println("Km percorridos: ");
            int km = sc.nextInt();
            c.attKm(km);
        }

        System.out.println();
        System.out.println("--- FROTA DE VEÍCULOS ---");
        for (Carro ca : car) {
            System.out.println(ca);
        }

        sc.close();

    }

    public static boolean verificacaoPlaca(List<Carro> list, String placa){
        Carro carro = list.stream().filter(x -> x.getPlaca().equals(placa))
                .findFirst().orElse(null);
        return carro != null;
    }
}
