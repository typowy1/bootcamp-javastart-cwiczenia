package cwiczenia.lekcja_5.cwiczenia_drugi_raz.cwicenie1;

import cwiczenia.lekcja_5.MonthConverter.MonthConverter3;

public class MonthConverterTest {
    public static void main(String[] args) {

        int number1 = 5;
        int number2 = 1;
        int number3 = 9;
        int number4 = -2;
        int number5 = 7;
        int number6 = 0;
        int number7 = -1;

        MonthConverter3 monthConverter = new MonthConverter3();
        System.out.println("Wybrany miesiąc to: " + monthConverter.convert(number1));
        System.out.println("Wybrany miesiąc to: " + monthConverter.convert(number2));
        System.out.println("Wybrany miesiąc to: " + monthConverter.convert(number3));
        System.out.println("Wybrany miesiąc to: " + monthConverter.convert(number4));
        System.out.println("Wybrany miesiąc to: " + monthConverter.convert(number5));
        System.out.println("Wybrany miesiąc to: " + monthConverter.convert(number6));
        System.out.println("Wybrany miesiąc to: " + monthConverter.convert(number7));

    }
}
