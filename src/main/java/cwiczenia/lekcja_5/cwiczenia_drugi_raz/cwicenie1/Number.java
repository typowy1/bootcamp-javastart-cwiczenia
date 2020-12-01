package cwiczenia.lekcja_5.cwiczenia_drugi_raz.cwicenie1;

public class Number {
    public static void main(String[] args) {
        int number = 9;

        System.out.println("Liczba " + number + " jest ");
        if (number % 2 == 0) {
            System.out.println("parzysta");
        } else {
            System.out.println("nieparzysta");
        }

        if (number > 0) {
            System.out.println("dodatnia");
        } else {
            System.out.println("ujemna");
        }

        int multi9 = number * 9;
        int squareNumber = number * number;
        if (multi9 % 6 == 0) {
            System.out.println(multi9 + " jest podzielna przez 6");
        } else if (squareNumber < 100) {
            System.out.println(squareNumber + " jest mniejsza niż 100");
        }
    }
}
