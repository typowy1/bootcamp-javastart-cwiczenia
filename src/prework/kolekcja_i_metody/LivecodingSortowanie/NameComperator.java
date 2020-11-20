package prework.kolekcja_i_metody.LivecodingSortowanie;

import java.util.Comparator;

public class NameComperator implements Comparator<Product> {
    //przy stringach inaczej, bez String.compare
    @Override
    public int compare(Product p1, Product p2) {
        return p1.getName().compareTo(p2.getName());
    }
}
