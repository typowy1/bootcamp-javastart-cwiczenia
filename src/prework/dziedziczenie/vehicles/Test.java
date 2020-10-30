package prework.dziedziczenie.vehicles;

public class Test {
    public static void main(String[] args) {
        Car car = new Car();
        car.setFuel(50); // możemy odwołać się do pól z klas nadżednych Car
        car.setEngine(new Engine(120, "Disel"));


        car.printInfo();
    }
}
