package cwiczenia.lekcja4.calculator;

public class ComplexCalculator {

    String add(String firstInscription, String secondInscription) {
        String allInscription = firstInscription + " " + secondInscription;
        return allInscription;
    }

    double add(double firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }

    void schow(double sum, String addingInscription) {
        System.out.println("Sum: " + sum + ", Inscription: " + addingInscription);
    }
}
