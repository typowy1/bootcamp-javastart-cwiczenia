package cwiczenia.lekcja7.czytablicajestpalindrom;

import java.lang.reflect.Array;
import java.util.Arrays;

public class PalindromMain {
    public static void main(String[] args) {
        int[] palindrom = {1, 2, 3, 5, 3, 2, 1};
        int[] notPalindrom = {1, 2, 3, 5, 4, 2, 1};

        Palinfrom check = new Palinfrom();
        boolean isPalindrom1 = check.isPalindrom(palindrom);
        if (isPalindrom1) {
            System.out.println("Tablica " + Arrays.toString(palindrom) + " jest palindromem");
        }

        System.out.println();
        boolean isPalindrom2 = check.isPalindrom(notPalindrom);
        if (isPalindrom2) {
            System.out.println("Tablica " + Arrays.toString(notPalindrom) + " jest palindromem");
        }
    }
}
