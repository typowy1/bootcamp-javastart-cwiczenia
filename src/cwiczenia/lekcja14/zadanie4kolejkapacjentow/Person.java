package cwiczenia.lekcja14.zadanie4kolejkapacjentow;

public class Person {
    private String name;
    private String surname;
    private int pesel;

    public Person(String name, String surname, int pesel) {
        this.name = name;
        this.surname = surname;
        this.pesel = pesel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getPesel() {
        return pesel;
    }

    public void setPesel(int pesel) {
        this.pesel = pesel;
    }

    @Override
    public String toString() {
        return name + " " + surname + " pesel: " + pesel;
    }
}
