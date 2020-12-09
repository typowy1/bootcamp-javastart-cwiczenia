package prework2.prework.static_slowo;

public class Calculator {
    // jeżeli w programie są metody które nie operóją na stanie obiektu czyli czyli nie operują na żadnych polach.
    //to można je oznaczyć jako statyczne, warto też stosować STALE.
    //jak poniżej

    static final double PI = 3.141592;

    static double circleArea(double r) {
        return PI * r * r;
    }

    static double circlePerimeter(double r) {
        return 2 * PI * r;
    }
}
