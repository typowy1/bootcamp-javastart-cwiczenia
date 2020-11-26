package prework.kolekcja_i_metody.LivecodingSortowanie;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

public class Zbiór {
    public static void main(String[] args) {

        Set<Product> products = new TreeSet<>(new NameComperator()); // teraz będziemy mieć sortowanie po nazwie
//        analogicznie dla kolejki
//        Queue<Product> products = new PriorityQueue<>(new NameComperator()); // teraz będziemy mieć sortowanie po nazwie
//        analogicznie do mapy

        products.add(new Product("Czekolada", 4.5));
        products.add(new Product("Banan", 3.5));
        products.add(new Product("Mleko", 4));
        products.add(new Product("Masło", 4));
        System.out.println(products); // sortowanie po naturalnym porządku zdefiniowanym w Produkt za pomoca interfejsu Comparable

        //żeby sortować trzeba w Produkcie zaimplementować interfejs comparable lub interefejs comperator
    }

}
