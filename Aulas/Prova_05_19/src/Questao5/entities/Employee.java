package Questao5.entities;

public class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void increaseSalary(double percentage) {
        salary += salary*(percentage/100); // o salário vai aumentar referente ao valor do salário atual multiplicado pelo valor decimal que representa a porcentagem do aumento
    }

    public String toString() {
        return String.format("%d, %s, %.2f", id, name, salary);
    }
}
