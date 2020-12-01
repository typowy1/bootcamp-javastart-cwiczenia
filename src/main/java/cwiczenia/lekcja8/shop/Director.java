package cwiczenia.lekcja8.shop;

public class Director extends Employee {
    private double bonus;

    public Director(String firstName, String lastName, Address address, double salary) {
        super(firstName, lastName, address, salary);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    double totalPayment() {
        return getSalary() + bonus;
    }

    @Override
    void printInfo() {
        super.printInfo();
        System.out.print(", premia: " + bonus + ", całkowita wypłata " + totalPayment());
    }

}
