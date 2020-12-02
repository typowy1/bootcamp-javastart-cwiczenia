package cwiczenia.lekcja18.cwiczenie2.pl.javastart.taxcalc;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;

class TaxCalculatorTest {

    // testujemy warunki brzegowe
    // jeśli kotoś zarobił zero to będzie miał zero do zapłacenia podatku

    @Test
    void shouldReturnTaxFor0Income() { // sprawdza dla przychodu 0
        // given - przygotowanie danych testowych
        TaxCalculator taxCalculator = new TaxCalculator();

        //when - włączenie metody którą my chcemy przetestować czy działa poprawnie
        int tax = taxCalculator.calculateTax(BigDecimal.valueOf(0));

        //taen - sprawdza czy wszystko poszło z naszym założeniem
        assertThat(tax).isEqualTo(0);
    }

    @Test
    void shouldReturn0TaxFor50000Income() { // sprawdza dla przychodu 50000 dla podatku 18%
        // given - przygotowanie danych testowych
        TaxCalculator taxCalculator = new TaxCalculator();

        //when - włączenie metody którą my chcemy przetestować czy działa poprawnie
        int tax = taxCalculator.calculateTax(BigDecimal.valueOf(50000));

        //taen - sprawdza czy wszystko poszło z naszym założeniem

        assertThat(tax).isEqualTo(8444);
    }

    @Test
    void shouldReturn0TaxFor49990Income() { // sprawdza dla przychodu z kwotą po przecinku, czy zaokrągla do góry, lub dołu, dla podatku 18%
        // given - przygotowanie danych testowych
        TaxCalculator taxCalculator = new TaxCalculator();

        //when - włączenie metody którą my chcemy przetestować czy działa poprawnie
        int tax = taxCalculator.calculateTax(BigDecimal.valueOf(49990));

        //taen - sprawdza czy wszystko poszło z naszym założeniem

        assertThat(tax).isEqualTo(8442);
    }


    @Test
    void shouldReturn0TaxFor100000Income() { // sprawdza dla przychodu dla podatku powyzej 85 tys, drugi próg podatkowy podatek 32% od kwoty wyższej niz 85528
        // given - przygotowanie danych testowych
        TaxCalculator taxCalculator = new TaxCalculator();

        //when - włączenie metody którą my chcemy przetestować czy działa poprawnie
        int tax = taxCalculator.calculateTax(BigDecimal.valueOf(100000));

        //taen - sprawdza czy wszystko poszło z naszym założeniem

        assertThat(tax).isEqualTo(19470);
    }
}