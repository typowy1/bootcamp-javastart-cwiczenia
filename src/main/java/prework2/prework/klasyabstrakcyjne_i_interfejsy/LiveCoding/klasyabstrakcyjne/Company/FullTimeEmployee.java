package prework2.prework.klasyabstrakcyjne_i_interfejsy.LiveCoding.klasyabstrakcyjne.Company;

public class FullTimeEmployee extends Employee {

    private double salary;

    public FullTimeEmployee(String firstName, String lastName, String socialSecurityNumber, double salary) {
        super(firstName, lastName, socialSecurityNumber);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public double getPaymentAmount() {
        return salary;
    }
}
