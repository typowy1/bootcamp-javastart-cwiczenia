package prework2.prework.klasyabstrakcyjne_i_interfejsy.LiveCoding.klasyabstrakcyjne.Company;

public class ContractEmployee extends Employee {

    private double wage;
    private double hours;

    public ContractEmployee(String firstName, String lastName, String socialSecurityNumber, double wage, double hours) {
        super(firstName, lastName, socialSecurityNumber);
        this.wage = wage;
        this.hours = hours;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    @Override
    public double getPaymentAmount() {
        return wage * hours;
    }
}
