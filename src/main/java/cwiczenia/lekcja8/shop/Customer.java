package cwiczenia.lekcja8.shop;

public class Customer extends Person {


    private double totalPayments; // ile wydał
    // nie można dziedziczyć po klasie address poniewaz nie mozemy powiedziec klient jest adresem, a klient ma adres
//    mają być konstruktory domyślne więc zadnego konstruktora nie generujemy
    // dziedziczymy po klasie Person


    public Customer(String firstName, String lastName, Address address, double totalPayments) {
        super(firstName, lastName, address);
        this.totalPayments = totalPayments;
    }

    public double getTotalPayments() {
        return totalPayments;
    }

    public void setTotalPayments(double totalPayments) {
        this.totalPayments = totalPayments;
    }

    @Override
    void printInfo() {
        super.printInfo();
        System.out.print(", całkowite wydatki" + totalPayments + "zł");
    }
}
