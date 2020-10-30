package prework.dziedziczenie.vehicles;

public class WheeledVehicle extends Vehicle {
    // klasa dziedziczy pola engine i fuel z klasy Vehicle
    private int wheels; // liczba kół

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }
}
