package Exercicio1.application;

import Exercicio1.entities.Department;
import Exercicio1.entities.HourContract;
import Exercicio1.entities.Worker;
import Exercicio1.enums.WorkerLevel;

import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Enter department's name: ");
        Department department = new Department(sc.nextLine());

        System.out.println("Enter workder data:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Level: ");
        WorkerLevel level = WorkerLevel.valueOf(sc.nextLine().toUpperCase());
        System.out.print("Base salary: ");
        double baseSalary = sc.nextDouble();

        Worker worker = new Worker(name, level, baseSalary, department);

        System.out.print("How many contracts to this worker? ");
        int contracts = sc.nextInt();

        for(int i = 0; i < contracts; i++) {
            System.out.printf("Enter contract #%d data: \n", i+1);
            System.out.print("Date (DD/MM/YYYY): ");
            sc.nextLine();
            String dateStr = sc.nextLine();
            String[] dateSplit  = dateStr.split("/");
            Date date = new Date(Integer.parseInt(dateSplit[2]) - 1900, Integer.parseInt(dateSplit[1]) - 1, Integer.parseInt(dateSplit[0]) );
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            System.out.print("Duration (hours): ");
            int hours = sc.nextInt();

            HourContract contract = new HourContract(date, valuePerHour, hours);

            worker.addContract(contract);
        }

        System.out.print("\nEnter month and year to calculate income (MM/YYYY): ");
        sc.nextLine();
        String dateStr = sc.nextLine();
        String[] dateSplit = dateStr.split("/");
        System.out.println("Name: " + worker.getName());
        System.out.println("Department: " + worker.getDepartment());
        System.out.printf("Income for %s: %.2f", dateStr, worker.income(Integer.parseInt(dateSplit[1]), Integer.parseInt(dateSplit[0])));
    }
}
