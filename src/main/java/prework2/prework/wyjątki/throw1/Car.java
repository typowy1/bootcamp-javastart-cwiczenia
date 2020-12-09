package prework2.prework.wyjątki.throw1;

public class Car {
    private static final double FUEL_CONSUMPTION = 8; //8l/100km
    private static final double MAX_FUEL = 50;
    private double fuel;

//    public void refuel(double additionalFuel) {
//        fuel += additionalFuel;
//    }
//
//    public void drive() {
//        fuel -= FUEL_CONSUMPTION;
//    }
//
//    @Override
//    public String toString() {
//        return "Stan paliwa: " + fuel;
//    }

//    metody drive i refule mozna napisać tak

//    public void refuel(double additionalFuel) {
//        if (fuel + additionalFuel > MAX_FUEL)
//            System.out.println("Nie możesz zatankować tyle paliwa. Zmieści się jeszcze maxymalnie " + (MAX_FUEL - fuel));
//        else
//            fuel += additionalFuel;
//    }
//
//    public void drive() {
//        if(fuel - FUEL_CONSUMPTION < 0)
//            System.out.println("Masz za mało paliwa na podróż, zatankuj.");
//        else
//            fuel -= FUEL_CONSUMPTION;
//    }

//    Wyjątki to w rzeczywistości obiekty, które rzucamy przy pomocy instrukcji throw. Działa to podobnie do zwracania o
//    biektu poprzez instrukcję return jako wynik metody. Różnica polega na tym, że obiekt wyjątku możemy później złapać
//    w bloku try-catch, a wartość zwróconą przez return przypisać np. do zmiennej

    void refuel(double additionalFuel) {
        if (fuel + additionalFuel > MAX_FUEL)
            throw new IllegalArgumentException("Nie możesz zatankować tyle paliwa. Zmieści się jeszcze maxymalnie " + (MAX_FUEL - fuel));
        else
            fuel += additionalFuel;
    }

    void drive() {
        if (fuel - FUEL_CONSUMPTION < 0)
            throw new IllegalStateException("Masz za mało paliwa na podróż, zatankuj.");
        else
            fuel -= FUEL_CONSUMPTION;
    }

    @Override
    public String toString() {
        return "Stan paliwa: " + fuel;
    }

//    java runTimeExeptions tam szukać wyjątków których możemy użyć w aplikacji
}
