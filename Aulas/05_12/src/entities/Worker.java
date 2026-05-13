package entities;

import enums.WorkerLevel;

import java.util.ArrayList;
import java.util.List;

public class Worker {
    private String name;
    private WorkerLevel level;
    private double baseSalary;
    private List<HourContract> contracts = new ArrayList<>();
    private Department department;

    public Worker(Department department) {
        this.department = department;

    }

    public void addContract(HourContract contract) {
        contracts.add(contract);
    }
}
