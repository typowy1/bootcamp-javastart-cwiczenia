package prework2.prework.metody.zwracajace_obiekty;

public class Car5 {
    String name;
    boolean lights;
    Engine5 engine;
    int fuel;
    boolean broken; //fals nie jest zepsuty, true jest zepsuty

    Car5(String n, boolean l, Engine5 e, int f, boolean b) { //tworzymy konstruktor parametrowy
        name = n;
        lights = l;
        engine = e;
        fuel = f;
        broken = b;
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
