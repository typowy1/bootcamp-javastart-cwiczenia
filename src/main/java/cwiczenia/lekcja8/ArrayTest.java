package cwiczenia.lekcja8;

import java.util.Arrays;

public class ArrayTest {

    public static void main(String[] args) {
        int[] source = {1, 2, 3, 4, 5};
        int[] reversed = ArrayUtils.reverse(source);
        // oderotność tablicy
        System.out.println(Arrays.toString(source));
        System.out.println(Arrays.toString(reversed));

//        losowa tablica
        int[] generated = ArrayUtils.generateRandomArray(20, 20);
        System.out.println(Arrays.toString(generated));
        System.out.println(generated.length);

        // liczba wystąpień
        int count5 = ArrayUtils.count(generated, 5);// zliczamy ile razy powtarza się piątka w tablicy
        System.out.println(count5);
    }

}
