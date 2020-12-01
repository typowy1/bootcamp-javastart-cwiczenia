package cwiczenia.lekcja13.zadani1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę");
        String string1 = scanner.nextLine();
        System.out.println("Podaj drugą liczbę");
        String string2 = scanner.nextLine();

        // przekształcanie na Inegery

        Integer integer1 = Integer.valueOf(string1);// to samo co int tylko w formie obiektow
        Integer integer2 = Integer.valueOf(string2);

        // przekształcanie Integer na int, czyli autounboxing
        int i1 = integer1;
        int i2 = integer2;

        System.out.println(integer1 + integer2); // autounboxing nie jawny
        System.out.println(i1 + i2);

        // jeśli chcemy porównać integer1 == integer2 to powinnismy uzyc equals bo integer to obiekt
        Integer integer3 = null; //do typu obakokwujacego mozemy null przypisac
    }
}

