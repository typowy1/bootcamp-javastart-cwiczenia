package prework.scanner;

import java.util.Locale;
import java.util.Scanner;

public class TwoNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);
        ; // to zapewni nam wpisywanie liczb z kropką zamiast przecinka,
        // jeśli chcemy przecinek to ustawiamy dowolny kraj europejski. crtl + spacja podpowie wybór wartości

        System.out.println("Podaj A: ");
        double a = input.nextDouble();
        System.out.println("Pofaj B: ");
        double b = input.nextDouble();

        input.close();
        System.out.println("A + B = " + (a + b));
    }
}
