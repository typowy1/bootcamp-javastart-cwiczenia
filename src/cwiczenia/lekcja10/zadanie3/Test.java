package cwiczenia.lekcja10.zadanie3;

public class Test {
    public static void main(String[] args) {
//        Car car1 = new Car("Audi", 2010, 5);
//        MotorBike motorBike =  new MotorBike("Yamaha", 2007, 200);
//
//        Moveable move1 = new Car("Audi", 2010, 5);
//        move1.turnLeft();
//        System.out.println(move1.toString());
//        move1.turnRight();
//        System.out.println(move1.toString());

        RenTable carToRent = new RentableCar("Audi", 2010, 5);
        carToRent.rent("Jan", "Kowalski", "ABC123");
        System.out.println(carToRent); // tu niejawnie jest wywoływana metoda toString z klasy RentableCar
        carToRent.handOver();
        if (carToRent.isRent()) {
            System.out.println("Nie mozna wypozyczyć samochodu, jest zajęty");
        } else {
            carToRent.rent("Mariola", "Kowalsk1", "ABC127");
        }

    }
}
