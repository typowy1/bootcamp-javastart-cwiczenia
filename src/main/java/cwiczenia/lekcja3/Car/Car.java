package cwiczenia.lekcja3.Car;

public class Car {

    String name;
    int power;
    int currentSpeed;

    Car() {
    } // konstruktor domyślny dobrze jak jest w klasie

    Car(String nam, int pow, int spee) {
        name = nam;
        power = pow;
        currentSpeed = spee;
    }

    void show() {
        System.out.println("Nazwa samochodu: " + name);
        System.out.println("Moc silnika: " + power + " KM");
        System.out.println("Prędkość samochodu: " + currentSpeed + "km\n");
    }
}
