package cwiczenia.lekcja3.calculator;

public class Calculator1 {

    //    Rozwiązanie z kursu
    double multiply(double a, double b, double c) {
        double multi = a * b * c;
        return multi;
    }

    void subtractAndShow(int a, int b) { //void oznacza pustke
        int sub = subtract(a, b);
        System.out.println("Wynik odejmowania: " + sub);
    }

    int subtract(int a, int b) {
        int sub = a - b;
        return sub;
    }

}
