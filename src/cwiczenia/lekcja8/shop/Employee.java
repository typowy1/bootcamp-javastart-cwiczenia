package cwiczenia.lekcja8.shop;

public class Employee extends Person {

    private double salary; // wypłata

    public Employee(String firstName, String lastName, Address address, double salary) {
        super(firstName, lastName, address);// wywołanie konstruktora z klasy Person
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    void printInfo() {
        super.printInfo();
        System.out.print(", wypłata: " + salary + "zł");
    }
}
