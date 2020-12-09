package prework2.prework.wyjątki.livecoding.rzucaniewyjatkowiwlasnewyjatki;

public class Car {
    //rzucanie wyjątków z konstruktorów i metod

    private String name;
    private int fuel;
    private int speed;
    private int tankCapacity;
    private static final int SPEED_LIMIT = 250;
    private static final int SPEED_CHANGE = 10;// przyspieszamy o wartosc 10

    public Car(String name, int fuel, int speed, int tankCapacity) {
        checkPreconditions(fuel, speed, tankCapacity);// metoda rzuca wyjatki, zwraca je dla pól
        this.name = name;
        this.fuel = fuel;
        this.speed = speed;
        this.tankCapacity = tankCapacity;
    }

    private void checkPreconditions(int fuel, int speed, int tankCapacity) {
        if (fuel < 0) {
            throw new IllegalArgumentException("Ilość paliwa musi być większa od 0");
        } else if (speed < 0 || speed > SPEED_LIMIT) {
            throw new IllegalArgumentException("Prędkość musi być większa od 0 ale mniejsza od 250)");
        } else if (tankCapacity < 0) {
            throw new IllegalArgumentException("Pojemność baku musi być większa od 0");
        }// nie da się zwrócić 3 wyjątków na raz
    }

    void refuel(int amount) throws TankCapacityExceededException { // tankowanie, trows deklaruje wyjątek
        if (fuel + amount > tankCapacity) { // nie możemy zatankować więcej niz pomieści baku
            //  throw new IllegalArgumentException("Przekroczono pojemnosć baku");
            throw new TankCapacityExceededException(tankCapacity, fuel + amount); // wyjątek deklarowany stworzony przez
            // nas i trzeba ożnaczyć go w sygnaturze metody
        }
        fuel += amount;
    }

    void increaseSpeed() { //zwiększanie prędkości
        if (speed + SPEED_CHANGE > SPEED_LIMIT) { // nie możemy jechac więcej niz ustawiony limit
            // throw new IllegalArgumentException("Przekroczono limit prędkosci");
            throw new SpeedExceededException(); // nasz stworzony wyjątek z klasy SpeedExceededException
        }
        speed += SPEED_CHANGE;
    }

    void decreaseSpeed() { // zmniejszanie prędkosci
        if (speed - SPEED_CHANGE < 0) {
            speed = 0; // speed = 0 jeżeli wartosć będzie mniejsza od 0, tu nie ma potrzeby rzucania wyjątku poprostu
            // przwidujemy to i ustwaimy prędkość na 0
        } else {
            speed -= SPEED_CHANGE;
        }
    }

    @Override
    public String toString() {
        return "name " + name + ", fuel=" + fuel + ", speed=" + speed + ", tankCapacity=" + tankCapacity;
    }
}
