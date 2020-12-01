package cwiczenia.lekcja14.zadanie6przegladsamochodow;

public class Vehicle {

    // za pomocą stałych okreslamy typy pojazdów

    public static final String TYPE_CAR = "samochód";
    public static final String TYPE_MOTORCYCLE = "motocykl";
    public static final String TYPE_TIR = "ciężarówka";

    private String type;
    private String brand;
    private String model;
    private int year;
    private int mileage;
    private String vin;

    public Vehicle(String type, String brand, String model, int year, int mileage, String via) {
        this.type = type;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
        this.vin = via;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }
//    metoda która zwróci obiekt csv czyli oddzielony;

    public String toCsv() {
        return type + ";" + brand + ";" + model + ";" + year + ";" + mileage + ";" + vin;
    }
}
