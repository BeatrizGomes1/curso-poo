package application_capitulo10;

import entities_capitulo10.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Empresa {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();

        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();

        System.out.println();

        for (int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.println("Employee #" + (i + 1) + ":");
            System.out.println("Id: ");
            int id = sc.nextInt();
            while (hasId(list, id)) {
                System.out.println("Id already taken! Try again: ");
                id = sc.nextInt();
            }
            sc.nextLine();
            System.out.println("Name: ");
            String name = sc.nextLine();
            System.out.println("Salary: ");
            double salary = sc.nextDouble();

            Employee emp = new Employee(id, name, salary);
            list.add(emp);
        }

        System.out.println();

        /*
        System.out.println("Enter the employee id that will have salary increase : ");
        int idIncrease = sc.nextInt();
        Integer pos = position(list, idIncrease);
        if (pos == null){
            System.out.println("This id does not exits!");
        } else {
            System.out.println("Enter the percentage: ");
            double percent = sc.nextDouble();
            list.get(pos).increaseSalary(percent);
        }
         */

        System.out.println("Enter the employee id that will have salary increase : ");
        int idIncrease = sc.nextInt();

        Employee emp = list.stream().filter(x -> x.getId() == idIncrease)
                .findFirst().orElse(null);

        if (emp == null){
            System.out.println("This id does not exits!");
        } else {
            System.out.println("Enter the percentage: ");
            double percent = sc.nextDouble();
            emp.increaseSalary(percent);
        }

        System.out.println();
        System.out.println("List of employees: ");
        for (Employee e : list) {
            System.out.println(e);
        }

        sc.close();
    }

    public static Integer position(List<Employee> list, int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                return i;
            }
        }
        return null;
    }

    //Verifica se o ID ja foi usado
    public static boolean hasId(List<Employee> list, int id) {
        Employee emp = list.stream().filter(x -> x.getId() == id)
                .findFirst().orElse(null);
        return emp != null;
    }

}
