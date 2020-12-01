package cwiczenia.lekcja8;

public class NumberHelper {

    //    odwrotność liczby
    //moje rozwiązanie
    static int reverse = 0;

    public static int reverseNumber(int n) {
        while (n != 0) {
            reverse = reverse * 10;
            reverse = reverse + n % 10;
            n = n / 10;
        }

        return reverse;
    }
//pierw musimy rozebrać liczbę na pojedyńcze elementy czyli dzielimy tą liczbe modulo 10 i zostaje reszta 4, potem 3, potem 2 itd.
//    potem chcemy uciąć tą czwórkę więc musimy podzielić tą liczbe przez 10
    //1234
    //123
    //12
    //1
    // rozwiązanie z kursu

    public static int reverseNumber1(int n) {
        int numberOfDigits = countDigits(n);
        int result = 0;
        for (int i = 0; i < numberOfDigits; i++) {
            int lastDigit = n % 10; // bierzemy ostatnią cyfrę z cyfry 1234 to bedzie 4 przy pierwszej iteracji
            result = result + lastDigit * (int) Math.pow(10, numberOfDigits - 1 - i);
            n /= 10;
        }
        return result;
    }

    private static int countDigits(int n) { // sprawdzamy ile cyfr ma liczba, czyli np dajemy 1234

        int counter = 0;
        while (n > 0) { //1234 > 0
            counter++;
            n = n / 10; //zostaje nam 123
        }
        return counter;
    }

    // 3 rozwiązanie

    static int reverseWithString(int n) { // odwraca znaki stringa

        StringBuilder stringBuilder = new StringBuilder(Integer.toString(n));// przekazujemy onta do stringa 123
        return Integer.valueOf(stringBuilder.reverse().toString()); // odwracamy stringa i zamieniamy do na inta 321
    }
}
