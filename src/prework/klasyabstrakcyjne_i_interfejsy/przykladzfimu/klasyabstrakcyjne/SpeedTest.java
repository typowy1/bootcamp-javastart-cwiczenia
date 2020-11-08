package prework.klasyabstrakcyjne_i_interfejsy.przykladzfimu.klasyabstrakcyjne;

public class SpeedTest {
    public static void main(String[] args) {

        Vehicle car = new Car();
        Vehicle plane = new Plane();

        car.speedUp();
        plane.speedUp();

        System.out.println("Prędkosć samochodu " + car.getSpeed());
        System.out.println("Prędkosć samolotu " + plane.getSpeed());

    }
}
