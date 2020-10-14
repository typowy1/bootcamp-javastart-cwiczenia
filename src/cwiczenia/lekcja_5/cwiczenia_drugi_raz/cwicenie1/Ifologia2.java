package cwiczenia.lekcja_5.cwiczenia_drugi_raz.cwicenie1;

public class Ifologia2 {
    public static void main(String[] args) {
        int number = 10;

        if (number % 2 == 0) {
            System.out.printf("Liczba %d jest parzysta", number);
        } else if (number % 2 == 1) {
            System.out.printf("Liczba %d jest nieparzysta", number);
        } else if (number % 2 == -1) {
            System.out.printf("Liczba %d jest ujemna i nieparzysta", number);
        }
        System.out.println();
        System.out.println("<<<<<<<<");

        int mod = number % 2;
        switch (mod) {
            case 0:
                System.out.printf("Liczba %d jest parzysta", number);
                break;
            case 1:
                System.out.printf("Liczba %d jest nieparzysta", number);
                break;
            case -1:
                System.out.printf("Liczba %d jest ujemna i nieparzysta", number);
        }
    }
}
