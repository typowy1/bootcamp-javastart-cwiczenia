package prework2.pierwszytest;

public class Calculator {

    int add(int a, int b) {
        return a + b;
    }
    //Kolejna ważna sprawa: zarówno klasa którą testujemy, jak i klasa z testem znajdują się w tym samym pakiecie: pl.javastart.junittestingcourse.examples. Robi się to dlatego, żeby łatwiej było odnaleźć się w kodzie, ale również dlatego, żeby test mógł uruchamiać metody które nie są publiczne. Zauważ, że metoda add() w klasie Calculator nie ma modyfikatora dostępu, co znaczy, że jest widoczna tylko w ramach pakietu. Podobnie byłoby z protected. Dzięki temu nie ma potrzeby ustawiania metod na publiczne jeśli chcemy je przetestować, wystarczy modyfikator pakietowy.

    //CalculatorTest jest w testach w pierwszytest
}
