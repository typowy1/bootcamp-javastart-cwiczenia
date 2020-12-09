package prework2.prework.klasyabstrakcyjne_i_interfejsy;

public class CarApp {
    public static void main(String[] args) {
        // błąd nie można tworzyć obiektów typów abstrakcyjnych
        // Vehicle vehicle = new Vehicle();

        Vehicle vehicle = new Car(); //polimorizm
        vehicle.speedUp();
        System.out.println("Samochód jedzie z prędkością: " + vehicle.getSpeed());
    }
}
