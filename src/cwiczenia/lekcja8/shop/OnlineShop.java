package cwiczenia.lekcja8.shop;

public class OnlineShop {
    public static void main(String[] args) {

        Address address1 = new Address("Wrocław", "Helenowska", "33", "10");
        // ten sam adres dla klienta i pracownika

        Customer customer1 = new Customer("Adam", "Kowalski", address1, 5000);
        customer1.printInfo();
        System.out.println();

        Employee employee1 = new Employee("Krzysiek", "Bogucki", address1, 7000);
        employee1.printInfo();
        System.out.println();

        Director director = new Director("Anna", "Zawadzka", address1, 10000);
        director.setBonus(2000);
        director.printInfo();
    }
}
