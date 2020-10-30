package cwiczenia.lekcja9.firmaiwyplaty;

public class Director extends Employee {

    private double bonus;

    public Director(String firstName, String lastName, double salary, double bonus) {
        super(firstName, lastName, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    double totalPaymant() {
        return getSalary() + bonus;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", bonus: " + bonus;
    }
}
