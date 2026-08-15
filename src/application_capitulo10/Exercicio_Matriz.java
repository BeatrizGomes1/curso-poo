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

        for(int i = 0; i < linhas; i++){
            for(int j = 0; j < colunas; j++){
                matriz[i][j] = sc.nextInt();
            }
        }

        sc.close();

    }
}
