package cwiczenia.lekcja3.calculator;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator1 calculator1 = new Calculator1();
//        tu wystarczy 1 obiekt żeby wywołać metody z calculator kilka razy

        double multiplyResult = calculator1.multiply(3.5, 5.5, 7.8);
        System.out.println("Wynik mnożenia: " + multiplyResult);

        calculator1.subtractAndShow(8, 5);
    }
}
