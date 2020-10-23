package cwiczenia.lekcja7.czytablicajestpalindrom;

public class Palinfrom {
    //Palindrom to tablicza która czytan od początku jet taka sam jak czytana od końca

    boolean isPalindrom(int[] array) {
        int comparisons = array.length / 2;
        for (int i = 0; i < comparisons; i++) {
            if (array[i] != array[array.length - 1 - i])
                return false;
        }
        return true;
    }
}
