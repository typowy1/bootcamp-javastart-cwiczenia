package cwiczenia.lekcja6.quiz;

import java.util.Scanner;

public class MathQuiz {
    private Scanner scanner = new Scanner(System.in);

    void attempt() {
        int result = 0;
        if (question1()) {
            System.out.println("Odpowiedź poprawna");
            result++;
        } else {
            System.out.println("Błędna odpowiedź, poprawna to: " + 15);
        }
        if (question2()) {
            System.out.println("Odpowiedź poprawna");
            result++;
        } else {
            System.out.println("Błędna odpowiedź, poprawna to: " + 144);
        }
        if (question3()) {
            System.out.println("Odpowiedź poprawna");
            result++;
        } else {
            System.out.println("Błędna odpowiedź, poprawna to: " + 123);
        }
        System.out.println("Twój wynik: " + result + "/" + 3); // czyli jeśli da poprawną odpowiedź
        // to po przez inkrementacje ++ to result zostanie zwiększony o 1 i tak w każdej odpowiedzi, jeżeli da
        // błądną to do result nie zostanie zwiększony o 1 i będzie 0
    }

    private boolean question1() {
        System.out.println("Jaki jest wynik mnożenia 3 * 5");
        int answer = scanner.nextInt();
        return answer == 15;
    }

    private boolean question2() {
        System.out.println("Jaki jest pole kwadratu o boku 12");
        int answer = scanner.nextInt();
        return answer == 144;
    }

    private boolean question3() {
        System.out.println("Jaki jest pierwiastek kwadratowy z liczby 15129");
        int answer = scanner.nextInt();
        return answer == 123;
    }
}
