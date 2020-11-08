package prework.wyjątki.livecoding.rzucaniewyjatkowiwlasnewyjatki;

public class TankCapacityExceededException extends Exception { // definiowanie wyjątku kontrolowanego, będzie trzeba je
    // jawnie obsłużyć jeśli tego nie zrobimy to będziemy mieli błąd kompilacji
    public TankCapacityExceededException(int maxCapacity, int exceededCapacity) {// konstruktor
        super("Tank capacity exceeded maxCapacity= " + maxCapacity + " exceeded by " + (exceededCapacity - maxCapacity));
    }
// wyjątek przepełnienie baku
}
