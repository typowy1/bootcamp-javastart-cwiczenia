package prework2.prework.strumienie;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilmzSpotkania {

    public static void main(String[] args) {

        //lambda, funkcje w matematyce

        //f(x) = x * 2
        //f(2) = x * 2 = 4
        //to samo co
        //(x) -> x * 2

        // strumienie - wygodne przetważanie colekcji np tablic

        //*** ForEach - iteruje po kolekcjach
        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6, 7);
        integers
                //.forEach(number -> System.out.println(number)) // dla każdego elementu w strimie wyświetli wszystkie elementy z kolekcji
                .forEach(System.out::println); // to samo za pomocą referncji na metodę, dla każdego elementu w strimie wyświetli wszystkie elementy z kolekcji

        // ***//filter - filtruje elementy ktore są w stremie, filter(boolean), przepuszcza pewne elementy a inne odrzuca

        //IntStream stream = IntStream.of(1, 2, 3, 4);
        // straem.filter(x  -> x % 2 == 0) - x parametr w naszym wyrazeniu lambda czyli będzie tu przypisana wartosć z IntStream.of(1, 2, 3, 4);, chcemy tylko takie elementy które przy dzieleniu przez dwa dają 0
// toArray do tablicy
        // operacje na strumieniach mogą byc wykonywane 1 raz

        System.out.println();
        Set<Integer> integers1 = Set.of(1, 2, 3, 4, 5, 6);
        integers1.stream()
                .filter(number -> number % 2 == 0) //przepuszczamy wszystkie liczby które są parzyste
                .forEach(number -> System.out.println(number)); //wyświetli wszystkie lementy parzyste

        Stream.of("Ala", "Agata", "Jarek", "Kamil")
                .filter(name -> name.endsWith("a"))// przepuści imiona kończące się na a, Ala, Agata
                .forEach(name -> System.out.println(name));


        //*** Map - mapowanie, przypisaywanie jakiejś wartości do drugiej, conweruje jedna wartosc na druga

        int[] integer3 = new int[]{1, 2, 3, 4, 5, 6, 7};
        Arrays.stream(integer3) // wrzucamy array do streama
                .map(number -> number * 2)// wykonujemy działanie na kolekcji
                .forEach(number -> System.out.println(number));


        Set<String> names1 = Set.of("Ania", "Jarek", "Kamil");

//        przekonwerujemy każde imie na inny typ, w typ przypadku Person, klasa Perrson na samym dole
        names1.stream()// stream stringów zaminiliśmy na Person i stworzyliśmy z nich obiekty typu person
                .map(name -> new Person(name))
                .filter(person -> person.getName().contains("i"))//przepuszczamy tylko takie osoby z klasy Person które mają i wewnątrz imienia
                .forEach(person -> System.out.println(person));


        //***collect - zbiera nam streamy do kolekcji
        Set<String> names2 = Set.of("Ania", "Jarek", "Kamil");
        List<Person> collect = names2.stream()
                .map(name -> new Person(name))
                .collect(Collectors.toList());// metoda kończąca, zbieramy do jakiejs kolekcji, do listy


        //***reduce

        System.out.println();
        List<Integer> numbers5 = List.of(1, 2, 3, 4, 5, 6, 7);
        //(numberOne, numberTwo) -> numberOne + numberTwo
        //(1, 2) -> 1 + 2 => 3
        //(3, 3) -> 3 + 3 => 6
        //(6, 4) -> 6 + 4 => 10
        //itd.

        Optional<Integer> reduce = numbers5.stream()
                .reduce((numberOne, numberTwo) -> numberOne + numberTwo);//zredukujemy kazdy element jeden po jedny, wyciągnąc np sume, wszystkie kolejne elementy w streamie
        Integer integer = reduce.orElse(10); //likwidujemy optionale, jeśli optional będzie pusty to zwróci 10

        //***reduce with Identity - przyjmuje lement początkowy

        System.out.println();
        List<Integer> numbers6 = List.of(1, 2, 3, 4, 5, 6, 7);
        //(numberOne, numberTwo) -> numberOne + numberTwo

        //identity        -> 20
        //(20, 1) -> 20 + 1 => 21
        //(21, 2) -> 21 + 2 => 23
        //(23, 3) -> 23 + 3 => 26
        //itd.

//        numbers6.stream()
//                .reduce(0, (numberOne, numberTwo) -> numberOne + numberTwo);//przyjeliśmy wartosć początkową, będzie nia pierwszy element w streamie czyli 1, zredukujemy kazdy element jeden po jedny, wyciągnąc np sume, wszystkie kolejne elementy w streamie

        numbers6.stream()// w tym przypadku typ zmiennej to będzie Integer
                .reduce(20, (numberOne, numberTwo) -> numberOne + numberTwo);//przyjeliśmy wartosć początkową, będzie nia pierwszy element w streamie czyli 1, zredukujemy kazdy element jeden po jedny, wyciągnąc np sume, wszystkie kolejne elementy w streamie


        //*** flatMap - uniknięcie sytuacji kiedy mamy stream w streamie, z wewnetrznych stremów obiektów bierze wszystkie elementy i wrzuca je do jednego streama

//        wyciągamy liste adrsow w ktorych mieszkają ludzie
        List<Human> users = List.of(new Human("Ania", List.of(new Address("Wrocław", "Poland"), new Address("Praga", "Czechy"))),
                new Human("Ania", List.of(new Address("Berlin", "Niemcy"))),
                new Human("Iza", List.of(new Address("Warszawa", "Polska"))));

        users.stream()
                .flatMap(user -> user.getAddresses().stream())//wchodzimy do klasy Address, splaszczamy wszystko do jednego strema, wyciągnie wszystko z wewnętrznych streamów i włoży do głównego, czyli mamy dostęp do obiektów z obiektu
                .map(address -> address.getCity())// dzięki temu możemy teraz mapować po adressach.
                .collect(Collectors.toList());


    }

    //klasy wewnętrzna zagnieżdzona bo ma static, dostępna tylko w tej klasie, często się stosuje
    static class Person {
        private String name;

        public Person(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }

    static class Human {
        private String firstName;
        private List<Address> addresses;

        public Human(String firstName, List<Address> addresses) {
            this.firstName = firstName;
            this.addresses = addresses;
        }

        public String getFirstName() {
            return firstName;
        }

        public List<Address> getAddresses() {
            return addresses;
        }

        @Override
        public String toString() {
            return "Human{" +
                    "firstName='" + firstName + '\'' +
                    ", addresses=" + addresses +
                    '}';
        }
    }

    static class Address {
        private String city;
        private String country;

        public Address(String city, String country) {
            this.city = city;
            this.country = country;
        }

        public String getCity() {
            return city;
        }

        public String getCountry() {
            return country;
        }

        @Override
        public String toString() {
            return "Address{" +
                    "city='" + city + '\'' +
                    ", country='" + country + '\'' +
                    '}';
        }
    }

}
