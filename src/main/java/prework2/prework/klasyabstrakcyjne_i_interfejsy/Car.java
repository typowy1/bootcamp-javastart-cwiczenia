package prework2.prework.klasyabstrakcyjne_i_interfejsy;

public class Car extends Vehicle {
    @Override
    public void speedUp() {
        setSpeed(getSpeed() + 5);
    }
}
