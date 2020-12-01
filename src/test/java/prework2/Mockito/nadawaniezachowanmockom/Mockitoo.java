package prework2.Mockito.nadawaniezachowanmockom;

import org.mockito.Mockito;

public class Mockitoo {

    //https://javastart.pl/kurs/testowanie-jednostkowe/mockowanie/lekcja/tj-mockowanie-nadawanie-zachowania
    //Jedną z podstawowych funkcjonalności mocków jest możliwość nadawania im zachowania. Zapis jest tego typu:
    //
    //Mockito.when(mock.metoda()).thenReturn(wartosc);
    //1
    //file_copy
    //
    //Można to zobrazować w ten sposób, że nadajemy instrukcję mockowi: "Słuchaj. Jeśli ktoś Cię zapyta to zapyta o tę metodę, to odpowiedz mu w ten sposób".
    //
    //Od tego momentu każde wywołanie metody spowoduje zwrócenie zadanej wartości.

//    @Test
//    public void shouldAlwaysReturnGivenName() {
//        User user = Mockito.mock(User.class); to niejest obiekt klasy user a mock
//
//        Mockito.when(user.getName()).thenReturn("Kasia");
//
//        assertThat(user.getName()).isEqualTo("Kasia");
//        assertThat(user.getName()).isEqualTo("Kasia");
//        assertThat(user.getName()).isEqualTo("Kasia");
//    }

    //Istnieje możliwość podania kilku wartości. W takim przypadku definiujemy co ma być zwrócone za pierwszym razem, co za drugim i kolejnym. Ostatnia wartość będzie zwracana dla każdego kolejnego wywołania.
    //
    //    @Test
    //    public void testMockitoWhenValues() {
    //        User user = Mockito.mock(User.class);
    //
    //        Mockito.when(user.getName()).thenReturn("Kasia", "Basia", "Krysia");
    //
    //        assertThat(user.getName()).isEqualTo("Kasia");
    //        assertThat(user.getName()).isEqualTo("Basia");
    //        assertThat(user.getName()).isEqualTo("Krysia");
    //        assertThat(user.getName()).isEqualTo("Krysia");
    //        assertThat(user.getName()).isEqualTo("Krysia");
    //    }


    //Inna możliwość to skorzystanie z metody then(Answer) - w tym przypadku do zaimplementowania mamy metodę, która zdecyduje co zwróci mock. Przykładowa implementacja:
    //
    //        Mockito.when(user.getName()).then(new Answer<String>() {
    //            @Override
    //            public String answer(InvocationOnMock invocationOnMock)  {
    //                return "Kasia";
    //            }
    //        });


    //Ponieważ Answer to interfejs funkcyjny to sugerowany zapis z wykorzystaniem wyrażeń lambda wygląda następująco.
    //
    //        Mockito.when(user.getName()).then(i -> {// pierw sprawdza potem uruchamia metode sout, w testkach jednoztkowych nie koniecznie trzeba to stosowac
    //            System.out.println("Liczenie wartości wynikowej");
    //            return "Kasia";
    //        });


    //Obiekt typu InvocationOnMock można wykorzystać do pobrania parametrów z jaką została wywołana metoda lub dostać się do mocka. Możliwe, że jest to przydatne w bardziej zaawansowanych przypadkach.
    //
    //Głowna różnica między thenReturn(), a then() polega na tym kiedy następuje ewaluacja wyniku. W pierwszym przypadku jest to w momencie deklaracji, natomiast w drugim wywołanie metody nastąpi dopiero wtedy kiedy będzie ona potrzebna. Spójrz na przykład poniżej. Najpierw deklarowane jest zachowanie mocka, a następnie 3x pobierana wartość.
    //
    //    @Test
    //    public void shouldAlwaysReturnGivenNameLazyWay() {
    //        User user = Mockito.mock(User.class);
    //
    //        Mockito.when(user.getName()).then(i -> "Kasia");
    //
    //        System.out.println("Zaraz będę sprawdzał po raz #1");
    //        assertThat(user.getName()).isEqualTo("Kasia");
    //        System.out.println("Zaraz będę sprawdzał po raz #2");
    //        assertThat(user.getName()).isEqualTo("Kasia");
    //        System.out.println("Zaraz będę sprawdzał po raz #3");
    //        assertThat(user.getName()).isEqualTo("Kasia");

    //Potwierdza to, że najpierw następuje deklaracja, a "wyliczanie" wartości dokonywane jest dopiero wtedy, kiedy jest to potrzebne. Nie dostrzegam potrzeby korzystania z tego rozwiązania przy testach jednostkowych, ale w przypadku gdyby pobranie wartości miałoby być kosztowne (np pobieranie przez sieć, albo czytanie z pliku) to można by rozważyć jego zastosowanie.


    //Rzucanie wyjątków
    //
    //Przydatną funkcjonalnością jest możliwość nakazania mockowi rzucenie wyjątku. Służy do tego metoda thenThrow(Throwable... t)  . Poniższy test nie przejdzie z powodu wyjątku, który zostanie rzucony przy wywołaniu user.getName()
    //
    //    @Test
    //    public void shouldThrowExceptionOnGetter() {
    //        User user = Mockito.mock(User.class);
    //        Mockito.when(user.getName()).thenThrow(new NullPointerException());
    //
    //        assertThat(user.getName());
    //    }

    //Obsługa metod zwracających void
    //
    //W przypadku metod, które zwracają void powyższa metoda nie zadziała. Wynika to z tego jak w Javie obsługiwany jest typ void. W takim przypadku należy użyć jej odpowiednika Mockito.doThrow()
    //
    //    @Test
    //    public void shouldHandleVoidMethod() {
    //        User user = Mockito.mock(User.class);
    //
    //        Mockito.doThrow(new IllegalStateException()).when(user).setName("Kasia");
    //
    //        user.setName("Basia");
    //        user.setName("Kasia");
    //    }

    //Co ciekawe, w powyższym przykładzie próba wywołania metody z parametrem "Basia" się powiedzie, a "Kasia" rzuci wyjątek. Wynika to z tego, że zachowanie zdefiniowaliśmy tylko dla parametru "Kasia". Każdy pozostały zostanie obsłużony w domyślny sposób, czyli po prostu nic się nie stanie. W celu ustalenia wspólnego zachowania dla wszystkich parametrów należy użyć odpowiedniego ArgumentMatchera, który jest tematem kolejnej lekcji.

}
