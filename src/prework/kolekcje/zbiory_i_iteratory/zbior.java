package prework.kolekcje.zbiory_i_iteratory;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class zbior {
    public static void main(String[] args) {
        // w odróznieniu od list nie ma dostepu w setach do elementow na postawie obiektow

        //zbiory gwarantuja unikalnosc ubiektow, żeby ją uzyskać to w klasie biektu trzeba zdefiniować tez metode equls i hash code
        // w zbiorach przechowujemy unikalne obiekty
//        używamy nadrzednego interfejsu set

//        1. implementacja zbioru to hashset

        // - tylko unikalne obiekty, szybkie szybkie wstawianie, szybki dostęp
        // unikalnosc jest sprawdzana poprzez metody equals i hashcode
        //nie pokryje się z kolejnością wstawiania obiektów
        Set<String> set = new HashSet<>();
        //dodane do zbioru

        set.add("Ania");
        set.add("Ania");
        set.add("Ania");
        // doda się tylko jedna Anie dwie pozostałe zostaną zignorowane
        set.add("Kasia");
        set.add("Basia");
        set.add("Zosia");

        System.out.println(set);
        System.out.println(set.size());
//        [Basia, Ania, Kasia, Zosia]
//        4

//        2. Implemetacja zbioru to TreeSet, unikalność obiektów, sortowanie obiektow zgodnie z porzadkiem tkory jest wykorzystywany
        //defoltowo, dla streeng kolejnosc liter, dla np integera to rosnace liczby
//        Set<String> set2 = new TreeSet<>();
        TreeSet<String> set2 = new TreeSet<>();
        //dodane do zbioru

        set2.add("Ania");
        set2.add("Ania");
        set2.add("Ania");
        // doda się tylko jedna Anie dwie pozostałe zostaną zignorowane
        set2.add("Kasia");
        set2.add("Basia");
        set2.add("Zosia");

        System.out.println(set2);
        System.out.println(set2.size());

//        dodatkowo posiada dodatkowe metody
        //pobranie pierwszego i ostatniego elementu, ale trzeba podać typ referencji TreeSet
        System.out.println(set2.first());
        System.out.println(set2.last());

        // mozna dodawać obiekty zdefiniowanych typow np book
    }

}
