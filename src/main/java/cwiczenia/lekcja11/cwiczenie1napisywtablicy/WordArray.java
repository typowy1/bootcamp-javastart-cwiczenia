package cwiczenia.lekcja11.cwiczenie1napisywtablicy;

import java.util.InputMismatchException;
import java.util.Scanner;

public class WordArray {
    public static void main(String[] args) {

        String name = "rr";
        Scanner scanner = new Scanner(System.in);

        String[] array = new String[3];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Podaj kolejny napis");
            array[i] = scanner.nextLine();
        }

        System.out.println("Podaj index");
        try {
            int index = scanner.nextInt();
            //   if(index >= 0 && index < array.length)// w tym wypadku to będzie lepsze od catch (ArrayIndexOutOfBoundsException e){
            System.out.println(array[index]);
            //    else System.err.println("Indeks zbt duży lub ujemny");
        } catch (InputMismatchException ex) {
            System.err.println("Musisz podac liczbę");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Indeks zbt duży lub ujemny");
        }

        // jeżeli mamy możliwosć to lepiej wybrac standardowy if else do sterowania przebuiegiem programu niz łapać wyjątki
    }
}
