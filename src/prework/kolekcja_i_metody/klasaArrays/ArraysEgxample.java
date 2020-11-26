package prework.kolekcja_i_metody.klasaArrays;

import java.util.Arrays;

public class ArraysEgxample {

    public static void main(String[] args) {

        String[] names = {"Basia", "Kasia", "Wojtek", "Agnieszka", "Kacper"};
        Integer[] numbers = {4, 7, 2, 1, 14, 23, 10, 5};

        System.out.println("Names: ");
        printArray(names);
        //lub
        System.out.println(Arrays.toString(names));

        System.out.println("Numbers: ");
        printArray(numbers);
        //lub
        System.out.println(Arrays.toString(names));
        System.out.println();

        //sortowanie // tu dobrze jest stwożyć kopie tablicy ponieważ elementy zmienią kolejnisć
        System.out.println("Arrays.sort(numbers): ");
        Arrays.sort(numbers);
        printArray(numbers);

        System.out.println("Arrays.sort(names): ");
        Arrays.sort(names);
        printArray(names);
        System.out.println();

        //copyOf
        System.out.println("Numbers2, Arrays.copyOf()");
        Integer[] numbers2 = Arrays.copyOf(numbers, numbers.length);
        printArray(numbers2);
        System.out.println();

        //equals
        System.out.println("Arrays.equals(numbers, numbers2): ");
        System.out.println(Arrays.equals(numbers, numbers2));
        System.out.println();

        //fill
        System.out.println("Arrays.fill()");
        String[] strings = new String[5];
        Arrays.fill(strings, "Wacek");
        printArray(strings);

        //    Istnieje jeszcze jedna metoda kopiująca elementy z jednej tablicy do drugiej, jednak znajduje się ona w klasie System.
//
//    Statyczna metoda System.arraycopy(Object src, int srcPos, Object dest, int destPos, int length) przyjmuje 5 parametrów:
//
//    tablicę źródłową (src),
//    indeks od którego chcemy skopiować elementy z tablicy źródłowej (srcPos),
//    tablicę, do której kopiujemy (dest),
//    indeks od którego mają być wstawiane skopiowane elementy w tablicy wynikowej (destPos),
//    ilość elementów do skopiowania (length).
//
//    W rzeczywistości metoda Arrays.copyOf() wykorzystuje metodę System.arraycopy() pod spodem.

        int[] numbers3 = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        int[] numbers4 = new int[numbers3.length];

        // do koppiowania elementów
        System.arraycopy(numbers3, 4, numbers4, 0, numbers3.length - 4); //9 3l3mentów w tablicy, po odjęciu 4 mamy pięc, indeksy liczymy od 0

        for (int num : numbers4) {
            System.out.print(num + " ");
        }
//        W ten prosty sposób do tablicy numbers4 skopiowaliśmy elementy z tablicy numbers3, zaczynając od indeksu 4 włącznie
//        i wstawiając je na miejsca od indeksu 0 w tablicy numbers2. Liczba skopiowanych elementów to number1.length-4.


    }

    public static <T> void printArray(T[] arr) {// generyczna metoda
        for (T t : arr) {
            System.out.print(t + " ");
        }
        System.out.println();
    }

//    Powyższy przykład pokazuje zastosowanie dwóch typów tablic - Integer[] i String[]. Używamy typu Integer[], a nie int[],
//    dzięki czemu mogliśmy przekazać ją jako argument generycznej metody printArray() wyświetlającej kolejne elementy
//    tablicy.
//
//    Metody klasy Arrays nie zwracają wyniku (są typu void), modyfikowana jest oryginalna tablica. Ponieważ jest to
//    operacja nieodwracalna, to lepiej zastanowić się przed wykorzystaniem którejkolwiek z zaprezentowanych funkcjonalności.

}
