package cwiczenia.lekcja13.zadanie3;

import java.util.List;

public class ListUtils {

    //    metoda przyjmuje listę napisów i zwraca najdłuższy wyraz.
    static String findLongestWord(List<String> words) {
        String longestWord = null; // zmienna która zapamięta najdłuższy napis
        int longestWordLetters = 0; //ile liter ma ten najdłuższy wyraz

        for (int i = 0; i < words.size(); i++) {
            //jezeli długosć naszego wyrazu jest większy od longestWordLetters - to zapamiętujemy wyraz w zmiennej longestWord
            int wordLenght = words.get(i).length(); // długość wyrazu
            if (wordLenght > longestWordLetters) { // jezeli długość wyrazu jest dłuższa od najdłuższego wyrazu
                longestWordLetters = wordLenght; // to przypisujemy tą długość do zmiennej longestWordLetters
                longestWord = words.get(i); // zapisujemy wyraz do zmiennej longestWord
            }
        }
        return longestWord; // zwracamy stringa najdłuższego wyrazu
    }

    //    metoda przyjmuje listę napisów i zwraca najkrótszy wyraz.
    static String findShortesWord(List<String> words) {
        String shortestWord = null; // zmienna która zapamięta najkrótszy napis
        int shortestWordLetters = words.get(0).length(); //ile liter ma ten najdłuższy wyraz, odwolujemy się do pierwszego elementu zapisanego w liscie dlatego ze długosc wyrazu zawsze bedzie wieksza od 0

        for (int i = 0; i < words.size(); i++) {
            //jezeli długosć naszego wyrazu jest krótsza od shortestWordLetters - to zapamiętujemy wyraz w zmiennej shortestWord
            int wordLenght = words.get(i).length(); // długosć wyrazu
            if (wordLenght < shortestWordLetters) { // jezeli długość wyrazu jest krótsza od najkrótszego wyrazu
                shortestWordLetters = wordLenght; // to przypisujemy tą długość do zmiennej shortestWordLetters
                shortestWord = words.get(i); // zapisujemy wyraz do zmiennej shortestWord
            }
        }
        return shortestWord; // zwracamy stringa najkrótszego wyrazu
    }

//    metoda zlicza sumę długości wszystkich wyrazów (łączną liczbę znaków).

    static int countLetters(List<String> words) {
        int counter = 0;
        for (String word : words) {
            counter += word.length(); // do licznika przypisujemy długosć kolejnego wyrazu
        }
        return counter;
    }
}
