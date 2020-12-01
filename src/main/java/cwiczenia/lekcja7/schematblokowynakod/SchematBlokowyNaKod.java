package cwiczenia.lekcja7.schematblokowynakod;

import java.util.Scanner;

public class SchematBlokowyNaKod {
    public static void main(String[] args) {
        int x = 0;
        int sum = 0;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Podaj liczbę:");
            x = scanner.nextInt();
            if (Math.pow(x, 2) < 100) {
                sum += x;
            }

        } while (Math.pow(x, 2) < 100);

        sum = sum % 2;
        System.out.println(sum);
    }
}
