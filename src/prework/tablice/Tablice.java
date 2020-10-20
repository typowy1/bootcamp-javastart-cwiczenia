package prework.tablice;

public class Tablice {
    public static void main(String[] args) {

        //  w Javie jest obiektem, to deklaracja i inicjalizacja jest bardzo podobna do roienia tego jak przy obiektach
        int[] numbers = new int[10]; // int[] deklarujemy tablice typu int,i nadajemy jej nazwę numbers,
        // po czym przypisujemy do niej obiekt reprezentujący tablicę liczb całkowitych, w której można zapisać 10 liczb.
        String[] names = new String[10];

        //W deklaracji możemy również użyć nawiasów kwadratowych przy nazwie zmiennej:
        //int numbers1[] = new int[10]; częściej wykożystuje się int[]
        //tablice zaraz po utworzeniu wypełnione są wartościami domyślnymi, więc przykładowo powyższe t
        // ablice przechowują odpowiednio 10 zer oraz 10 wartości null.
        //numbers i names są referencjami wskazującymi na obiekty reprezentujące tablice.

        // tablica z zainicjalizowanymi wartościami
        String[] names2 = {"Jan", "Kasia", "Basoia"};
        int[] numbers2 = {1, 2, 3, 4, 5};
        // lub tak
        int[] numbers3 = new int[5];
        numbers3[0] = 1;
        numbers3[1] = 5;
        numbers3[2] = 10;
        numbers3[3] = 15;
        numbers3[4] = 20;
        // wyswietlanie wartonsci z tablicy, indeksy tablicy liczone są od 0
        //statni indeks tablicy to zawsze jej rozmiar pomniejszony o 1
        System.out.println(numbers3[0]);
        System.out.println(numbers3[1]);
        System.out.println(numbers3[2]);
        System.out.println(numbers3[3]);
        System.out.println(numbers3[4]);

    }

}
