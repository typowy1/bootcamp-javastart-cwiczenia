package cwiczenia.lekcja_5;

public class Ifologia {
    public static void main(String[] args) {
        int number = -2;

        if (number % 2 == 0) {
            System.out.printf("Liczba %d jest parzysta", number);
        } else if (number % 2 == 1) {
            System.out.printf("Liczba %d jest nieparzysta", number);
        } else if (number % 2 == -1) {
            System.out.printf("Liczba %d jest ujemna i nieparzysta", number);
        }

        System.out.println();
        System.out.println("<<<<<<");

        int modulo = number % 2;// do switch nie przekazujemy number a zmienną modulo, dlatego że nie przyrównamy
        // wartości zmiennej number do number % 2 == 0, natomisat możemy przyrównać wynik z dzielenia
        // modulo do rezultatu np 0
        switch (modulo) {// tu naszą wartością case jest wynik, czyli 0, 1, -1 i jeśli zmienna modulo = 0 to wykona się
            // pierwszy case itd.
            case 0:
                System.out.printf("Liczba %d jest parzysta", number);
                break;
            case 1:
                System.out.printf("Liczba %d jest nieparzysta", number);
                break;
            case -1: // dla ujemnych liczb nieparzystych zawsze będzie -1, czyli number % 2 = -1
                System.out.printf("Liczba %d jest ujemna i nieparzysta", number);
                break;
        }

        if (number % 2 == 0) {// wzór na liczbę dodatnią parzystą lub ujemną parzystą
            if (number > 0)
                System.out.println("Dodatnia liczba parzysta");

            else if (number < 0)
                System.out.println("Ujemna liczba parzysta");
        }
    }
}
