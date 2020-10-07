package cwiczenia.lekcja2.Informacjeoproduktach1klasyobiekty;

public class Product {
    String productName;
    Producer producer;
    double price;
    boolean availability;

    Product(String productNam, double pric, boolean availab, Producer prduce) {
        productName = productNam;
        producer = prduce;
        price = pric;
        availability = availab;
    }
}
