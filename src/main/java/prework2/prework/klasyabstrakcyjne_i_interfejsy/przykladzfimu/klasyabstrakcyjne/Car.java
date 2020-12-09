package prework2.prework.klasyabstrakcyjne_i_interfejsy.przykladzfimu.klasyabstrakcyjne;

public class Car extends Vehicle {
    @Override
    public void speedUp() {
        setSpeed(getSpeed() + 5);
    }
//    public void speedUp(){
//        setSpeed(getSpeed() + 5);
//    }
}
