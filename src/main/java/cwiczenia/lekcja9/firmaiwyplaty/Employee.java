package cwiczenia.lekcja9.firmaiwyplaty;

public class Employee extends Person {

    private double salary;

    public Employee(String firstName, String lastName, double salary) {
        super(firstName, lastName);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    double totalPaymant() {
        return salary;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", wypłata: " + salary;
    }
}
