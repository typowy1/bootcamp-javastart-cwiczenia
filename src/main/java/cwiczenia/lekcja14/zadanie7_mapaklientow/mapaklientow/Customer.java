package cwiczenia.lekcja14.zadanie7_mapaklientow.mapaklientow;

public class Customer {

    private Long id;
    private String firstName;
    private String lastName;
    private String telNumber;

    public Customer(Long id, String firstName, String lastName, String telNumber) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.telNumber = telNumber;
    }

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getTelNumber() {
        return telNumber;
    }

    @Override
    public String toString() {
        return id + " " + firstName + " " + lastName + " " + " tel: " + telNumber;
    }
}
