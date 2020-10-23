package prework.petla_for_for_each;

import java.util.Arrays;
import java.util.Scanner;

public class Loop {

    public static void main(String[] args) {

        // znamy liczbe iteracji, znamy liczbe powtórzeń

        // wyswietlamy liczby od 1 do 10


//        for (int i = 1; i <= 10; i++) {
//            System.out.println(i);
//        }

        // wyświetlanie co drugiej liczby w pętli, co 3 to damy +=3 itd
//        for (int i = 1; i <= 10; i += 2) {
//            System.out.println(i);
//        }

        // pętlei tablice

        //    String[] names = {"Jan", "Kasia", "Basia"};

//        for (int i = 0; i < names.length; i++) { // dlaczego od 0 bo w tablicach index zaczyna się od 0, tu z pominięciem
//            // 3 dlatego że 3trzeci indeks w tablicy to bedzie 2
//            System.out.println(names[i]);

//        }
        //for each
//        for (String name : names) {// tu taki sam tym zmiennej jak tablicy
//            System.out.println(name);
//        }

        //  uzupełnianie tablic

//        int[] numbers = new int[5];
//        Scanner scanner = new Scanner(System.in);
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.println("Podaj liczbę " + (i + 1)); // wyświetli żeby podać ilczbę pierwszą druga itd
//            numbers[i] = scanner.nextInt();
//        }
//        System.out.println(Arrays.toString(numbers));// metoda wyświetli wszystkie wartości w jednym wierszu

        // oblicz sumę wszystkich liczb parzystych zapisanych w tablicy liczb całkowitych, nieparzyste wystarczy dodać !
//        przed warunkiem

        int[] tab = {4, 7, 9, 12, 15, 16};
        int sum = 0;

        for (int i = 0; i < tab.length; i++) {
            if (tab[i] % 2 == 0) {
                sum += tab[i];
                System.out.println("Liczby parzyste: " + tab[i]);
            }
        }
        System.out.println("Suma parzystych z tablicy to: " + sum);
    }
}
