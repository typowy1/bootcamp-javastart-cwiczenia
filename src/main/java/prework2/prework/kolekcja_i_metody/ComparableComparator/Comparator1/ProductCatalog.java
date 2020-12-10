package prework2.prework.kolekcja_i_metody.ComparableComparator.Comparator1;

import prework2.prework.kolekcja_i_metody.ComparableComparator.Comparable1.Product;

import java.util.Arrays;
import java.util.Comparator;

public class ProductCatalog {
    public static void main(String[] args) {
        Product1[] products = new Product1[7];
        products[0] = new Product1("Amino", "Zupa pomidorowa", 3.90);
        products[1] = new Product1("Amino", "Zupa ogórkowa", 3.90);
        products[2] = new Product1("WINIARY", "Zupa pomidorowa", 4.20);
        products[3] = new Product1("WINIARY", "Zupa pieczarkowa", 4.10);
        products[4] = new Product1("WINIARY", "Rosół", 3.60);
        products[5] = new Product1("Knorr", "Placki ziemniaczane", 6.40);
        products[6] = new Product1("Knorr", "Racuchy", 7.20);

        System.out.println("Nieposortowana: ");
        for (Product1 p : products) {
            System.out.println(p);
        }

//        Wykorzystanie takiego komparatora w metodzie Arrays.sort() wyglądać będzie następująco:
        Product1.Product1NameComparator product1NameComparator = new Product1.Product1NameComparator(); // - zmienna
        Arrays.sort(products, new Product1.Product1NameComparator());// tu wstawiamy comparator
        System.out.println("Posortowana: ");
        for (Product1 p : products) {
            System.out.println(p);
        }

        //    Przykład 2 - klasa anonimowa
//
//W przypadku tak prostego komparatora jak powyżej warto także rozważyć zastosowanie anonimowej klasy wewnętrznej,
// która implementuje interfejs Comparator. Będzie to rozwiązanie sensowne w przypadku, gdy sortowanie odbywa się tylko
// w jednym miejscu programu i wiemy, że raczej nam się już nigdy nie przyda.
//
//Prosta klasa anonimowa sortująca produkty zgodnie z nazwą producenta wyglądałaby następująco:

//    w mainie ją definiujemy
        Arrays.sort(products, new Comparator<Product1>() {// klasa anonimowa storzona na potrzeby tego prostegoo sortowania
            @Override
            public int compare(Product1 o1, Product1 o2) {
                return o1.getProducer().compareTo(o2.getProducer());
            }
        });
        //Dzięki takiemu rozwiązaniu komparator tworzony jest tylko na potrzeby tego pojedynczego sortowania.
        // Z powodu budowy klasy anonimowej  raczej nie jest wskazane wykorzystywanie tego rozwiązania przy bardziej
        // rozbudowanych porównaniach.

//        Przykład 3 - osobna klasa
        //Jego użycie wygląda wtedy podobnie jak w przypadku klasy zagnieżdżonej:


        Arrays.sort(products, new ProductNameComparator()); // comparator w osobnej klasie
        //To, z którego podejścia zdecydujesz się skorzystać zależy tylko od ciebie i tego co uznasz za czytelniejsze w danym przypadku.
    }
}
