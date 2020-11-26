package cwiczenia.lekcja16.cwiczenie1typyopon;

public class Tire {

    private String producer;
    private String model;
    private int size;
    private TireType type;

    public Tire(String producer, String model, int size, TireType type) {
        this.producer = producer;
        this.model = model;
        this.size = size;
        this.type = type;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public TireType getType() {
        return type;
    }

    public void setType(TireType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Tire{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", size=" + size +
                ", type=" + type +
                '}';
    }
}
