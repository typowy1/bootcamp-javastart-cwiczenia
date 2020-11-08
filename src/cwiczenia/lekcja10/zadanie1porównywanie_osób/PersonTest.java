package cwiczenia.lekcja10.zadanie1porównywanie_osób;

public class PersonTest {
    public static void main(String[] args) {
        Address address = new Address("Wrocław", "50-555", "62", "13");
        Address address2 = new Address("Wrocław", "50-555", "62", "13");

        Person[] people = new Person[3];
        people[0] = new Person("Tomek", "Kowalski", "55677", 44, address);
        people[1] = new Person("Tomek", "Kowalski", "55677", 44, address2);
        people[2] = new Person("Lukasz", "Michałowski", "7788990", 50, address);

        for (int i = 0; i < people.length; i++) {
            System.out.println("Person " + (i + 1) + ": " + people[i].toString());
        }

//        person1 jest równe person2
//        person1 jest różne od person3
//        person2 jest różne od person3
        printExtractInfo(people, 0, 1, "person1", "person 2");
        printExtractInfo(people, 0, 2, "person1", "person 3");

        printExtractInfo(people, 1, 2, "person2", "person 3");
    }

    private static void printExtractInfo(Person[] people, int i2, int i3, String s, String s2) {
        if (people[i2].equals(people[i3])) {
            System.out.printf("%s jest równe %s\n", s, s2);
        } else {
            System.out.printf("%s jest różne %s\n", s, s2);
        }
    }
}
