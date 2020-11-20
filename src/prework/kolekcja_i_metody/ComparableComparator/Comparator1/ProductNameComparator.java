package prework.kolekcja_i_metody.ComparableComparator.Comparator1;

import java.util.Comparator;

public class ProductNameComparator implements Comparator<Product1> {

    @Override
    public int compare(Product1 p1, Product1 p2) {
        return p1.getName().compareTo(p2.getName());
    }
}
