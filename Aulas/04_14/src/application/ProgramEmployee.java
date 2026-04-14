package application;

import entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class ProgramEmployee {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        Employee emp = new Employee();

        System.out.print("Name: ");
        emp.Name = sc.nextLine();

        System.out.print("Gross salary: ");
        emp.GrossSalary = sc.nextDouble();

        System.out.print("Tax: ");
        emp.Tax = sc.nextDouble();

        System.out.printf("\nEmployee: %s, $ %.2f\n", emp.Name, emp.NetSalary());

        System.out.print("Which percentage to increase salary? ");
        emp.IncreaseSalary(sc.nextDouble());

        System.out.printf("\nUpdated data: %s, $ %.2f\n", emp.Name, emp.NetSalary());
        sc.close();
    }
}
