package cwiczenia.lekcja7.sumaprzekątnych;

public class ArrayUtils {

    int[][] createArray(int size) {
        int[][] array = new int[size][size];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) Math.pow((i + j), 2);
            }
        }
        return array;
    }

    void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println(array[i][j] + "\t"); //\t znak tabulatora
            }
            System.out.println();
        }
    }

    int diagonal1(int[][] array) {
        int diagonao1 = 0; //przekątna1
        for (int i = 0; i < array.length; i++) {
            diagonao1 += array[i][i];
        }
        return diagonao1;
    }

    int diagonal2(int[][] array) {
        int diagonao2 = 0; //przekątna2
        for (int i = 0; i < array.length; i++) {
            diagonao2 += array[i][array.length - 1 - i];
        }
        return diagonao2;
    }
}
