package prework2.prework.dziedziczenie.shop;

public class Wiper extends Part {

    private int length;
    private String type;

    public Wiper(String id, String manufacturer, String description, int length, String type) {
        super(id, manufacturer, description);//wywołanie konstruktora z klasy nadrzędnej czyli Part, bez tego wszystko
        // będzie na czerwono super musi być 1 instrukcją konstruktora
        this.length = length;
        this.type = type;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    String getInfo() {
        return super.getInfo()// super, wywoła  ciało metody get info z klasy nadrzędnej można ją modyfiokwać jak damy
                // na końcu;  a nie po getinfo
                + ", " + length + ", " + type;
    }

    //    String getInfo() {
//        return getId() + ", " + getManufacturer() + ", " + getDescription() + // te pole odziedziczyyliśmy po klasie Part
//                ", " + getLength() + ", " + getType();
//    }
}
