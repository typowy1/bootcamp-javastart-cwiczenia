package cwiczenia.lekcja7.sumowanie_while;

import java.util.Arrays;
import java.util.Scanner;

public class SumowanieWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        1 rozwiązanie, to lepsze

        int i = 0;
        int sum = 0;

        while (i < 5) {
            System.out.println("Podaj liczbę: " + (i + 1));
            int userInput = scanner.nextInt();
            sum += userInput;
            i++;
        }
        System.out.println("Suma liczb to: " + sum);

//        2 rozwiązanie z tablicą

//        int[] tab = new int[5];
//        int i = 0;
//        int sum = 0;
//
//        while(i < tab.length){
//            System.out.println("Podaj liczbę " + (i + 1));
//            tab[i] = scanner.nextInt();
//            sum += tab[i];
//            i++;
//        }
//        System.out.println("Liczby z tablicy wpisane przez uzytkownika: " + Arrays.toString(tab));
//        //- to wyswietli nam liczby z tablicy
//        System.out.println("Suma liczb to: " + sum);
    }
}
