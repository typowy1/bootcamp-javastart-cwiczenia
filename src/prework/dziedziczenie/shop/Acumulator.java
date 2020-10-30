package prework.dziedziczenie.shop;

public class Acumulator extends Part {

    private double capacity;
    private String type;

    public Acumulator(String id, String manufacturer, String description, double capacity, String type) {
        super(id, manufacturer, description);//wywołanie konstruktora z klasy nadrzędnej czyli Part, bez tego wszystko
        // będzie na czerwono, super musi być 1 instrukcją konstruktora
        this.capacity = capacity;
        this.type = type;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    String getInfo() {
        return super.getInfo()// super, wywoła ciało metody get info z klasy nadrzędnej można ją modyfiokwać
                + ", " + capacity + ", " + type;
    }

    //    String getInfo() {
//        return getId() + ", " + getManufacturer() + ", " + getDescription() + // te pole odziedziczyyliśmy po klasie Part
//                ", " + getCapacity() + ", " + getType();
//    }
}
