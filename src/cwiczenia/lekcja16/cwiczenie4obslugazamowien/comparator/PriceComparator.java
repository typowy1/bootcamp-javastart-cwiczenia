package cwiczenia.lekcja16.cwiczenie4obslugazamowien.comparator;

import cwiczenia.lekcja16.cwiczenie4obslugazamowien.Order;

import java.util.Comparator;

public class PriceComparator implements Comparator<Order> { // sortowanie po cenie
    @Override
    public int compare(Order o1, Order o2) {
        return Double.compare(o1.getPrice(), o2.getPrice());
    }
}
