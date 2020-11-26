package cwiczenia.lekcja16.cwiczenie4obslugazamowien.comparator;


import cwiczenia.lekcja16.cwiczenie4obslugazamowien.Order;

import java.util.Comparator;

public class NameComparator implements Comparator<Order> { // sortowanie po nazwie
    @Override
    public int compare(Order o1, Order o2) {
        return o1.getName().compareToIgnoreCase(o2.getName()); // tu małe i duże litery nie będą dla nas mieć znaczenia, posortuje alfabetycznie
    }
}
