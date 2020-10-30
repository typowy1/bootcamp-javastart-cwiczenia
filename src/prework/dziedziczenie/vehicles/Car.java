package prework.dziedziczenie.vehicles;

public class Car extends WheeledVehicle {
    //klasa dziedziczy pola engine, fuel oraz wheels
    private String type;
    private int wheels;

    void printInfo() {
        System.out.println("Samochód: silnik: " + getEngine().getType() + " , koła: " + getWheels());
    }

    //Samochód dziedziczy po pojeździe kołowym i dodatkowo ma informacje o typie samochodu (coupe, sedan itp.)
}
