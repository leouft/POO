package Questao5.application;

import Questao5.entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos funcionários serão cadastrados? ");
        int N = sc.nextInt();

        List<Employee> employees = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            int id;
            boolean flag; // variável usada pra verificar se um ID já foi usado (true = já foi usado)
            do { // Loop que repetirá enquanto o usuário não inserir um ID diferente de todos
                System.out.print("Insira o ID do funcionário: ");
                id = sc.nextInt();

                flag = false;

                for (Employee employee : employees) { // Percorre a lista até encontrar um repetido, se encontrar, flag vira true, então o do-while começa de novo.
                    if (employee.getId() == id) {
                        flag = true;
                        System.out.println("ID já registrado, tente novamente.");
                        break;
                    }
                }
            } while (flag);
            System.out.print("Insira o nome do funcionário: ");
            sc.nextLine(); // Para evitar problema com buffer do teclado
            String name = sc.nextLine();
            System.out.print("Insira o salário do funcionário: ");
            double salary = sc.nextDouble();

            Employee employee = new Employee(id, name, salary);

            employees.add(employee);
        }

        System.out.print("\nInsira o ID do funcionário que terá o aumento de salário: ");
        int id = sc.nextInt();

        for (int i = 0; i < N; i++) { // Percorre os funcionários pra encontrar o que tem o mesmo ID inserido
            if (employees.get(i).getId() == id){
                System.out.print("Qual a porcentagem do aumento de salário do funcionário? ");
                double percentage = sc.nextDouble();

                employees.get(i).increaseSalary(percentage);
            }
        }

        System.out.println("\nFuncionários: ");
        for(int i = 0; i < N; i++) {
            System.out.println(employees.get(i).toString());
        }

        sc.close();
    }
}
