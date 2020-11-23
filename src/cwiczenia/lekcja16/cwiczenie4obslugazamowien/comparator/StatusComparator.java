package cwiczenia.lekcja16.cwiczenie4obslugazamowien.comparator;

import cwiczenia.lekcja16.cwiczenie4obslugazamowien.Order;

import java.util.Comparator;

public class StatusComparator implements Comparator<Order> {
    @Override
    public int compare(Order o1, Order o2) {
        return o1.getState().compareTo(o2.getState()); // sortujemy po statusie zamówienia
    }
}
