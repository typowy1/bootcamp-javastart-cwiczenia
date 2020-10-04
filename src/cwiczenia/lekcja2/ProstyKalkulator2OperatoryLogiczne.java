package cwiczenia.lekcja2;

public class ProstyKalkulator2OperatoryLogiczne {

    public static void main(String[] args) {
        double x = 12;
        double y = 5.5;

        double sum = x + y;
        double subtraction = x - y;
        double multiplication = x * y;
        double division = x / y;

        boolean xBiggerThan0 = (x > 0);
        double moduloSum = sum % 2; // średnia z dzielenia
        boolean even = moduloSum == 0; // parzysta
        boolean xOrYBiggerThan100 = (x > 100 || y > 100);
        boolean xAndYBiggerThan100 = (x > 100 && y > 100);


        System.out.println("Kalkulator:");
        System.out.println(x + " + " + y + " = " + sum);
        System.out.println(x + " - " + y + " = " + subtraction);
        System.out.println(x + " * " + y + " = " + multiplication);
        System.out.println(x + " / " + y + " = " + division);
        System.out.println("Czy liczba a jest większa od 0? " + xBiggerThan0); // true
        System.out.println("Czy suma jest parzysta? " + even); // false
        System.out.println("Czy a lub b jest większe od 100? " + xOrYBiggerThan100);// false
        System.out.println("Czy a i b jest większe od 100 " + xAndYBiggerThan100);// false
    }
}
