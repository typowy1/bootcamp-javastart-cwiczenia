package prework.klasyabstrakcyjne_i_interfejsy.przykladzfimu.klasyabstrakcyjne;

public abstract class Vehicle {
    private int speed;

//    public Vehicle(int speed) {
//        this.speed = speed;
//    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public abstract void speedUp(); //w klasie abstrakcyjnej możemy definiować metody abstrakcyjnebez ciała, taki szablon
    // dla klas dziedziczących
// nie możemy tworzyć obiektów typu klasy abstrakcyjnej
    //klasy abstrakcyjne służ ado definiowania klas bazowych po których będziemy dziedziczyli, najczęsciej są wykożystywane
    // do definiowania typów zmiennej lub do definiowania tablicy
}

