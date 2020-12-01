package cwiczenia.lekcja_5.cwiczenia_drugi_raz.cwicenie1.zgadnij_liczbe;

public class GuessNumberTest {

    public static void main(String[] args) {

        Number number = new Number(120);
        GuessNumber guessNumber = new GuessNumber();
        String numberInfo = guessNumber.checkNumber(number);

        System.out.println(numberInfo);
    }
}
