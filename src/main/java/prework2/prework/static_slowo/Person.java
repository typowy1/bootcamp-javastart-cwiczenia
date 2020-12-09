package prework2.prework.static_slowo;

public class Person {

    private String firstName;
    private String lastName;
    private int age;
    private static int peopleNumber; // jeśli chcemy ograniczyć dostep do pola to generujemy tylko geter
    public static final int ADULT_AGE = 18;// stała

    // metody statyczne nie operuja na stanie obiektu i powinny byc wywolywane na klasie czyli, Perso.metodaStatyczna();

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        peopleNumber++; // to spowoduje że do pola po każdym utowrzeniu obiektu zostanie przypisana ilość obiektów
    }

    public static int getPeopleNumber() {// geter też jest statyczny
        return peopleNumber;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
