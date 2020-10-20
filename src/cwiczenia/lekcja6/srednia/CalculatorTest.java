package cwiczenia.lekcja6.srednia;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Numbers number1 = calculator.numbersCreator();
        double avg = calculator.avg(number1.getNumberA(), number1.getNumberB(), number1.getNumberC());
        double max = calculator.greatest(number1.getNumberA(), number1.getNumberB(), number1.getNumberC());
        double min = calculator.least(number1.getNumberA(), number1.getNumberB(), number1.getNumberC());
        System.out.println("Max: " + max + " Min: " + min + " Avg: " + avg);

    }

}
