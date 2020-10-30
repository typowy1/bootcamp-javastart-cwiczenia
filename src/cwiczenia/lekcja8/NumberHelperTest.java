package cwiczenia.lekcja8;

import cwiczenia.lekcja_5.cwiczenia_drugi_raz.cwicenie1.zgadnij_liczbe.Number;

import java.util.Scanner;

public class NumberHelperTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę");
        int number = scanner.nextInt();
        int resul = NumberHelper.reverseNumber(number);
        System.out.println("Odwrotnością liczby " + number + " jest liczba: " + resul);
        System.out.println(NumberHelper.reverseNumber1(1234));
        System.out.println(NumberHelper.reverseWithString(1234));
    }
}
