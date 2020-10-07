package cwiczenia.lekcja3.Car;

public class CarController {

    // zwiększamy moc silnika o 10% i tu trzeba pomnożyć o 110% czyli 1.1 - da nam wynik już zwiększony
    // o 10% czyli wcześniej było 100 a po będzie 110
    // tu musimy zrzutować do int dlatego że mnożymy przez 1.1 liczbe zmiennoprzecinkową,
    // częsć dziesiętna zostanie ucięta
    void turbo(Car car) { // w parametrach przekazujemy obiekt typu car, czyli np car1
        car.power = (int) (car.power * 1.1);
    }

    void increaseSpeed(Car car, int spee) {
//        currentSpeed = currentSpeed + spee;
        car.currentSpeed += spee;
    }

    void decreaseSpeed(Car car, int spee) {
        //   currentSpeed = currentSpeed - spee;
        car.currentSpeed -= spee;
    }
}
