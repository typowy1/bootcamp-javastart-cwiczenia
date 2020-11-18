package prework.kolekcja_i_metody.listy;

import java.util.ArrayList;

public class Lists {

    public static void main(String[] args) {

        // częsciej używa się array lista
        //arraylist - lista tablicowa w srodku tworzona jest tablica w ktorej przechowywane sa obiekty roznego typu
        //  dodawanie pierwszego elementu // w arraylist trzeba przesunąć wszystkie elementy w prawo o 1 i jak bedzie pusta komórka to wstawiamy referencje na obiekt
        ArrayList<Integer> ints = new ArrayList<>();

        for (int i = 0; i < 100; i++) {// dodajemy do listy liczby z zakresu od 0 do 99, index 0 = wartosc 0
            ints.add(i); // obiekty Integer, nie int!
        }
        System.out.println("ints.get(50) = " + ints.get(50));
        System.out.println("Ilość elementów na liście: " + ints.size());
        System.out.println(ints);

        System.out.println("Czyszczę tablicę:");
        ints.clear();
        System.out.println("Ilość elementów na liście: " + ints.size());

        //dla double
        ArrayList<Double> ints2 = new ArrayList<>();
        for (int i = 0; i < 100; i++) { // dodajemy do listy liczby z zakresu od 0 do 99
            ints2.add((double) i); // robimy żutowanie na double
        }
        //usówanie indeksu
        ints2.remove(3); //usunie wartosć pod indeksem 3, czyli 4 index bo liczone jest od 0 czyli liczbe 3 i wszystkie elementy przesuną się w lewo, będziemy mieć 1, 2, 4, 5 itd, bez 3
        System.out.println(ints2);

//        usówanie obiektu
        ints2.remove(4.0); // w tym przypadku usuniemy wartosć 4.0
        System.out.println(ints2);

    }
}
