package prework.kolekcje.zbiory_i_iteratory;

import java.util.Objects;

public class Person implements Comparable<Person> {// wskazujemy że będziemy porównywali obiekty person z innymi obiektami person
    // dla tree setu imlementujemy cmparator po to że móć określić jak chcemy sortować, robimy to za pmocą metody compareTo
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Person person = (Person) o;
        return Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }

    @Override
    public int compareTo(Person p) {
        return lastName.compareTo(p.lastName);//sortujemy obiekty na podstawie nazwiska alfabetycznie,
        // jeżeli chcemy odwrócić kolejność to tak zapisujemy: -lastName.compareTo(p.lastName)
    }
}
