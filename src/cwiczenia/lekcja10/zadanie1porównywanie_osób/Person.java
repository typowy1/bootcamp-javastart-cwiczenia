package cwiczenia.lekcja10.zadanie1porównywanie_osób;

import java.util.Objects;

public class Person {

    private String firstName;
    private String lastName;
    private String pesel;
    private int age;
    private Address adress;

    public Person(String firstName, String lastName, String pesel, int age, Address adress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pesel = pesel;
        this.age = age;
        this.adress = adress;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAdress() {
        return adress;
    }

    public void setAdress(Address adress) {
        this.adress = adress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(firstName, person.firstName) &&
                Objects.equals(lastName, person.lastName) &&
                Objects.equals(pesel, person.pesel) &&
                Objects.equals(adress, person.adress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, pesel, age, adress);
    }

    @Override
    public String toString() {
        return "Imię: " + firstName + ", nazwisko: " + lastName + ", pesel: " + pesel + ", wiek: " + age;
    }
}
