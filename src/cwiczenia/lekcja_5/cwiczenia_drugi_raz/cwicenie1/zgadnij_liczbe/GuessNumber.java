package cwiczenia.lekcja_5.cwiczenia_drugi_raz.cwicenie1.zgadnij_liczbe;

public class GuessNumber {

    String checkNumber(Number number) {

        int multi3 = number.getA() % 3;

        if (number.getA() < 100) {
            return "Liczba jest mniejsza od 100";
        } else if (number.getA() > 200) {
            return "Liczba jest większ od 200";
        } else if (multi3 != 0) {
            return "nie jest podzielna przez 3";
        } else {
            return "Twoja liczba jest ok";
        }
    }
}
