package prework2.prework.klasywewnetrzneizagniezdzone;

public class CarTest {
    public static void main(String[] args) throws InterruptedException {
        Car car = new Car();
        car.refuel(40);
        car.go();
        Car.Engine engine = new Car().new Engine("Ferrari");//instancja klasy engine
    }

}
