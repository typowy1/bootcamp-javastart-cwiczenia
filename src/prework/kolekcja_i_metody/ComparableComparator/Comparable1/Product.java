package prework.kolekcja_i_metody.ComparableComparator.Comparable1;

public class Product implements Comparable<Product> {
    //https://javastart.pl/kurs/java/java-podstawy-temat-31-comparable-i-comparator/lekcja/java-podstawy-interfejsy-comparable-i-comparator

    private String producer;
    private String name;
    private double price;

    public Product(String producer, String name, double price) {
        this.producer = producer;
        this.name = name;
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
    public int compareTo(Product p) {// minus nie mozemy ich definiowac kilka razy dla roznych wyszukiwan
        if (price > p.price)
            return 1; // po cenie ale malejąco dajemy -1
        else if (price < p.price)
            return -1; // po cenie ale malejąco dajemy 1
        int producerCompare = producer.compareTo(p.producer);
        if (producerCompare != 0)
            return producerCompare; // producent malejąco, dajemy -, -producerCompare
        return name.compareTo(p.name); //name malejąco, dajemy -, -name.compareTo(p.name)

//        jeżeli liczba będzie dodatnia to produkt 1 jest wiekszy od produktu dwa, jezeli zero to są sobie równe, jeżeli -1 produkt2 wiekszy od produktu 2
    }

//    W metodzie compareTo(arg) musimy teraz zdefiniować zasady sortowania i zwrócić jedną z wartości:
//
//    liczbę ujemną, jeśli obiekt oryginalny (this) jest "mniejszy", czyli ma być poprzednikiem obiektu przekazanego jako argument (arg).
//    liczbę 0 jeśli porównywane obiekty są sobie równe,
//    liczbę dodatnią, jeśli obiekt oryginalny (this) jest "większy", czyli ma być następnikiem obiektu przekazanego jako argument (arg).
//
//W przypadku sortowania obiektów typu Product możemy zastosować następującą zasadę:
//
//    sortujemy po cenie rosnąco
//    jeśli kilka produktów ma taką samą cenę, to sortujemy dodatkowo po nazwie producenta,
//    jeśli nazwa producenta kilku produktów jest taka sama, to sortujemy po nazwie towaru.

//    W interfejsie Comparable zdefiniowana jest tylko jedna metoda compareTo(), co przetłumaczyć można na "porównaj z".
//    Ponieważ nie jest to metoda domyślna, musimy ją zaimplementować w naszej klasie. Typ Comparable będzie podświetlony
//    na żółto, co oznacza ostrzeżenie:

//    Problem polega na tym, że interfejs Comparable jest typem generycznym i w takiej sytuacji powinniśmy określić z
//    obiektami jakiego typu będziemy chcieli porównywać obiekty typu Product. W naszym przypadku oczywiście będziemy
//    porównywali obiekty Product z innymi obiektami Product. Dzięki określeniu parametru generycznego metoda compareTo()
//    będzie miała parametr typu Product, a nie Object, co zaoszczędzi nam niepotrzebnego rzutowania.
}
