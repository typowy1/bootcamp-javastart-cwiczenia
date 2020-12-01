package cwiczenia.lekcja11.cwiczenie2suma5liczb;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumbersSum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int sum = 0; // suma
        int counter = 0; // ile poprawnych liczb wprowadził uzytkownik

        while (counter < 5) { //do póki counter jest mniejszy od pięciu to będziemy powtarzali ta petle
            System.out.println("Podaj liczbę: " + counter);
            try {
                int next = scanner.nextInt();
                sum += next;
                counter++;
            } catch (InputMismatchException ex) {
                System.err.println("Nie podałeś liczby");
            } finally {
                scanner.nextLine();
            }
        }
        System.out.println("Sum " + sum);
    }
}
