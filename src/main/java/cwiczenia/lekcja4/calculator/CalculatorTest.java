package cwiczenia.lekcja4.calculator;

public class CalculatorTest {
    public static void main(String[] args) {
        ComplexCalculator complexCalculator = new ComplexCalculator();
        double sum = complexCalculator.add(4.5, 5.8);
        System.out.println("Sum: " + sum);
        String addingInscription = complexCalculator.add("Rafał", "jest tu.");
        complexCalculator.schow(sum, addingInscription);
    }
}
