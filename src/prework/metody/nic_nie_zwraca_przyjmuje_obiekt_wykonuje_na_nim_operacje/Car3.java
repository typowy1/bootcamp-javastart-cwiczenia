package prework.metody.nic_nie_zwraca_przyjmuje_obiekt_wykonuje_na_nim_operacje;

public class Car3 {
    String name;
    boolean lights;
    Engine3 engine;
    int fuel;
    boolean broken; //fals nie jest zepsuty, true jest zepsuty

    Car3(String n, boolean l, Engine3 e, int f) { //tworzymy konstruktor parametrowy
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
