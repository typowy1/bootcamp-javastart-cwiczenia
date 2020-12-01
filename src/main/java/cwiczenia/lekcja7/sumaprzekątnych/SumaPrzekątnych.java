package cwiczenia.lekcja7.sumaprzekątnych;

public class SumaPrzekątnych {

    public static void main(String[] args) {
        //pierwsze rozwiązanie nie koniecznie, w tablicy są uzyte liczby do kwadratu
//        int[][] array = {
//                {0, 1, 4, 9, 16, 25, 36, 49, 64, 81, 100},
//                {1, 4, 9 ,16, 25, 36, 49, 64, 81, 100, 121},
//                {4, 9, 16, 25, 36, 49, 64, 81, 100, 121, 144},
//                {9, 16, 25, 36, 49, 64, 81, 100, 121, 144, 169},
//                {16, 25, 36, 49, 64, 81, 100, 121, 144, 169, 196},
//                {25, 36, 49, 64, 81, 100, 121, 144, 169, 196, 225},
//                {36, 49, 64, 81, 100, 121, 144, 169, 196, 225, 256},
//                {49, 64, 81, 100, 121, 144, 169, 196, 225, 256, 289},
//                {64, 81, 100, 121, 144, 169, 196, 225, 256, 289, 324},
//                {81, 100, 121, 144, 169, 196, 225, 256, 289, 324, 361},
//                {100, 121, 144, 169, 196, 225, 256, 289, 324, 361, 400}
//        };
//
//        int sum1 = array[0][0] + array[1][1] + array[2][2] + array[3][3] + array[4][4] + array[5][5] + array[6][6]
//                + array[7][7] + array[8][8] + array[9][9] + array[10][10];
//
//        System.out.println("Sum" + sum1);

        ArrayUtils utils = new ArrayUtils();
        int[][] array = utils.createArray(11);
        utils.printArray(array);
        int diagonal1 = utils.diagonal1(array);
        int diagonao2 = utils.diagonal2(array);


        System.out.println("Suma 1 przekątnej: " + diagonal1);
        System.out.println("Suma 2 przekątnej: " + diagonao2);
        System.out.println("Suma przekątnych: " + (diagonao2 + diagonal1));
    }

}
