package cwiczenia.lekcja10.zadanie3;

public class MotorBike extends Vehicle {

    private int speedLimit;

    public MotorBike(String name, int year, int speedLimit) {
        super(name, year);
        this.speedLimit = speedLimit;
    }

    public int getSpeedLimit() {
        return speedLimit;
    }

    public void setSpeedLimit(int speedLimit) {
        this.speedLimit = speedLimit;
    }

}
