package cwiczenia.lekcja8;

import java.util.Random;

public class ArrayUtils {
//    https://bootcamp.javastart.pl/konto/cwiczenie/1002

    //Metoda, która przyjmuje jako argument tablicę liczb całkowitych i zwraca tablicę o takim samym rozmiarze,
    // ale elementami ułożonymi w odwrotnej kolejności
    static int[] reverse(int[] source) {
        int[] result = new int[source.length];

        for (int i = 0; i < source.length; i++) {
            result[i] = source[source.length - 1 - i]; //zmniejsza
        }
        return result;
    }

//    Metoda, która przyjmuje rozmiar tablicy i górny limit dla losowanych liczb, a zwraca w wyniku tablicę liczb
//    z zakresu od 0 do podanego limitu.

    static int[] generateRandomArray(int size, int upperLimit) {
        int[] array = new int[size];
        Random random = new Random(); // losowanie liczb
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(upperLimit); // zwróci losowa liczbe od zero do limitu
        }
        return array;
    }

//    Metoda, która przyjmuje jako argument tablicę liczb całkowitych oraz dowolną liczbę, a zwraca liczbę wystąpień
//    tej liczby w zadanej tablicy.

    static int count(int[] array, int number) {
        int counter = 0;
        for (int element : array) { // iterujemy przez całą tablice
            if (element == number) {
                counter++;
            }
        }
        return counter;
    }

}
