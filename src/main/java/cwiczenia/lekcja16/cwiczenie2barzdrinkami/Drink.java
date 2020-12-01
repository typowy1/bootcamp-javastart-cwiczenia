package cwiczenia.lekcja16.cwiczenie2barzdrinkami;

public class Drink {

    private String name;
    private double price;
    private DrinkType type;

    public Drink(String name, double price, DrinkType type) {
        this.name = name;
        this.price = price;
        this.type = type;
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

    public DrinkType getType() {
        return type;
    }

    public void setType(DrinkType type) {
        this.type = type;
    }
}
