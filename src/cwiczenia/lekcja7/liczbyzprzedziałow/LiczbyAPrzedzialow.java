package cwiczenia.lekcja7.liczbyzprzedziałow;

import javax.crypto.spec.PSource;
import java.util.Scanner;

public class LiczbyAPrzedzialow {
    public static void main(String[] args) {

        //wyświetlanie liczby z przedziału
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wyświetl liczby z przedziału [-100, 100]");
        int inputNumber = scanner.nextInt();
        if (inputNumber >= 0 && inputNumber <= 100) {
            for (int i = inputNumber; i <= 100; i++) {
                System.out.print(i + " ");
            }
        } else if (inputNumber < 0 && inputNumber >= -100) {
            for (int i = -100; i <= inputNumber; i++) {
                System.out.print(i + " ");
            }
        } else {
            System.out.println("Błedna wartosć z poza przedział [-100, 100]");
        }
    }
}
