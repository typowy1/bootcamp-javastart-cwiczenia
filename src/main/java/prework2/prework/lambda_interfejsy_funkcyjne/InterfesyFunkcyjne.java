package prework2.prework.lambda_interfejsy_funkcyjne;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class InterfesyFunkcyjne {

    public static void main(String[] args) {
        // małelitery i bez spacji przed i po

        String original = "   WIELKI NAPIS   ";
        original = original.toLowerCase().trim();

        // poniżej metoda

//        String getLowerCaseTrim(String original) {
//            return original.toLowerCase().trim();
//        }

//        Powyższa metoda przyjmuje obiekt typu String i zwraca w wyniku również String. Odpowiada ona więc takiemu wyrażeniu
//        lambda jak String s -> String. Wśród interfejsów funkcyjnych znajdziemy interfejs Function, którego metoda apply()
//    pasuje do tej sytuacji. Ma ona następującą sygnaturę:
//        R apply(T t);

//        Jak widać, jest to interfejs parametryzowany typami generycznymi. Pod T oraz R możemy podstawić dowolne typy
//        obiektowe. Jeżeli pod jeden i drugi parametr podstawimy typ String, to metoda przyjmuje obiekt String i zwraca
//        String - dokładnie tak samo jak w naszym przykładzie. Interfejs ten możemy wykorzystać w naszym kodzie, a metodę
//        getLowerCaseTrim() możemy zastąpić wyrażeniem lambda. Na początek przypiszmy wyrażenie lambda do zmiennej:

        Function<String, String> finc = (String s) -> s.toLowerCase().trim();

//        krócej z pominięciem typu
//        Wyrażenie lambda, zapisane po prawej stronie równania, przyjmuje parametr typu String, zamienia tekst na małe
//        litery, usuwa białe znaki z końca i początku i zwraca tak zmodyfikowany napis w wyniku. Ze względu na to, że
//        nasza zmienna ma określony typ generyczny, czyli zapisaliśmy Function<String, String>, to wirtualna maszyna
//        Javy może wywnioskować typy i wyrażenie lambda można zapisać z pominięciem typu:

        Function<String, String> func1 = text -> text.toLowerCase().trim();

//        W celu wywołania utworzonej funkcji z jakimś argumentem należy wywołać metodę, która zdefiniowana jest w naszym
//        interfejsie funkcyjnym. U nas chodzi o metodę apply().

        // funkcja przyjmuje String i zwraca String
        Function<String, String> func = text -> text.toLowerCase().trim();
        String originall = "   WIELKI NAPIS   ";
        // wywołujemy funkcję przekazując jej original jako argument
        String lowerCaseTrim = func.apply(original);
        System.out.println(lowerCaseTrim);
        //Zapis func.apply(original) oznacza "wywołaj wyrażenie lambda/funkcję przypisaną do zmiennej func z argumentem original".


//        Interfejs Consumer
//
//Załóżmy, że teraz chcemy wyświetlić jakiś tekst trzy razy. Możemy dodać po prostu trzy instrukcje System.out.println()
// co wyglądałoby tak:

        System.out.println("abc");
        System.out.println("abc");
        System.out.println("abc");

        //Jeżeli w ramach tej samej metody będziemy chcieli wyświetlić także inny tekst trzy razy, to zaczyna nam się duplikować dużo kodu:

        System.out.println("abc");
        System.out.println("abc");
        System.out.println("abc");
        System.out.println("xxx");
        System.out.println("xxx");
        System.out.println("xxx");

        //Pierwsze co robimy w takiej sytuacji, to wydzielamy metodę z powtarzalnym kodem. W naszym przypadku metoda ta
        // będzie przyjmowała String i wyświetli go 3 razy.

//        private static void print3Times(String abc) {
//            System.out.println(abc);
//            System.out.println(abc);
//            System.out.println(abc);
//        }

//   Metoda print3Times() odpowiada takiemu wyrażenia lambda jak String s -> void, czyli przyjmuje parametr typu String i
//   nie zwraca nic w wyniku. Wśród interfejsów funkcyjnych znajduje się interfejs Consumer z metodą accept() o takiej sygnaturze:
//
//void accept(T t);

//        Również jest to interfejs generyczny, więc jeśli pod T podstawimy String, to otrzymujemy taką samą sygnaturę jak
//        nasza metoda print3Times(). Oznacza to, że zamiast metody, możemy zdefiniować wyrażenie lambda, które przypiszemy
//        do zmiennej Consumer.

        Consumer<String> print3Times = s -> {
            System.out.println(s);
            System.out.println(s);
            System.out.println(s);
        };

        print3Times.accept("sbc");
        print3Times.accept("xxx");

//        Ponieważ w ramach ciała wyrażenia lambda wykonujemy kilka operacji, konkretnie wywołujemy trzykrotnie metodę
//        System.out.println(), to konieczne było dodanie dodatkowych nawiasów klamrowych. Zauważ, że w ramach nawiasów
//        klamrowych nie ma żadnego returna, wynika to z sygnatury metody accept(), która jest typu void.
//
//W celu wywołania wyrażenia lambda, na zmiennej print3Times wywołujemy metodę accept(), przekazując jej argument,
// który chcemy wyświetlić.


//        nterfejs Predicate
//
//Załóżmy, że mamy w programie zmienną z wiekiem pewnej osoby. Chcemy sprawdzić, czy osoba ta jest pełnoletnia. Jeśli tak,
// to wykonamy pewną operację. Standardowo zapiszemy to w taki sposób:

//        int personAge = 19;
//        if (personAge >= 18) {
//            //jakieś operacje

//        Kod ten da się usprawnić. Nie do końca wiadomo, dlaczego porównujemy się akurat z wartością 18 - jest to magiczna
//        liczba. Moglibyśmy wprowadzić jakąś stałą, ale jeszcze lepiej będzie wydzielić metodę, której nadamy nazwę, czyli znaczenie.

//         int personAge = 19;
//        if (checkIfAdult(personAge)) {
//            //jakieś operacje

//        static boolean checkIfAdult(int age) {
//            return age >= 18;
//        }
//        Dzięki takiemu zapisowi raczej już jest jasne co oznacza liczba 18.

//        Metoda checkIfAdult() przyjmuje parametr typu int i zwraca wartość typu boolean, odpowiada więc takiemu wyrażeniu
//        lambda jak int x -> boolean. Odpowiada to interfejsowi Predicate, w którym zdefiniowana jest metoda test():
//
//boolean test(T t);

//        Jeżeli pod T podstawimy typ Integer, to otrzymujemy niemal to samo co w naszym przypadku. Dzięki temu, że mamy
//        mechanizm autoboxingu i autounboxingu, możemy założyć, że nie będzie tutaj żadnego problemu. Zamiast osobnej
//        metody, możemy więc zdefiniować zmienną typu Predicate i przypisać do niej wyrażenie lambda, które będzie pasowało
//        do sygnatury metody test().

        int personAge = 19;
        Predicate<Integer> checkIfAdult = age -> age >= 18;
        if (checkIfAdult.test(personAge)) {
            //jakieś operacje
        }

//Rozwiązanie takie ma sens szczególnie wtedy, kiedy danego predykatu używamy tylko w jednej metodzie. Definiowanie
// osobnych metod może nam niepotrzebnie "zaśmiecać" klasę i musimy się wtedy zastanawiać, czy metoda taka była wykorzystywana
// tylko w tym jednym miejscu, czy jeszcze gdzieś. Definiując zmienną lokalną, tak jak powyżej, nie ma tego problemu.


        //Interfejs Supplier

//        W ostatnim przykładzie pokażę Ci jak możemy tworzyć obiekty z danymi wylosowanymi z kilku tablic.
//        Na początku potrzebna będzie nam klasa Person, która reprezentuje osobę, a każda osoba opisana jest przez imię, nazwisko i wiek.

//        Teraz w metodzie main zdefiniuję tablice z imionami, nazwiskami i liczbami reprezentującymi wiek osób.
//        Na początku stworzymy listę 5 obiektów Person z losowym imieniem, nazwiskiem i wiekiem korzystając z klasycznej pętli.

        String[] firstNames = {"Jan", "Karol", "Piotr", "Andrzej"};
        String[] lastNames = {"Abacki", "Kowalski", "Zalewski", "Korzeniewski"};
        int[] ages = {22, 33, 44, 55};
        Random random = new Random();

        List<Person> people = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            String firstName = firstNames[random.nextInt(firstNames.length)]; // Zapis typu firstNames[random.nextInt(firstNames.length)] oznacza "pobierz z tablicy firstNames obiekt zapisany pod losowym indeksem z zakresu od 0 do długości tej tablicy. direct. losowanie imienia z tablicy. losowy wybóe, zasięg losowania równy wielkosci tablicy
            String lastName = lastNames[random.nextInt(lastNames.length)]; // losowanie nazwiska z tablicy
            int age = ages[random.nextInt(ages.length)]; // losowanie wieku z tablicy
            Person randomPerson = new Person(firstName, lastName, age);
            people.add(randomPerson);
        }
        for (Person person : people) {
            System.out.println(person);
        }

//            Obiekty standardowo tworzymy wywołując konstruktor, zapisując:
//
//Person person = new Person("Jan", "Kowalski", 42);
//1
//file_copy
//
//Można powiedzieć, że wywołanie konstruktora to trochę jakby powiedzieć, że tworzymy coś z niczego. Gdyby odzwierciedlić to przy pomocy wyrażenia lambda, to miałoby ono np. taką sygnaturę () -> Person.
//
//Wśród interfejsów funkcyjnych istnieje coś takiego jak Supplier, gdzie zdefiniowana jest metoda get() o takiej sygnaturze:

//        T get();

//        Metoda get() nie przyjmuje żadnych parametrów i zwraca obiekt typu T. Jeżeli pod T podstawimy Person, to otrzymujemy to,
//        czego szukamy. Zapiszmy fragment kodu i wyrażenie lambda, które pozwoli nam utworzyć obiekty Person z losowymi danymi


        Supplier<Person> supplier = () -> {
            String firstName = firstNames[random.nextInt(firstNames.length)];//od 0 do ługosci tablisy
            String lastName = lastNames[random.nextInt(lastNames.length)];
            int age = ages[random.nextInt(ages.length)];
            return new Person(firstName, lastName, age);
        };

        System.out.println(supplier.get());
        System.out.println(supplier.get());
        System.out.println(supplier.get());

//        Na początku zdefiniowane są trzy tablice przechowujące odpowiednio imiona, nazwiska oraz wiek osób. Obiekt typu
//        Random pozwoli nam wylosować liczbę, odpowiadającą indeksowi obiektu lub wartości, który będziemy pobierali z tablicy.
//        Do zmiennej supplier przypisujemy wyrażenie lambda, które jest zgodne z sygnaturą abstrakcyjnej metody get()
//        zdefiniowanej w tym interfejsie. Takie wyrażenie lambda nie przyjmuje żadnego argumentu, a zwraca obiekt, w
//        naszym przypadku typu Person.

//        Zapis typu firstNames[random.nextInt(firstNames.length)] oznacza "pobierz z tablicy firstNames obiekt zapisany
//        pod losowym indeksem z zakresu od 0 do długości tej tablicy. Analogicznie postępujemy z losowaniem nazwiska i
//        wieku, a na końcu zwracamy gotowy obiekt Person.
//
//Wywołując metodę get(), za każdym razem zostanie utworzony obiekt Person z losowym imieniem, nazwiskiem i wiekiem.
// Im więcej danych będzie w tablicach źródłowych, tym lepiej. Zamiast wywoływać metodę get() bezpośrednio w metodzie println(),
// moglibyśmy oczywiście też najpierw obiekty zapamiętać w zmiennych:

        Person person1 = supplier.get();
        System.out.println(person1);


//         List<Person> people = new ArrayList<>();
//        for (int i = 0; i < 5; i++) {
//            people.add(supplier.get());
//        }
//        for (Person person : people) {
//            System.out.println(person);
//        }

        //teraz wystarczy dodać do tego wszystkiego pętlę i gotowe.

//W tej lekcji pokazałem ci podstawową mechanikę korzystania z wyrażeń lambda. Zapamiętaj, że w Javie istnieje coś takiego
// jak interfejsy funkcyjne, czyli takie interfejsy, które mają tylko jedną metodę abstrakcyjną (mogą mieć także inne metody,
// np. domyślne, statyczne, albo prywatne). Do zmiennej tego typu można przypisać wyrażenie lambda, które będzie zgodne z metodą
// zdefiniowaną w takim interfejsie. Prawdziwe korzyści korzystania z wyrażeń lambda zobaczysz jednak, gdy połączymy je z
// operacjami na kolekcjach oraz strumieniach.


    }

}
