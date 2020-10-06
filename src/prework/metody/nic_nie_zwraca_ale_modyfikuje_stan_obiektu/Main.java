package prework.metody.nic_nie_zwraca_ale_modyfikuje_stan_obiektu;

public class Main {
    public static void main(String[] args) {
        Engine engine1 = new Engine(200);
        Car car1 = new Car("Audi a4", false, engine1, 20); // światła wyłaczone
        //teraz chcemy włączyć swiatła
        car1.turnLightsOn();

        // wyświetlanie informacji o samochodzie
        car1.showInfo();

        // wyłaczamy światła
        car1.turnLightsOff();
        // wyświetlanie informacji o samochodzie
        car1.showInfo();

        // dotankowanie samochodu
        car1.refuel(30);

        car1.showInfo();

        System.out.println(">>>>>>>>");
        Engine engine2 = new Engine(300);// dajemy mocniejszy silnik
        Car car2 = new Car("BMW m3", true, engine2, 5);
        car2.refuel(25);// tankujemy dodatkowo
        car2.showInfo();
    }
}
