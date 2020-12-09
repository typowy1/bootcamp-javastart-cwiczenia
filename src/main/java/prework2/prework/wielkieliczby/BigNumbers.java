package prework2.prework.wielkieliczby;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigNumbers {

    public static void main(String[] args) {
        double a = 0.7;
        double b = 0.3;
        System.out.println(a - b);

//        BigInteger i BigDecimal
//        Obiekty powyższych klas można stworzyć albo na podstawie liczby reprezentowanej jako String, albo na podstawie
//        istniejących wartości liczbowych typów prostych.

//BigInteger
        // utworzenie obiektu na podstawie wartości typu String
        BigInteger big1 = new BigInteger("109876543210987654321");
        BigInteger big3 = BigInteger.valueOf(1098765543210987654L); //przy tej metodzie podajemy liczby typu long czyli 8587578L i nie możemy
        // podać nieskończenie wielkiej liczby jak w przypadku konstruktora, i jak jakaś liczbe przekracza Longa to musimy podać wartość Stringa.
        System.out.println("aBig - bBig = " + big1.subtract(big3)); // dodawanie BigInteger, w obu przypadkach wynik bedzie poprawny
// utworzenie obiektu za pomocą statycznej metody valueOf(), na
// podstawie wartości typu prostego
        BigDecimal big2 = BigDecimal.valueOf(0.7);

        // BigDecimal
        // w zależności jak utworzymy obiekt to możemy otrzymywac różne wyniki
        BigDecimal aBig = BigDecimal.valueOf(a); // przy tej metodzie podajemy liczby typu long czyli 8587578L i nie możemy
        // podać nieskończenie wielkiej liczby jak w przypadku konstruktora, i jak jakaś liczbe przekracza Longa to musimy podać wartość Stringa.
        BigDecimal bBig = BigDecimal.valueOf(b);
        BigDecimal result = aBig.subtract(bBig);
        System.out.println("aBig - bBig = " + result); // dodawanie BigDecimal, wynik będzie prawidłowy

//        tu bedzie problem, który nie występuje w przypadku metody valueOf
        // przy BigDecimal najbespieczniej jest kożystać z metody valueOf lub w konstruktorze przyjąć wartosć stringa
        BigDecimal cBig = new BigDecimal(a);
        BigDecimal dBig = new BigDecimal(b);
        BigDecimal result2 = aBig.subtract(bBig);
        // metoda add zwraca nowy obiekt którym jest wynik

//        Zwróć jednak uwagę, że każda z metod służąca do obliczeń na typach BigInteger, czy BigDecimal nie modyfikuje
//        oryginalnej wartości obiektu - podobnie jak obiekty klasy String, są to obiekty niemodyfikowalne.
//
//        W celu zmiany wartości liczby należy więc posługiwać się zapisem w takim stylu:


        // prawidłowe odejmowanie
        BigDecimal a1Big = BigDecimal.valueOf(a);
        BigDecimal b1Big = BigDecimal.valueOf(b);
        a1Big = aBig.subtract(b1Big);
// metoda add zwraca nowy obiekt którym jest wynik

    }
}
