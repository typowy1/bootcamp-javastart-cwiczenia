package prework.kolekcje.mapy;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Library {
    public static void main(String[] args) {
//        // tworzymy mape ktora jako klucz przyjmuje Integer a wartość to obiekt Book

//        Map<Integer, Book> books = new HashMap<>(); // nie interesuje nas kolejnosć więc wybieramy hash mape
//        books.put(123, new Book("Książka123", 123)); // dodaje ksiązkę
//        books.put(456, new Book("Książka456", 456)); // dodaje ksiązkę
//        books.put(789, new Book("789", 789)); // dodaje ksiązkę
//
//        // wyswietlamy klucze i wartosci
//        Set<Map.Entry<Integer, Book>> entries = books.entrySet();
//        for (Map.Entry<Integer, Book> entry : entries) {
//            System.out.println(entry.getKey() + "::::" + entry.getValue()); // wyświetlamy klucz i wartość, żeby wyświetlić informacje z Book musimy wygenerować metode to string
//        }

        //kluczami będą książki a wartością do niej przypisaną będzie ilosć egzemplarzy w bibliotece

        Map<Book, Integer> books = new HashMap<>();
        books.put(new Book("Książka123", 123), 12);// wstawianie ksiązka kluczem a wartosć to ilość wystąpień czyli ilosć ksiązek
        books.put(new Book("Książka123", 123), 12);// jak jest metoda equals i hashcode w obiekcie duplikat sie nie doda
        books.put(new Book("Książka457", 457), 4);// wstawianie ksiązka kluczem a wartosć to ilość wystąpień czyli ilosć ksiązek
        books.put(new Book("Książka789", 789), 30);// wstawianie ksiązka kluczem a wartosć to ilość wystąpień czyli ilosć ksiązek

        Set<Map.Entry<Book, Integer>> entries = books.entrySet();
        for (Map.Entry<Book, Integer> entry : entries) {
            System.out.println(entry.getKey() + " :::: ilość: " + entry.getValue()); // klucz wartosć
            System.out.println(entry.getKey().getTitle() + " :::: ilość: " + entry.getValue()); // tytuł ksiązki i ilość
        }

        //!!pamietaj by do obiektu dodać metode equal i hash code inaczej będzie możliwość wstawienia do Mapy drugiej takiej samej wartosci
    }
}
