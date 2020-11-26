package cwiczenia.lekcja16.cwiczenie4obslugazamowien;

public class Order {

    // obiekt zamówienia

    private int id;
    private String name;
    private double price;
    private OrderState state;// stan zamówienia, tu posłużymy się enumami w obiekcie stanu zamówienia

    public Order(int id, String name, double price, OrderState state) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.state = state;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public OrderState getState() {
        return state;
    }

    public void setState(OrderState state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + price + "zł " + state;
    }
}
