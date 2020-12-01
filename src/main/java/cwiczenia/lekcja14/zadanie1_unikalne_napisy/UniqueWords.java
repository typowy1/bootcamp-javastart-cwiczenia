package cwiczenia.lekcja14.zadanie1_unikalne_napisy;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class UniqueWords {
    public static void main(String[] args) {
//        wczytasz od użytkownika 10 napisów
        Set<String> words = createSet();
//        liczbę unikalnych napisów wprowadzonych przez użytkownika
        printStat(words);
    }

    private static void printStat(Set<String> words) {
        System.out.println("Liczba unikalnych napisów wprowadzonych przez użytkownika: " + words.size());
        // w zbiorach są tylko unikalne napisy
        System.out.println(words); //wyswietlenie w 1 wierszu, w listach zbiorach kolejkach mamy zdefiniowaną metodę to string, zwróci nam wszystkie obiekty w tym zbiorze
        for (String word : words) {
            System.out.println(word);// wyświeltlenie jeden pod drugim
        }
    }

    private static Set<String> createSet() {
        Scanner scanner = new Scanner(System.in);
        Set<String> words = new TreeSet<>(); // zbiór z sortowaniem z naturalnum pożądkiem napisów

        for (int i = 0; i < 10; i++) {
            System.out.println("Podaj kolejny napis");
            String next = scanner.nextLine();
            words.add(next); // dodanie napisu od użytkownika
        }
        return words;
    }
}
