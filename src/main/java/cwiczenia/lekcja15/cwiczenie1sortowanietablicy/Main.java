package cwiczenia.lekcja15.cwiczenie1sortowanietablicy;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try {
            int[] ints = readFile("plik.txt");
            //ablicę posortowaną w kolejności rosnącej
            Arrays.sort(ints);
            System.out.println(Arrays.toString(ints)); // zamienia tablice na stringa
            System.out.println(ints.length); //ilosć liczb

//            najmniejszą liczbę
//            największą liczbę
            System.out.println("Min " + ints[0]);
            System.out.println("Max " + ints[ints.length - 1]); // windeksie dajemy wielkosc tablicy -1

            //indeks pierwszego wystąpienia liczby 15 w posortowanej tablicy
            int i = Arrays.binarySearch(ints, 15);
            System.out.println("Pierwszy indeks liczby 15 to: " + i);


        } catch (FileNotFoundException exception) {
            System.err.println("Nie udało się odczytać pliku");
        }
    }

    // zebrała liczyb z takiego pliku 24 25 0 28 6 8 15 29 6 8 6 0 15 6 5 22 21 1 16 11 12 2 24 6 2 14 9 16 14 28
    static int[] readFile(String fileName) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(fileName));
        int[] array = new int[30];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt(); // nie musimy dawac metody has int poniewaz wiemy ze liczb jest 30
        }
        return array;
    }
}
