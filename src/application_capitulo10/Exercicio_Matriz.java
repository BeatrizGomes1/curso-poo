package application_capitulo10;

import java.util.Scanner;

public class Exercicio_Matriz {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Número de linhas: ");
        int linhas = sc.nextInt();
        System.out.println("Número de colunas: ");
        int colunas = sc.nextInt();

        int[][] matriz = new int[linhas][colunas];

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println();

        System.out.println("Digite o número que deseja saber a posição: ");
        int numero = sc.nextInt();

        int posicao = -1;
        int posicao1 = -1;
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                if (matriz[i][j] == numero){
                    posicao = i;
                    posicao1 = j;
                }
            }
        }

        if (posicao != -1) {
            System.out.println("Posição do valor " + numero + ": " + posicao + " , " + posicao1);
        } else {
            System.out.println("Valor não encontrado!");
        }

        sc.close();

    }
}
