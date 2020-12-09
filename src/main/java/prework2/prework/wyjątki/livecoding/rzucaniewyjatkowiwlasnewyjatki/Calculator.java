package prework2.prework.wyjątki.livecoding.rzucaniewyjatkowiwlasnewyjatki;

public class Calculator {
    // wyjątki możemy rzucać samodzielnie za pomocą throw, rzucanie wyjątku polega na utworzeniu obiektu wyjątku,
    // wyjątek rzucony z metody może zostac przechwycony za pomocą try catch

    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Nie dziel przez 0!"); // tworzymy obiekt wyjątku żeby potem go przechwycić i
            // poinformować użytkownika że coś jest nie tak
        } else {
            return a / b;
        }
    }
}
