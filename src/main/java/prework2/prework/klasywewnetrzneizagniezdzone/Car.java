package prework2.prework.klasywewnetrzneizagniezdzone;

public class Car {

    //https://javastart.pl/kurs/java/java-podstawy-temat-25-klasy-wewn%C4%99trzne/lekcja/java-podstawy-klasy-wewnetrzne-i-zagniezdzone
    private Engine engine;
    private int fuel;

    public Car() {
        engine = new Engine("Ferrari");
        System.out.println("Utworzono samochód z silnikiem " + engine.engineType);
    }

    public void go() throws InterruptedException {
        while (fuel > 0) {
            engine.consumeFuel();
            System.out.println("Pozostało " + fuel + " litrów paliwa");
            Thread.sleep(1000);
        }
        System.out.println("Brak paliwa");
    }

    public void refuel(int liters) {
        fuel = fuel + liters;
    }

    public class Engine {

        private String engineType;
        private static final int FUEL_CONSUMPTION = 20;

        public Engine(String type) {
            engineType = type;
        }

        public void consumeFuel() {
            fuel = fuel - FUEL_CONSUMPTION;
        }

        //this słówko, do pola klasy wewnetrznej odnosimy sie this.fuel = 5;,
        // do pola klasy zewnetrznej odnosimy sie Car.this.fuel = 5;

//        class Car {
//            private int fuel;
//
//            private class Engine {
//                int fuel;
//
//                void consumeFuel() {
//                    // pole klasy wewnętrznej - Engine
//                    this.fuel = 5;
//
//                    // pole klasy otaczającej - Car
//                    Car.this.fuel = 5;
//                }
//            }
//        }
    }
//    Zacznijmy tym razem od dołu. W klasie Car zdefiniowaliśmy wewnętrzną publiczną klasę Engine. Publiczna oznacza w tym
//        momencie, że nie wykluczamy możliwości utworzenia jej obiektów poza klasą Car. W niej zdefiniowano pola prywatne
//    engineType (typ silnika) i stałą FUEL_CONSUMPTION (spalanie na 100km), do której przypisujemy wartość 20. W klasie
//    dostępny jest jeden konstruktor i metoda consumeFuel(), w której zmniejszamy stan paliwa, czyli zmienną prywatną klasy Car.
//    Jedną z zalet stworzenia klasy Engine wewnątrz klasy Car jest to, że mamy dostęp do wszystkich pól klasy opakowującej,
//    nawet jeśli nie udostępnia ona gettera.
}
