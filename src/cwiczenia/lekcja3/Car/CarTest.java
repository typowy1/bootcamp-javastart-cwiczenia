package cwiczenia.lekcja3.Car;

public class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car("BMW", 200, 100); // car 1 jest referencją na obiekt jtóry utworzykiśmy
//        stwirzyliśmy obiekt klasy Car, czyli car1 i na nim będziemy pracować w metodach
        CarController carController = new CarController();
        car1.show();

        //Dodajemy turbo, zwiększamy moc silnika
        System.out.println("Dodajemy turbo, zwiększamy moc silnika!");
        carController.turbo(car1);
        car1.show();

        // zwiększamy prędkość
        System.out.println("Zwiększamy prędkość!");
        carController.increaseSpeed(car1, 25);
        car1.show();

        // zmniejszamy prędkość
        System.out.println("Zmniejszamy prędkość!");
        carController.decreaseSpeed(car1, 70);
        car1.show();
    }
}
