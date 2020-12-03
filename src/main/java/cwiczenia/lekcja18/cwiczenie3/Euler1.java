package cwiczenia.lekcja18.cwiczenie3;

public class Euler1 {

    public static void main(String[] args) {
        Euler1 euler1 = new Euler1();
        int result = euler1.calculate(1000);
        System.out.println(result);
    }

    int calculate(int limit) {
        int result = 0;
        for (int i = 3; i < limit; i++) {// zaczynamy od 3 bo to pierwsza liczba ktora sie dzieli przez 3
            if (i % 3 == 0 || i % 5 == 0) { // jeżeli liczba podzielna jest przez 3 lub podzielne przez 5 to dodajemy je do siebie, czyli dla 3 - 3 + 6 + 9 = 18, dla 5 - 5 itd
                result += i;
            }
        }
        return result;
    }
}
