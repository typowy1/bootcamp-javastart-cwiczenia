package prework.typygeneryczne;

public class GenericTester {

    public static void main(String[] args) {

        Container<Integer> integres = new Container<>();  // definiujemy kontener przechowujący liczby całkowite, od javy 7 nie trzeba new Container<Integer>(), można zastosować sam operator diamentu czyli new Container<>();
        integres.setArray(new Integer[5]); // przypisujemy nową tablicę typu Integer
        integres.getArray()[0] = 5; // do pierwszego elementu przypisujemy liczbę 5
        integres.getArray()[1] = 6; // do pierwszego elementu przypisujemy liczbę 5
        Integer[] array = integres.getArray(); // dopiero po takim zapissie będzie możliwość drukowania wartości
        System.out.println(array[0] + array[1]);

        Container<String> strings = new Container<>();// tworzymy kontener przechowujący obiekty String, od javy 7 nie trzeba new Container<Integer>(), można zastosować sam operator diamentu czyli new Container<>();
        strings.setArray(new String[]{"a", "b"}); // przypisujemy tablicę typu String
        // przypisujemy 1 i 2 element tablicy
//        strings.getArray()[0] = "a";
//        strings.getArray()[1] = "b";
        String[] string1 = strings.getArray(); // dopiero po takim zapissie będzie możliwość drukowania wartości
        System.out.println(string1[0] + string1[1]);

        // odczytanie danych bez konieczności rzutowania!
        Integer num = integres.getElement(0);
        String str = strings.getElement(0);

        // wyświetlenie wartości
        System.out.println(num);
        System.out.println(str);

        String[] strArray = strings.getArray();
        for (String s : strArray) {
            System.out.println(s.toUpperCase()); // zmieniamy wszystkie znaki na wielkie litery
        }

        //Do typów generycznych można używać tylko typów obiektowych.

//        Na początku zdefiniowaliśmy obiekt Container, parametryzując go typem Integer. Do typów generycznych można używać
//        tylko typów obiektowych. Jest to jedno z miejsc, gdzie wymagane jest korzystanie z klas opakowujących dla typów prostych.
//
//                Zauważ, że ponieważ w nawiasach ostrych podaliśmy typ Integer, to od tego momentu w klasie Container posiadamy
//        pustą referencję typu Integer[], do której za pomocą metody setArray() przypisujemy nową 5 elementową tablicę liczb
//    całkowitych, a dalej do jej 1 elementu liczbę 5 (możliwe dzięki autoboxingowi). W skrócie wszędzie tam, gdzie w klasie
//        Container pojawiał się parametr T, od teraz wyobrażamy sobie w tych miejscach Integer.

//                W dalszej części kodu robimy analogiczne czynności, tym razem parametryzując typ Container za pomocą typu <String>.
//
//                Metoda get() pokazuje całe piękno typu generycznego - nie jest wymagane żadne rzutowanie z typu Object na Integer,
//                czy String, bo my dokładnie wiemy, że obiekt integers przechowuje wartości Integer, a strings napisy typu String.


    }
}
