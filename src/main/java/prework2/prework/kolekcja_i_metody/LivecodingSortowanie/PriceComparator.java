package prework2.prework.kolekcja_i_metody.LivecodingSortowanie;

import java.util.Comparator;

public class PriceComparator implements Comparator<Product> { //<Product> obiekt jakiego typu będziemy porównywali
    @Override
    public int compare(Product p1, Product p2) {
        return Double.compare(p1.getPrice(), p2.getPrice()); // porównujemy cene
    }
}
