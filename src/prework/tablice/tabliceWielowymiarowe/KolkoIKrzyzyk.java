package prework.tablice.tabliceWielowymiarowe;

public class KolkoIKrzyzyk {
    //dobre są do gier, plansza kółko i krzyzyk, statki, warcaby, rubik itd.
    //https://javastart.pl/kurs/java/java-podstawy-temat-13-tablice-wielowymiarowe/lekcja/java-tablice-wielowymiarowe
    public static void main(String[] args) {
        // Wersja 1:
        int x1, x2, x3,
                x4, x5, x6,
                x7, x8, x9;

// Wersja 2:
        int[] tab1 = new int[3];
        int[] tab2 = new int[3];
        int[] tab3 = new int[3];

        // tablica wielowymiarowa
        int[][] tab = new int[3][3];// 3 tablice i każda przechowuje po 3 elementy, pierwsze nawiasy to numer tablicy
        // drugi nawias to numer indeksy elementu
//        tab jest referencją na tablicę, która przechowuje trzy referencje na tablice jednowymiarowe
        //w Javie tablice wielowymiarowe to tak naprawdę "tablice złożone z innych tablic".

        // uzupełnienie przekątnych w grze kółko i krzyżyk
        int[][] tab4 = new int[3][3];
        tab[0][0] = 5;
        tab[1][1] = 5;
        tab[2][2] = 5;

        int[][] array = new int[3][]; //chcemy tablicę złożoną z 3 tablic (wierszy)
        array[0] = new int[3]; //pierwsza tablica z 3 elementami (kolumnami)
        array[1] = new int[2]; //druga z dwoma
        array[2] = new int[1]; //trzecia w tylko jednym

        //tablice mozemy tworzyć z kilku tablic istniejących
        String[] firstNames = {"Karol", "Adam", "Basia"};
        String[] lastNames = {"Kowalski", "Nowakowska", "Wadecka"};

        String[][] firstLast = {firstNames, lastNames};
        System.out.println("Pierwsza osoba to: ");
        System.out.print(firstLast[0][0] + " " + firstLast[1][0]);
        System.out.println("Druga osoba to: ");
        System.out.println(firstLast[0][1] + " " + firstLast[1][1]);
        System.out.println("Trzecia osoba to: ");
        System.out.println(firstLast[0][2] + " " + firstLast[1][2]);
        System.out.println(firstLast.length);
        System.out.println(firstLast[0].length);

        //tablice nie musza miec tych samych rozmiarów
        int[] longTab = new int[1000];
        longTab[99] = 100;
        int[] midTab = new int[100];
        int[] smallTab = new int[10];

        int[][] hugeTab = new int[3][];
        hugeTab[0] = longTab;
        hugeTab[1] = midTab;
        hugeTab[2] = smallTab;

        System.out.println("Długości tablic: ");
        System.out.println(hugeTab[0].length + " ; " + hugeTab[1].length + " ; " + hugeTab[2].length);
        System.out.println("Setny element pierwszej tablicy: " + hugeTab[0][99]);

//        W tablicach wielowymiarowych możemy wyświetlić rozmiar każdego wiersza odwołując się do własności length.
//        Zapisując hugeTab.length otrzymamy wartość 3, czyli ilość wierszy/tablic, a zapisując np. hugeTab[0].length
//        otrzymamy wartość 1000, czyli ilość kolumn/elementów w pierwszej tablicy/wierszu.

        //kostka rubika
        int[][][] threeDimensions = new int[3][3][3];

        // jeżeli mamy tablice typu string to ona też musi się składać z tablic typu string
    }
}
