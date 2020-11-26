package cwiczenia.lekcja14.zadanie2.zbior5osob;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
// bez powturzeń, trzeba dodać metode equals i hashcode do Person
        Set<Person> people = new HashSet<>();

        people.add(new Person("Tomasz", "Karolak", 1223455));
        people.add(new Person("Krzysiek", "Kowalski", 2362455));
        people.add(new Person("Piotr", "Wojnicki", 988655));
        people.add(new Person("Ola", "Kucharska", 455789));
        people.add(new Person("Ewa", "Kowalska", 465476586));
        people.add(new Person("Ewa", "Kowalska", 465476586));

//        1. sposó, przewaga można tez coś usunąc z zbioru
        //wyświetlić osoby możemy za pomocą iteratora lub for each
        Iterator<Person> iterator = people.iterator();
//        i użyjemy pętli while dla iteratora

        while (iterator.hasNext()) {// dopóki są kolejne elementy w ramach tego iteratora
            Person person = iterator.next();//to pobiera następny element
            System.out.println(person);

        }
        System.out.println("*******");

//        2.sposób // ten sugeruje intellij,
        for (Person person : people) {// dopóki są kolejne elementy w ramach tego iteratora
            System.out.println(person);
        }

        // nie powinno się usówać w iteracji wystepuje wyjatek ConcurrentModificationException
    }
}
