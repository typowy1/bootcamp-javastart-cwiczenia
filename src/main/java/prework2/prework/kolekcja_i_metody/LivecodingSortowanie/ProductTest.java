package prework2.prework.kolekcja_i_metody.LivecodingSortowanie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ProductTest {
    public static void main(String[] args) {
        //sortowanie obiektów

        Product product1 = new Product("Czekolada", 4.5);
        Product product2 = new Product("Banan", 3.5);
        int compare = product1.compareTo(product2);// porównaj produkt 1 z produkt 2
        //jezeli produkt1 jest wiekszy dostaniemy dodatnią liczbe, jezeli równy to 0, jezeli mniejszy to ujemna
        System.out.println(compare); // cena czekolady jest większa niż cena banana
        PriceComparator priceComparator = new PriceComparator();// kożystamy z price comparatora
        int compare1 = priceComparator.compare(product1, product2);
        System.out.println(compare1);


        List<Product> products = new ArrayList<>();
        products.add(new Product("Czekolada", 4.5));
        products.add(new Product("Banan", 3.5));
        products.add(new Product("Mleko", 4));
        products.add(new Product("Masło", 4));

//sortowanie za pomocą copmarable
        Collections.sort(products);
        //sortowanie po cenie
        System.out.println(products); //żeby drukowac musi być tostring, przy sortowaniu przez cene czekolada będzie dalej niż banan bo sortujemy po cenie

//        pierw sortowanie po cenie, jak cena taka sama to sortowanie po nazwie
        //sortujemy za pomocą interfejsów comperable lub comparator

        // tak samo można sortować tablice z obiektami

//        sortowanie za pomocą comparatora po cenie

        PriceComparator priceComparator1 = new PriceComparator();
        Collections.sort(products, priceComparator1);
        //lub
//        Collections.sort(products, new PriceComparator());
        System.out.println(products);

        // sortowanie po nazwie
        NameComperator nameComperator = new NameComperator();
        Collections.sort(products, nameComperator); // w odwrotnej kolejnosci
        Collections.sort(products, nameComperator.reversed()); // w odwrotnej kolejnosci
        System.out.println(products);

//        identycznie z tablicami:

//        Arrays.sort(products1, nameComperator);

    }
}
