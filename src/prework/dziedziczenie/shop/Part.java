package prework.dziedziczenie.shop;

public class Part {
    // częsć wspólna dla opon, wycieraczek, akumulatorów
    private String id;
    private String manufacturer;
    private String description;

    public Part(String id, String manufacturer, String description) {
        this.id = id;
        this.manufacturer = manufacturer;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    String getInfo() {
        return id + ", " + manufacturer + ", " + description;

    }
}
