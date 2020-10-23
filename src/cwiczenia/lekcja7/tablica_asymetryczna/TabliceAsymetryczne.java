package cwiczenia.lekcja7.tablica_asymetryczna;

public class TabliceAsymetryczne {
    public static void main(String[] args) {
//        int[][] tab = new int[4][];
//        tab[0] = new int[3];
//        tab[1] = new int[2];
//        tab[2] = new int[4];
//        tab[3] = new int[1];

//        // 1 rozwiązanie
//        tab[0][0] = 1;
//        tab[0][1] = 2;
//        tab[0][2] = 3;
//        tab[1][0] = 4;
//        tab[1][1] = 5;
//        tab[2][0] = 6;
//        tab[2][1] = 7;
//        tab[2][2] = 8;
//        tab[2][3] = 9;
//        tab[3][0] = 10;

// drugie rozwiązanie

//        tab[0] = new int[]{1, 2, 3};
//        tab[1] = new int[]{4, 5};
//        tab[2] = new int[]{6, 7, 8, 9};
//        tab[3] = new int[]{10};


        // trzecie rozwiązanie, najlepsze, warto stosować wtedy kiedy wiemy jakie wartości stosować

        int[][] tab = {
                {1, 2, 3},
                {4, 5},
                {6, 7, 8, 9},
                {10}
        };

        int sum = tab[0][0] + tab[1][0] + tab[2][0] + tab[3][0];
        System.out.println("Sum: " + sum);

    }
}
