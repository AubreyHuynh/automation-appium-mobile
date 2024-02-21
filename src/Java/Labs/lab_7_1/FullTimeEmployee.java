package Java.Labs.lab_7_1;

// FullTimeEmployee class, subclass of Employee
public class FullTimeEmployee extends Employee {
    // Override the salary method for full-time employees
    @Override
    public double salary() {
        return 50000; // Full-time employee's salary is 50000
    }
}
