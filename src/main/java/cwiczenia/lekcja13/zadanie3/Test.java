package cwiczenia.lekcja13.zadanie3;

import java.io.FileNotFoundException;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        // odczytywanie pliku
        try {
            List<String> strings = FileImprter.readWordsFromFile("word.txt");
            String longestWord = ListUtils.findLongestWord(strings);
            String shortestWord = ListUtils.findShortesWord(strings);
            System.out.println(strings); // odczytywanie listy dlatego ze defoltowo jes dodana metoda to dtring w listach
            System.out.println("Najdłuższy wyraz: " + longestWord); // najdłuższy wyraz
            System.out.println("Najkrótszy wyraz: " + shortestWord); // najkrótszy wyraz
            System.out.println("Laczna długość napisów: " + ListUtils.countLetters(strings)); // łączna długosć wyrazów
        } catch (FileNotFoundException e) {
            System.err.println("Nie udało się odczytać pliku");
        }
    }
}

