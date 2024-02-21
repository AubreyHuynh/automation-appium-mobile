package Java.Labs.lab_7_1;

import java.util.ArrayList;
import java.util.List;

public class Organization {
    // Method to calculate total salary of a list of employees
    public static double calculateTotalSalary(List<Employee> employees) {
        double totalSalary = 0;
        for (Employee employee : employees) {
            totalSalary += employee.salary();
        }
        return totalSalary;
    }

    public static void main(String[] args) {
        // Create a list of employees
        List<Employee> employees = new ArrayList<>();

        // Add some full-time employees
        for (int i = 0; i < 3; i++) {
            employees.add(new FullTimeEmployee());
        }

        // Add some contract employees
        for (int i = 0; i < 2; i++) {
            employees.add(new ContractEmployee());
        }

        // Calculate total salary
        double totalSalary = calculateTotalSalary(employees);
        System.out.println("Total salary: " + totalSalary);
    }
}
