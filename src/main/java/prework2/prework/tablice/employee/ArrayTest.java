package prework2.prework.tablice.employee;

public class ArrayTest {
    public static void main(String[] args) {
        int x1 = 5;
        int x2 = 10;
        int x3 = 15;

        int[] array = new int[3];// tablica ma rozmiar 3 ale ostatni index to 2 bo liczymy od 0, czyli 0, 1, 2
        array[0] = 5;
        array[1] = 10;
        array[2] = 15;
        System.out.println(array[0]);

        String[] names = new String[5];
        names[0] = "Ania";
        System.out.println(names[0]);

//        Jeżeli znamy wartosci możemy tak utworzyć tablicę
        ArrayUtils arrayUtils = new ArrayUtils();
        int[] array2 = {5, 10, 15};// z tego zapisu korzystamy wtedy kiedy znamy wszystkie wartosci tablicy
        array2[0] = 100; // nadpisywanie danych w tablicy
//        System.out.println(array2[0]);
//        System.out.println(array2[1]);
//        System.out.println(array2[2]);

        arrayUtils.printArray(array2);

        // automatyzacja wyświetlania danych ztablicy w klasie ArrayUtils


    }
}
