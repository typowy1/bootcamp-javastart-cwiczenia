package prework2.pierwszytest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    void shouldAdd1To1AndReturn2() {
        // given
        int a = 1;
        int b = 1;

        Calculator calculator = new Calculator();

        //when
        int result = calculator.add(a, b);

        //than
        Assertions.assertEquals(2, result);

        //Powyższy test sprawdza czy dodanie 1 do 1 korzystając z klasy Calculator zwróci wynik o wartości 2. Jeśli tak się stanie to test zostanie zakończony sukcesem, a w przeciwnym razie oznaczony zostanie jako porażka. Ten test napisany jest korzystając z JUnit 5. To właśnie z tej biblioteki pochodzą dwa importy: Assertions oraz Test.
        //
        //Test który przeprowadzamy jest metodą która znajduje się w klasie CalculatorTest. Nazwa klasy nie jest przypadkowa. Testujemy metodę która znajduje się w klasie Calculator. Dobrą praktyką jest nazywanie klasy testowej tak samo jak tej którą testuje dodając końcówkę Test. Nazwa metody testowej wskazuje natomiast co dany test sprawdza.
        //
        //Kolejna ważna sprawa: zarówno klasa którą testujemy, jak i klasa z testem znajdują się w tym samym pakiecie: pl.javastart.junittestingcourse.examples. Robi się to dlatego, żeby łatwiej było odnaleźć się w kodzie, ale również dlatego, żeby test mógł uruchamiać metody które nie są publiczne. Zauważ, że metoda add() w klasie Calculator nie ma modyfikatora dostępu, co znaczy, że jest widoczna tylko w ramach pakietu. Podobnie byłoby z protected. Dzięki temu nie ma potrzeby ustawiania metod na publiczne jeśli chcemy je przetestować, wystarczy modyfikator pakietowy.

        //Mimo, że obie klasy znajdują się w tym samym pakiecie, to nie są w tym samym folderze na dysku. Maven tworzy dwa osobne foldery: main oraz test.
        //
        //Takie rozdzielenie pozwala na odseparowanie testów od właściwego kodu aplikacji. Dzięki temu gdy wydajemy aplikację to w jej kodzie binarnym nie będzie śladu po testach. Zostaną one wykonane przed zbudowaniem aplikacji, ale nie będą jej częścią.
        //
        //Sama metoda testowa oznaczona jest adnotacją @Test. Jest to informacja dla JUnit 5, że ma uruchomić tę metodę i traktować ją jako test. Gdyby w tej klasie znajdowały się inne metody bez adnotacji @Test, to zostaną pominięte przy uruchomieniu testów.
        //
        //Przyjmuje się, że test składa się z trzech sekcji:
        //
        //    given - przygotowanie danych testowych i środowiska
        //    when - wykonanie kodu który chcemy przetestować czy działa poprawnie
        //    then - sprawdzenie czy wynik jest taki jak się spodziewamy
        //
        //Jest to umowne założenie, ale dobrą praktyką jest oddzielenie tych sekcji za pomocą komentarzy. Wracając do testu po dłuższym czasie łatwiej będzie się w nim odnaleźć. Takie podejście ułatwi też pracę w zespole, gdzie czasami trzeba naprawiać testy które napisali współpracownicy.
        //
        //Sprawdzenie poprawności wykonujemy za pomocą tzw. asercji. W tym przypadku sprawdzamy czy 2 i result będzie równe.
        //
        //Test oczywiście przechodzi, ale gdyby ktoś zepsuł metodę Calculator.add(int a, int b) to przy następnym uruchomieniu testów zakończyłby się porażką.

    }
}
