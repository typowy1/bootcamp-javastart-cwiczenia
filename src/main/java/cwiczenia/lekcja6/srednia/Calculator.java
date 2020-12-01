package cwiczenia.lekcja6.srednia;

import java.util.Scanner;

public class Calculator {

//    double greatest(double firstNumber, double secondNumber, double thirdNumber) {
//        return Math.max(firstNumber, Math.max(secondNumber, thirdNumber));
//    }

    //lub można to zrobić z if

    double greatest(double firstNumber, double secondNumber, double thirdNumber) {
        if (firstNumber >= secondNumber && firstNumber >= thirdNumber) {
            return firstNumber;
        } else if (secondNumber >= firstNumber && secondNumber >= thirdNumber) {
            return secondNumber;
        } else
            return thirdNumber;
    }

    //    double least(double firstNumber, double secondNumber, double thirdNumber) {
//        return Math.min(firstNumber, Math.min(secondNumber, thirdNumber));
//    }
    //lub można to zrobić z if
    double least(double firstNumber, double secondNumber, double thirdNumber) {
        if (firstNumber <= secondNumber && firstNumber <= thirdNumber) {
            return firstNumber;
        } else if (secondNumber <= firstNumber && secondNumber <= thirdNumber) {
            return secondNumber;
        } else
            return thirdNumber;
    }

    double avg(double firstNumber, double secondNumber, double thirdNumber) {
        return (firstNumber + secondNumber + thirdNumber) / 3;
    }

    Numbers numbersCreator() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę:");
        double firstNumber = scanner.nextInt();
        System.out.println("Podaj drugą liczbę:");
        double secondNumber = scanner.nextInt();
        System.out.println("Podaj trzecią liczbę:");
        double thirdNumber = scanner.nextInt();

        Numbers number = new Numbers(firstNumber, secondNumber, thirdNumber);
        return number;
    }
}