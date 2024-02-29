package Java.Labs.Lab_10_2;

public class FullTimeEmployee extends Employee {
    private int salary;

    public FullTimeEmployee(int salary) {
        this.salary = salary;
    }

    @Override
    int salary() {
        return salary;
    }
}
