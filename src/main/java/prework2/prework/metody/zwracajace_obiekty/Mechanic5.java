package prework2.prework.metody.zwracajace_obiekty;

public class Mechanic5 {
    void fixCar(Car5 car) { // wykonujemy działanie na obiekcie car, nap car1 lub car4 w klasie main
        // gdzie utworzylismy obiekty car1 itd
        System.out.println("Naprawiam samochód");
        car.broken = false;
        System.out.println("Samochód Naprawiony");
    }
}
