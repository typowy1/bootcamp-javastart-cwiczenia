package prework.kolekcja_i_metody.LivecodingSortowanie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class KlasaCollections {
    public static void main(String[] args) {
        //definiowanie listy
        String[] names = {"Kasia", "Basia", "Kasia", "Wojtek", "Antek"};
        List<String> namesList = Arrays.asList(names); // dodanie tablicy do listy, przyjmuje tablice i zwraca liste
        System.out.println(namesList); // drukowanie listy

//        sortowanie, do sortowania list kożystamy z klasy Collections
        Collections.sort(namesList);// możemy przekazac liste dowolnego typu
        System.out.println(namesList); // drukowanie listy

        //zliczamy ile razy w liscie pojawia sie imie kasia
        int kasiaFreq = Collections.frequency(namesList, "Kasia");
        System.out.println("Kasia powtarza się: " + kasiaFreq);

        //najmniejsz i największa wartosć
        String min = Collections.min(namesList);// listy nie muszą byc posortowane
        String max = Collections.max(namesList);
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);

        // odwraca kolejnosć elementów
//        reversd

//        miesza elementy
//        shuffle


    }

}
