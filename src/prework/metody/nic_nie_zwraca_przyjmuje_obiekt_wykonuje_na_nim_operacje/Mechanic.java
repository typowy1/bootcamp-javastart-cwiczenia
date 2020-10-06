package prework.metody.nic_nie_zwraca_przyjmuje_obiekt_wykonuje_na_nim_operacje;

public class Mechanic {
    void fixCar(Car3 car) { // wykonujemy działanie na obiekcie car, nap car1 lub car4 w klasie main
        // gdzie utworzylismy obiekty car1 itd
        System.out.println("Naprawiam samochód");
        car.broken = false;
        System.out.println("Samochód Naprawiony");
    }
}
