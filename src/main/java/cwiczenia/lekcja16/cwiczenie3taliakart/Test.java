package cwiczenia.lekcja16.cwiczenie3taliakart;

import java.util.List;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        List<Card> deck = CardDeckGenerator.generate(); // lista tali deck
        System.out.println(deck.size()); // wyswietlamy rozmiar tali deck

        Language language = getLanguage();
        printDeck(deck, language);
    }

    private static Language getLanguage() {// zwracamy wybrany język
        printLanguages();
        Language resultLanguage = null;
        do {
            System.out.println("Wybierz język:");
            Scanner scanner = new Scanner(System.in);
            String lang = scanner.nextLine(); //PL
            try {
                resultLanguage = Language.valueOf(lang); //zamieniamy wartość przekazaną przez użytkownika na enuma
            } catch (IllegalArgumentException e) {
                System.err.println("Błędny kod języka"); // zabespiecamy się przed wpisaniem złych wartości
            }
        } while (resultLanguage == null); // pętla twa do kiedy dopuki result language nie zapełni się prawidłową wartością od użytkownika
        return resultLanguage;// zwracamy wybrany jezyk przez użytkownika
    }

    private static void printLanguages() { // pokazuje dostępne języki
        Language[] langs = Language.values();// wyświetla dostępne enumy
        System.out.println("Dostępne języki:");
        for (Language lang : langs) {
            System.out.println(lang);
        }
    }

    private static void printDeck(List<Card> deck, Language language) {// opcje wybrania języka
        for (Card card : deck) {// w pętli wyświetlamy obiekt card z listy deck tali w zaleznosci, od wyboru jezyka
            switch (language) {
                case PL:
                    System.out.println(card.plTranslation());
                    break;
                case EN:
                    System.out.println(card.engTranslation());
                    break;
            }
        }
    }
}
