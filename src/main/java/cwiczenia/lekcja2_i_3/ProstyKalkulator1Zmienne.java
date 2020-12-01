package cwiczenia.lekcja2_i_3;

public class ProstyKalkulator1Zmienne {
    public static void main(String[] args) {
        double x = 12;
        double y = 5.5;

        double sum = x + y;
        double subtraction = x - y;
        double multiplication = x * y;
        double division = x / y;

        System.out.println("Kalkulator:");
        System.out.println(x + " + " + y + " = " + sum);
        System.out.println(x + " - " + y + " = " + subtraction);
        System.out.println(x + " * " + y + " = " + multiplication);
        System.out.println(x + " / " + y + " = " + division);

    }
}
