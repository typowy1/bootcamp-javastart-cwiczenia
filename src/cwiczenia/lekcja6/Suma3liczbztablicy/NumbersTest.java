package cwiczenia.lekcja6.Suma3liczbztablicy;

import java.util.Scanner;

public class NumbersTest {
    public static void main(String[] args) {
        double[] numbers = new double[3];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę");
        numbers[0] = scanner.nextDouble();
        System.out.println("Podaj drugą liczbę");
        numbers[1] = scanner.nextDouble();
        System.out.println("Podaj trzecią liczbę");
        numbers[2] = scanner.nextDouble();

        double sum = numbers[0] + numbers[1] + numbers[2];

        System.out.printf("%.2f + %.2f + %.2f = %.2f", numbers[0], numbers[1], numbers[2], sum);
        // możemy podać dwa miejsca po przecinku za pomocą printf, % -
        // argument.2f = dwa miejsca po przecinku
    }
}
