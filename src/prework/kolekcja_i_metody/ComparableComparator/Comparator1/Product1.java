package prework.kolekcja_i_metody.ComparableComparator.Comparator1;

import java.util.Arrays;
import java.util.Comparator;

public class Product1 implements Comparable<Product1> /* z jakim obiektem porównujemy*/ {

    private String name;
    private String producer;
    private double price;

    public Product1(String name, String producer, double price) {
        this.name = name;
        this.producer = producer;
        this.price = price;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product [name=" + name + ", producer=" + producer + ", price=" + price + "]";
    }

    @Override
    public int compareTo(Product1 o) {
        return 0;
    }


//    Przykład 1 - zagnieżdżona klasa wewnętrzna
//
//Jako pierwszy przykład pokażemy jak zastosować Comparator jako statyczną klasę zagnieżdżoną. Dlaczego statyczną?
// Ponieważ dzięki temu unikamy konieczności tworzenia obiektu klasy nadrzędnej. Większość klasy Product zostaje bez zmian,
// poniżej pokazano dodatkowy kod, który pozwoli nam posortować produkty po nazwie produktu.

//    W interfejsie Comparator zdefiniowana jest jedna metoda abstrakcyjna compare(), którą musimy zaimplementować.
//    Ponieważ interfejs ten również jest generyczny to pozwala nam na zdefiniowanie typu, jaki chcemy porównywać.
//    Zwróć uwagę, że nazwa metody to samo compare(), a nie compareTo().

    public static class Product1NameComparator implements Comparator<Product1> {
        @Override
        public int compare(Product1 p1, Product1 p2) {
            return p1.getName().compareTo(p2.getName());//- jeśli ma być odwrotnie, -p1.getName().compareTo(p2.getName()
        }
    }

//    Przykład 2 - klasa anonimowa
//
//W przypadku tak prostego komparatora jak powyżej warto także rozważyć zastosowanie anonimowej klasy wewnętrznej,
// która implementuje interfejs Comparator. Będzie to rozwiązanie sensowne w przypadku, gdy sortowanie odbywa się tylko
// w jednym miejscu programu i wiemy, że raczej nam się już nigdy nie przyda.
//
//Prosta klasa anonimowa sortująca produkty zgodnie z nazwą producenta wyglądałaby następująco:

//    w mainie ją definiujemy
//    Arrays.sort(products, new Comparator<Product1>() {
//        @Override
//        public int compare(Product o1, Product o2) {
//            return o1.getProducer().compareTo(o2.getProducer());
//        }
//    });

}
