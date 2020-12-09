package prework2.prework.kolekcja_i_metody.ComparableComparator.Comparable1;

import java.util.Arrays;

public class ProductCatalog {

    public static void main(String[] args) {
        Product[] products = new Product[7];
        products[0] = new Product("Amino", "Zupa pomidorowa", 3.90);
        products[1] = new Product("Amino", "Zupa ogórkowa", 3.90);
        products[2] = new Product("WINIARY", "Zupa pomidorowa", 4.20);
        products[3] = new Product("WINIARY", "Zupa pieczarkowa", 4.10);
        products[4] = new Product("WINIARY", "Rosół", 3.60);
        products[5] = new Product("Knorr", "Placki ziemniaczane", 6.40);
        products[6] = new Product("Knorr", "Racuchy", 7.20);

        System.out.println("Nieposortowana: ");
        for (Product p : products) {
            System.out.println(p);
        }

        "abc".compareTo("xyx");
        "abc".compareToIgnoreCase("XYZ");

        Arrays.sort(products);// posortowaliśmy produkty
        System.out.println("Posortowana: ");
        for (Product p : products) {
            System.out.println(p);
        }
        //Problemem powyższego rozwiązania jest fakt, że korzystając z interfejsu Comparable możemy zdefiniować tylko
        // jeden sposób sortowania, który będziemy rozumieli jako naturalny porządek dla danej klasy.

//        co potwierdza, że tablica faktycznie została posortowana zgodnie z zadanymi kryteriami. Jeżeli chcesz posortować
//        obiekty w porządku malejącym, to wystarczy zmienić znak zwracanych wartości. Przykładowo, aby posortować produkty
//        po cenie, ale w kolejności malejącej, należałoby zapisać:

//        @Override
//    public int compareTo(Product p) {
//    if (price > p.price)
//        return -1;
//    else if (price < p.price)
//        return 1;
//    int producerCompare = producer.compareTo(p.producer);
//    if (producerCompare != 0)
//        return producerCompare;
//    return name.compareTo(p.name);
//}
    }
}
