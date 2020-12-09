package prework2.prework.lambda_interfejsy_funkcyjne;

import java.awt.*;
import java.security.PrivilegedAction;
import java.util.Random;
import java.util.concurrent.Flow;
import java.util.function.*;

public class Lambdy {

    //https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/package-summary.html
    //https://javastart.pl/kurs/java/java-podstawy-temat-38-wyra%C5%BCenia-lambda/lekcja/java-podstawy-wyrazenia-lambda-i-interfejsy-funkcyjne

    public static void main(String[] args) {
//        (x) -> x*x;
//        (2) -> 2*2;
        //IntFunction<Integer> integerIntFunction = (int x) -> x * x;
//        x -> {if(x>0) return x*x; else return 0;}

//        interfejs funkcyjny Function  R apply(T t); czyli String s -> String przyjmuje parametr string i zwraca string

        Function<String, String> func = (s) -> s.toLowerCase().trim();// przydaje sie tez zamiast anonimowej klasy//zwroci napis z malymi literami i bez spacji z tłu i przodu
        String original = "Wielki Napis";
        String lowerCaseTrim = func.apply(original); //wyołanie wyrazenia lambda
        System.out.println(lowerCaseTrim);


        //interfejs consumer, void accept(T t); przyjmuje parametr i nie zwraca nic String s -> void
        //consumer.accept(t) oznacza więc tak naprawdę "wykonaj wyrażenie lambda przypisane do zmiennej consumer z argumentem t

        //drukowanie kilka razy tekstu
        Consumer<String> print3Times = s -> {
            System.out.println(s);
            System.out.println(s);
            System.out.println(s);
        };

        print3Times.accept("abc");
        print3Times.accept("fgh");


//        Interfejs Predicate, boolean test(T t); czyli przyjmuje parametr typu int i zwraca wartość typu boolean
//        int x -> boolean
        int personAge = 19;
        Predicate<Integer> checkifAdult = age -> age >= 18;
        if (checkifAdult.test(personAge)) {
            //jakies operacje
        }

        //int x -> boolean


//        Interfejs  Supplier, T get(); czyli () -> Person
//        Można powiedzieć, że wywołanie konstruktora to trochę jakby powiedzieć, że tworzymy coś z niczego. Gdyby odzwierciedlić to przy pomocy wyrażenia lambda, to miałoby ono np. taką sygnaturę () -> Person.
        //Metoda get() nie przyjmuje żadnych parametrów i zwraca obiekt typu T

        String[] firstNames = {"Jan", "Karol", "Piotr", "Andrzej"};
        String[] lastNames = {"Abacki", "Kowalski", "Zalewski", "Korzeniewski"};
        int[] ages = {22, 33, 44, 55};
        Random random = new Random();
        Supplier<Person> supplier = () -> {
            String firstName = firstNames[random.nextInt(firstNames.length)];
            String lastName = lastNames[random.nextInt(lastNames.length)];
            int age = ages[random.nextInt(ages.length)];
            return new Person(firstName, lastName, age);
        };
        System.out.println(supplier.get());//pobiera obiekt person
        System.out.println(supplier.get());
        System.out.println(supplier.get());

        //Na początku zdefiniowane są trzy tablice przechowujące odpowiednio imiona, nazwiska oraz wiek osób. Obiekt typu Random pozwoli nam wylosować liczbę, odpowiadającą indeksowi obiektu lub wartości, który będziemy pobierali z tablicy. Do zmiennej supplier przypisujemy wyrażenie lambda, które jest zgodne z sygnaturą abstrakcyjnej metody get() zdefiniowanej w tym interfejsie. Takie wyrażenie lambda nie przyjmuje żadnego argumentu, a zwraca obiekt, w naszym przypadku typu Person.
        //
        //Zapis typu firstNames[random.nextInt(firstNames.length)] oznacza "pobierz z tablicy firstNames obiekt zapisany pod losowym indeksem z zakresu od 0 do długości tej tablicy. Analogicznie postępujemy z losowaniem nazwiska i wieku, a na końcu zwracamy gotowy obiekt Person.
        //
        //Wywołując metodę get(), za każdym razem zostanie utworzony obiekt Person z losowym imieniem, nazwiskiem i wiekiem. Im więcej danych będzie w tablicach źródłowych, tym lepiej. Zamiast wywoływać metodę get() bezpośrednio w metodzie println(), moglibyśmy oczywiście też najpierw obiekty zapamiętać w zmiennych:

        Person person1 = supplier.get();
        System.out.println(person1);

        //W tej lekcji pokazałem ci podstawową mechanikę korzystania z wyrażeń lambda. Zapamiętaj, że w Javie istnieje
        // coś takiego jak interfejsy funkcyjne, czyli takie interfejsy, które mają tylko jedną metodę abstrakcyjną
        // (mogą mieć także inne metody, np. domyślne, statyczne, albo prywatne). Do zmiennej tego typu można przypisać
        // wyrażenie lambda, które będzie zgodne z metodą zdefiniowaną w takim interfejsie. Prawdziwe korzyści korzystania
        // z wyrażeń lambda zobaczysz jednak, gdy połączymy je z operacjami na kolekcjach oraz strumieniach.
    }
}
