package cwiczenia.lekcja13.zadanie2;

import java.math.BigDecimal;
import java.util.List;
import java.util.function.Function;

public class PriceCalculator {

    // zwraca statystyki

    static Stats calculateStats(List<Item> items) {
        BigDecimal nettoSum = sumNettoPrice(items);
        BigDecimal taxSum = sumTaxPrice(items);
        BigDecimal bruttoSum = sumBruttoPrice(items);
        return new Stats(nettoSum, taxSum, bruttoSum);
    }

//    //Sumę sprzedaży netto.
//    static BigDecimal sumNettoPrice(List<Item> items){
//        BigDecimal sum = BigDecimal.ZERO;// definiujemy sume do której beda dodawane wartosci
//        // petla przejdzie po kazdym elemencie listy i wyciągamy cene netto i dodajemy do sumy
//        for (Item item : items) {
//           sum = sum.add(item.getNettoPrice()); // do sumy dodajemy cene netto, prawidłowe dodanie ponieważ rezultat to będzie nowy obiekt i nie mozemy nadpisac
//        }
//        return sum;
//    }
//
//    // Sumę podatku VAT.
//
//    static BigDecimal sumTaxPrice(List<Item> items){
//        BigDecimal sum = BigDecimal.ZERO;// podobnie jak wyżej
//        for (Item item : items) {
//            sum = sum.add(item.getTax()); //
//        }
//        return sum;
//    }
//
//    static BigDecimal sumBruttoPrice(List<Item> items){
//        BigDecimal sum = BigDecimal.ZERO;// podobnie jak wyżej
//        for (Item item : items) {
//            sum = sum.add(item.getBruttoPrice()); //
//        }
//        return sum;
//    }

    //    1 wersja
    static BigDecimal sumNettoPrice(List<Item> items) {
        BigDecimal sum = BigDecimal.ZERO;
        for (Item item : items) {
            sum = sum.add(item.getNettoPrice());
        }
        return sum;
    }

    static BigDecimal sumTaxPrice(List<Item> items) {
        BigDecimal sum = BigDecimal.ZERO;
        for (Item item : items) {
            sum = sum.add(item.getTax());
        }
        return sum;
    }

    static BigDecimal sumBruttoPrice(List<Item> items) {
        BigDecimal sum = BigDecimal.ZERO;
        for (Item item : items) {
            sum = sum.add(item.getBruttoPrice());
        }
        return sum;
    }

//    2 wersje

    // 3 metody wyzej wyglądają bardzo podobnie można zrobić 1 poniżej
    // wyrażenia lambda
    // Funkction - funkcje to przekształecenie obiektu jednego typu na obiekt innego typu
    // zmienia się item i wyciagamy BigDecimala

//    static BigDecimal sum(List<Item> items, Function<Item, BigDecimal> extractor){ //extractor to nzawa funkcji, Funkcja będzie przekształcała obikty typu item na obiekty typu BigDecimal
//        BigDecimal sum = BigDecimal.ZERO;// podobnie jak wyżej
//        for (Item item : items) {
//            sum = sum.add(extractor.apply(item)); //kożystając z funkcji extractor bedziemy wyciągali coś z item
//        }
//        return sum;
//    }

}
