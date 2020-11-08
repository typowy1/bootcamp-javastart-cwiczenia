package cwiczenia.lekcja10.zadanie3;

public class Car extends Vehicle {

    private int seats;

    public Car(String name, int year, int seats) {
        super(name, year);
        this.seats = seats;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public String toString() {
        return "Samochód " + getName() + ", jedzie w kierunku " + getDirection();
    }
}
