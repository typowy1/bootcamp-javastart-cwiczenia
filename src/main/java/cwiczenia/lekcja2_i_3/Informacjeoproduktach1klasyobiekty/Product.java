package cwiczenia.lekcja2_i_3.Informacjeoproduktach1klasyobiekty;

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
