package Java.Labs.lab_7_1;

// ContractEmployee class, subclass of Employee
public class ContractEmployee extends Employee {
    // Override the salary method for contract employees
    @Override
    public double salary() {
        return 40000; // Contract employee's salary is 40000
    }
}