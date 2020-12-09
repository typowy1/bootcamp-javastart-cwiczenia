package prework2.prework.kolekcja_i_metody.listy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PolymorphicLists {

    public static void main(String[] args) {
        LinkedList<Integer> ints1 = new LinkedList<>();
        ArrayList<Integer> ints2 = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            ints1.add(1);
            ints2.add(1);
        }
        printList(ints1);
        printList(ints2);
        System.out.println(ints1); // drukowanie w tej samej lini

    }

    static void printList(List<Integer> list) { // Jeśli nie wykorzystujesz metod specyficznych dla danej implementacji, np. removeLast() z klasy LinkedList
        // powyżej używanmy dwóch list i żeby obsłózyć dwa rodzaje list lepiej napisać
        // 1 metode do wyświetlania danych// i podać typ argumentu List, dlatego ze listy implementują metody z interfejsu list
        for (Integer n : list) {
            System.out.println(n); // drukowanie 1 pod druga
        } //    Metoda printList(), dzięki przyjmowaniu ogólniejszego typu kolekcji jest bardziej uniwersalna.


//    Jeśli nie wykorzystujesz
//    metod specyficznych dla danej implementacji, np. removeLast() z klasy LinkedList, to rozważ także posługiwanie się
//    referencjami ogólniejszego typu dla zwykłych zmiennych, czyli, np:

        List<Integer> ints1 = new LinkedList<>();
        List<Integer> ints2 = new ArrayList<>();

//
//        Jeśli jednak potrzebujesz metodę z konkretnego typu, np. wspomniana removeLast() to definiuj od razu kolekcję
//        konkretnego typu, aby uniknąć rzutowania. Np.:

//        Będzie błąd bo użyłem metody dedykowanej do LinkedList
        List<Integer> link = new LinkedList<>();
        link.add(5);
        link.add(10);
        link.add(15);

        //   link.removeLast(); // błąd

        // Powinno być tak:
//        W powyższym kodzie nie mamy dostępu do metody removeLast(), ponieważ zadeklarowaliśmy zmienną jako ogólniejszy
//        typ List. Deklarując zmienną jako LinkedList problem nie występuje:

        LinkedList<Integer> link1 = new LinkedList<>();
        link1.add(5);
        link1.add(10);
        link1.add(15);

        link1.removeLast();// ok

//        Ogólna zasada brzmi: definiuj zmienne jako najogólniejszy możliwy typ, który nie powoduje utraty funkcjonalności
//        i nie zmusza cię do rzutowania.
    }
}
