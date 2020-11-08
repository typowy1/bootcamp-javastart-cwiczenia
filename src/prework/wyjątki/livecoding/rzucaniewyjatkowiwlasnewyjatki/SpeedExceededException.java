package prework.wyjątki.livecoding.rzucaniewyjatkowiwlasnewyjatki;

public class SpeedExceededException extends RuntimeException { // wyjątek nie kontrolowany, taki którego nie trzeba obsługiwać
    public SpeedExceededException() { // konstruktor
        super("Speed limit exceeded");
    }

}
