package Java.Labs.Lab_10_2;

public class ContractEmployee extends  Employee{
    private int salary;

    public ContractEmployee(int salary) {
        this.salary = salary;
    }

    @Override
    int salary() {
        return salary;
    }
}
