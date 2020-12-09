package prework2.prework.kolekcja_i_metody.klasaCollections;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionsOperation {

    public static void main(String[] args) {
        String sentence = "Strona testowa służy dwóm celom: stanowi wizualne potwierdzenie "
                + "działania drukarki i może również zawierać informacje pomocne podczas "
                + "rozwiązywania problemów, takie jak szczegóły dotyczące sterownika drukarki.";
        List<String> words = Arrays.asList(sentence.split(" "));// tworzenie listy, metoda split zwraca nam tablice, separacją słów jest spacja, więc każde słowo to obiekt w liście
        System.out.println("Lista oryginalna: ");
        printCollection(words);

        // wymieszanie słów
        Collections.shuffle(words);
        System.out.println("Lista shuffle");
        printCollection(words);

        // sortowanie
        Collections.sort(words, String.CASE_INSENSITIVE_ORDER);
        //-porównuje kolejność znaków ignorując wielkość liter, sortowanie w wypadku stringóe nie do końca jest alfabetyczne
        System.out.println("Lista sort");
        printCollection(words);

        // wyszukiwanie binarne
        int position = Collections.binarySearch(words, "drukarki");
        System.out.println("Słowo \"drukarki\" jest w liście na " + position + " miejscu");
        // ilość wystąpień
        int freq = Collections.frequency(words, "Strona");
        System.out.println("Słowo \"Strona\" występuje na liście " + freq + " razy");
        // najmniejszy element w liście
        System.out.println("Najmniejszy element w liście to: " + Collections.min(words)); //możemy też przekazać drugi argument np comparator
        System.out.println("Najmniejszy element w liście to: " + Collections.min(words, String.CASE_INSENSITIVE_ORDER)); //-porównuje kolejność znaków ignorując wielkość liter

    }

    private static void printCollection(Collection<String> collection) { // wyświetlimy kazdy element rozdzielony średnikiem
        for (String s : collection) {
            System.out.print(s + "; ");
        }
        System.out.println();
    }

//    Z najciekawszych rzeczy w powyższym kodzie warto zwrócić uwagę na to, że przy sortowaniu Stringów uwzględniany jest
//    porządek nie alfabetyczny, ale zgodny z kodami liter w Unicode. Dlatego niezbędne jest wykorzystanie komparatora,
//    który jest przypisany do stałej String.CASE_INSENSITIVE_ORDER, który porównuje kolejność znaków ignorując wielkość liter.
//
//    Weź także pod uwagę, że wyszukiwanie za pomocą metody binarySearch() może być wykonywane na posortowanej liście.
//    Jeżeli wywołasz ją na liście nieuporządkowanej, wynik może być nieprawidłowy.
}
