package prework2.prework.metody.nic_nie_zwraca_ale_modyfikuje_stan_obiektu;

public class Car {
    String name;
    boolean lights;
    Engine engine;
    int fuel;

    Car(String n, boolean l, Engine e, int f) { //tworzymy konstruktor parametrowy
        name = n;
        lights = l;
        engine = e;
        fuel = f;
    }

    // metoda do włączania swiateł
    void turnLightsOn() {
        lights = true;
    }

    // metoda do wyłączania swiateł
    void turnLightsOff() {
        lights = false;
    }

    // wyświetlanie informacji o samochodzie
    void showInfo() {
        System.out.println(name + " " + fuel + " " + lights); // odwołujemy się tylko do tego co widzimy na ekranie
    }

    //dotankowanie paliwa
    void refuel(int f) {
        fuel = fuel + f; // lub fuel += f;
    }
}
