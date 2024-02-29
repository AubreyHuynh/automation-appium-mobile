package Java.Labs.Lab_10_2;

import java.util.ArrayList;
import java.util.List;

public class Company {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        // Add 3 Full Time Employees with variable salaries
        employees.add(new FullTimeEmployee(65000));
        employees.add(new FullTimeEmployee(54000));
        employees.add(new FullTimeEmployee(52000));
        // Add 2 Contract Employees with variable salaries
        employees.add(new ContractEmployee(42000));
        employees.add(new ContractEmployee(45000));

        int totalSalary = calculateTotalSalary(employees);
        System.out.println("Total salary of the employees: $" + totalSalary);
    }

    public static int calculateTotalSalary(List<Employee> employees) {
        int totalSalary = 0;
        for (Employee emp : employees) {
            totalSalary += emp.salary();
        }
        return totalSalary;
    }
}
