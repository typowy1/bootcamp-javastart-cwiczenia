package cwiczenia.lekcja16.cwiczenie4obslugazamowien;

import cwiczenia.lekcja16.cwiczenie4obslugazamowien.comparator.NameComparator;
import cwiczenia.lekcja16.cwiczenie4obslugazamowien.comparator.PriceComparator;
import cwiczenia.lekcja16.cwiczenie4obslugazamowien.comparator.StatusComparator;

import java.util.Comparator;

public enum SortOrder {

    NAME(new NameComparator()),
    PRICE(new PriceComparator()),
    STATUS(new StatusComparator());

    public final Comparator<Order> orderComparator;

    SortOrder(Comparator<Order> orderComparator) {
        this.orderComparator = orderComparator;
    }
}
