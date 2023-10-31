package main.extraTask_1;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private ArrayList<EmployeeSpecialization> specialization = new ArrayList<>();
    private double salary;

    public Employee (EmployeeSpecialization[] specialization, double salary) {
        this.specialization.addAll(List.of(specialization));
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public ArrayList<EmployeeSpecialization> getSpecialization() {
        return specialization;
    }
}
