package application_capitulo8;

import entities_capitulo8.Student;

import java.util.Scanner;

public class Escola {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student estudante = new Student();

        System.out.println("Nome: ");
        estudante.nome = sc.nextLine();
        System.out.println("Nota Primeiro Semestre: ");
        estudante.s1 = sc.nextDouble();
        System.out.println("Nota Segundo Semestre: ");
        estudante.s2 = sc.nextDouble();
        System.out.println("Nota Terceiro Semestre: ");
        estudante.s3 = sc.nextDouble();

        double resultado = estudante.finalGrade();
        System.out.printf("FINAL GRADE = %.2f%n " , resultado);
        if (resultado >= 60) {
             System.out.println("PASS");
        } else {
            double resultadoNegativo = estudante.missing();
            System.out.println("FAILED");
            System.out.println("MISSING " + String.format("%.2f", resultadoNegativo) + " POINTS" );
        }

        sc.close();
    }

}
