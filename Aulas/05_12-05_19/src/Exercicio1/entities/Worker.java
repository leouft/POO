package Exercicio1.entities;

import Exercicio1.enums.WorkerLevel;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Worker {
    private String name;
    private WorkerLevel level;
    private double baseSalary;
    private List<HourContract> contracts = new ArrayList<>();
    private Department department;

    public Worker(String name, WorkerLevel level, double baseSalary, Department department) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    public void addContract(HourContract contract) {
        contracts.add(contract);
    }

    public void removeContract(HourContract contract) {
        contracts.remove(contract);
    }

    public double income(int year, int month) {
        double total = baseSalary;
        Date temp = new Date(year - 1900, month - 1, 1);
        for (HourContract contract : contracts) {
            if (contract.date.getMonth() == temp.getMonth() && contract.date.getYear() == temp.getYear())
                total += contract.totalValue();
        }
        return total;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department.getName();
    }
}
