package prework.lekcja4.this1;

public class Product {
    //    getter - metoda służąca do odczytu danych,
//    setter - metoda służąca do modyfikacji danych

    private String name;
    private double price;
    private String producer;

    public Product(String name, double price, String producer) {
        this(name, producer);// żeby wywołać konstruktor z mnijszą ilością typów to dajemy this
        this.price = price; // i (parmetry z mniejszego konstrukora)
        System.out.println("Konstruktor 1");
    }

    public Product(String name, String producer) {
        this.name = name;
        this.producer = producer;
        System.out.println("Konstruktor 2");
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

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }
}
