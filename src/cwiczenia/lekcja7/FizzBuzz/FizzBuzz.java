package cwiczenia.lekcja7.FizzBuzz;

public class FizzBuzz {// tu jest wazna kolejnosc zeby to sprawdzic i wyswietlił sie 1 wynik wpierw czyli 15 fizzbuzz

    // musimy sprawdzic liczby podzielne przez 15, jeśli zrobimy to odwrotnie i na końcu będzie % 15 == 0
    // to nie befzie napisu fizzbuzz dla % 15 == 0
    // jezeli damy 3 raz if to wyświetlą się np 15 fizz, 15 buzz, 15 fizzbuz, a miało się wyświetlic raz 15 fizzbuzz
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if (i % 15 == 0) {
                // (i % 3 == 0 && i % 5 == 0)jezeli liczba jest podzielna przez 3 i przez 5 to jest podzielna przez 15
                // i może byc powyższy zapis
                System.out.println(i + " FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println(i + " Fizz");
            } else if (i % 5 == 0) {
                System.out.println(i + " Buzz");
            }
        }
    }
}
