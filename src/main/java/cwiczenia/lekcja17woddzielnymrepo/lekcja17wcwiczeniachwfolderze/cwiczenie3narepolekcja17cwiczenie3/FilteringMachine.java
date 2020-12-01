package cwiczenia.lekcja17woddzielnymrepo.lekcja17wcwiczeniachwfolderze.cwiczenie3narepolekcja17cwiczenie3;

import java.util.List;
import java.util.stream.Collectors;

public class FilteringMachine {

    //Rozwiązanie jest na folderze lekcja17cwiczenie3

    public List<Integer> filterOutNotEvenNumbers(List<Integer> numberList) {
        return numberList.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
    }

    public List<Integer> filterOutLowerNumbersThan20(List<Integer> numberList) {
        return numberList.stream().filter(x -> x >= 20).collect(Collectors.toList());
    }

    public List<Book> convertToBooks(List<String> titles) {
        return titles.stream().map(Book::new).collect(Collectors.toList()); // przetwarzanie na obiekt ksiązka, Book::new referencja do konstruktora
    }

    // Metoda powinna przekształcić tytuły na książki i zwrócić tylko te które rozpoczynają się od słowa "Gra"
    public List<Book> convertToBooksAndReturnOnlyStartingWithGra(List<String> titles) {
        return titles.stream().filter(title -> title.startsWith("Gra")).map(Book::new).collect(Collectors.toList());
    }
}
