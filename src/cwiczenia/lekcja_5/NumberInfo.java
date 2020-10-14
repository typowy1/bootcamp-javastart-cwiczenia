package cwiczenia.lekcja_5;

public class NumberInfo {
    public static void main(String[] args) {
        int number = -9;

        System.out.println("Liczba " + number + " jest:");
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
        if (multi9 % 6 == 0) {//jeżeli chcemy sprawdzić czy liczba jest podzielna przez inną liczbe
//            // to wynik modulo musi być 0, czyli a % 6 == 0 i jesli reszta z dzielenia będzie 0 to jest podzielna
            System.out.println(number + " jest podzielna przez 6");
        } else if (squareNumber < 100) {
            System.out.println(squareNumber + " jest mniejsza od 100");
        }


//        int number = 2;

//        System.out.println("Liczba " + number + " jest: ");
//        if(number % 2 == 0){
//            System.out.println("parzysta");
//        }else {
//            System.out.println("nieparzysta");
//        }
//
//        if (number > 0){
//            System.out.println("dodatnia");
//        }else {
//            System.out.println("ujemna");
//        }
//
//        int result = number * 9;
//        int squareNumber = number * number;
//        if (result % 6 == 0) {// jeżeli chcemy sprawdzić czy liczba jest podzielna przez inną liczbe
//            // to wynik modulo musi być 0, czyli a % 6 == 0 i jesli reszta z dzielenia będzie 0 to jest
//            System.out.println(result + " jest podzielna przez 6");
//        }else if (squareNumber < 100){
//            System.out.println(squareNumber + " jest mniejszy od 100");
//        }
    }
}
