package prework2.prework.kolekcja_i_metody.LivecodingSortowanie;

import java.util.Arrays;

public class KlasaArrays {
    public static void main(String[] args) {
        int[] array = {4, 5, 2, 7, 8, 9, 1, 10};
        System.out.println(Arrays.toString(array)); // wuświetla elementy tablicy

        int[] copyArray = Arrays.copyOf(array, array.length);//odwołujemy się do tablicy którą chcemy skopiować, i dajemy jak długa ma byc tablica, w tym wypadku ma miec taka sama długosć co oryginał

        Arrays.sort(copyArray);// sortowanie, modyfikuje oryginalną tablice, lepiej to robić na kopi bo utracimy oryginalną tablice
        System.out.println(Arrays.toString(copyArray));

        int index = Arrays.binarySearch(copyArray, 10);// wyszukiwanie binarne, wyszukiwanie elementów, zwróci pod którym indeksem się znajduje wartosc
        System.out.println("Index " + index);

        int[] arrays2 = new int[10];
        Arrays.fill(arrays2, 10);//wypełnianie tablic jedną wartoscią
        System.out.println(Arrays.toString(arrays2));

        String[] names = {"Kasia", "Basia", "Wojtek", "Antek"};

        Arrays.sort(names);// problem jest przy polskich znakach i wielkich literach, porównywanie sa znaki unikodu
        System.out.println(Arrays.toString(names));
    }
}
