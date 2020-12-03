package cwiczenia.lekcja18.cwiczenie3;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class Euler1Test {

    private Euler1 euler1 = new Euler1();

    @Test
    void shouldReturn23For10() {

//        // givem -- przygotowanie środowiska testowego i danych
//        Euler1 euler1 = new Euler1();

        // when - uruchamiamy metodę którą chcemy przetestować
        int result = euler1.calculate(10);

        //then - sprawdzamy czy wynik jest taki jak sie spodziewamy
        assertEquals(23, result);
    }

    @Test
    void shouldReturn33For11() {

//        // givem -- przygotowanie środowiska testowego i danych
//        Euler1 euler1 = new Euler1();

        // when - uruchamiamy metodę którą chcemy przetestować
        int result = euler1.calculate(11);

        //then - sprawdzamy czy wynik jest taki jak sie spodziewamy
        assertEquals(33, result);
    }


    @Test
    void shouldReturn33For12() {

//        // givem -- przygotowanie środowiska testowego i danych
//        Euler1 euler1 = new Euler1();

        // when - uruchamiamy metodę którą chcemy przetestować
        int result = euler1.calculate(12);

        //then - sprawdzamy czy wynik jest taki jak sie spodziewamy
        assertEquals(33, result);
    }

    @Test
    void shouldReturn45For13() {

//        // givem -- przygotowanie środowiska testowego i danych
//        Euler1 euler1 = new Euler1();

        // when - uruchamiamy metodę którą chcemy przetestować
        int result = euler1.calculate(13);

        //then - sprawdzamy czy wynik jest taki jak sie spodziewamy
        assertEquals(45, result);
    }

    @ParameterizedTest//parametryzowany test
    @CsvSource(value = {"60, 16", ""})
        // parametry do testów
    void shouldReturnExpectedValue(int expected, int limit) { // tu wpisuje parametry z csvSource

//        // givem -- przygotowanie środowiska testowego i danych
//        Euler1 euler1 = new Euler1();

        // when - uruchamiamy metodę którą chcemy przetestować
        int result = euler1.calculate(limit);

        //then - sprawdzamy czy wynik jest taki jak sie spodziewamy
        assertEquals(expected, result);
    }

    /*
    stwórz metodę która:
        będzie przyjmowała liczbę poniżej której mają być sumowane wielokrotności
        będzie zwracała sumę wielokrotności
    stwórz testy które sprawdzą metodę:
        dla wartości 10 wynik powinien wynosić 23
        dla wartości 11 wynik powinien wynosić 33
        dla wartości 12 wynik powinien wynosić 33
        dla wartości 13 wynik powinien wynosić 45
        dla wartości 16 wynik powinien wynosić 60
     */

}