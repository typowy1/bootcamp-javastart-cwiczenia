package cwiczenia.lekcja10.zadanie3;

public class RentableCar extends Car implements RenTable {

    private Person person;

    public RentableCar(String name, int year, int seats) {
        super(name, year, seats);
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public void rent(String firstName, String LastName, String id) {

        person = new Person(firstName, LastName, id);
    }

    @Override
    public void handOver() {
        person = null;
    }

    @Override
    public boolean isRent() {
        return person != null;
    }

    @Override
    public String toString() {
        return "Samochód wypożyczony do " + person;
    }
}
