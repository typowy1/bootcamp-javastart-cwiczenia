package cwiczenia.lekcja18.cwiczenie4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.time.LocalTime;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MealNameProviderTest {

     /*
    Celem metody jest zwracanie nazwy posiłków w zależności od aktualnej godziny:

    od 5:00 do 8:59 - śniadanie
    od 9:00 do 11:59 - drugie śniadanie
    od 12:00 do 15:59 - obiad
    16:00 do 19:59 - podwieczorek
    od 20:00 do 4:59 - przekąska nocna

Wskazówki:

W celu symulowania aktualnej godziny potrzebne będzie stworzenie dodatkowej klasy której odpowiedzialnością będzie
jej zwracanie. Pozwoli to na zmockowanie tej klasy w testach.
     */

    // tworze pola dla Mocka
    @Mock
    private DateTimeProvider dateTimeProvider;

    private MealNameProvider mealNameProvider; //inicjowanie konstruktora tez sie powtarza wię wrzucamy go do pola

    /* przed każdym testem będziemy przygotowywać mocki*/
    @BeforeEach
    void init() {
        MockitoAnnotations.openMocks(this); //to szuka czy są pola oznaczone adnotacją Mock, jest takie na gorze dateTimeProvider i je otwiera
        mealNameProvider = new MealNameProvider(dateTimeProvider); // wywołamy obiekt z czasem potrzebnym do testu
    }


    @Test
    void shouldReturnBreakfastStart() { // wartości brzegowe z wymagani 5 i 8:59 i tak dla każdego posiłku

        Mockito.when(dateTimeProvider.localTimeNow()).thenReturn(LocalTime.of(5, 0));
        //when
        String mealName = mealNameProvider.provideMealName();

        //then
        assertThat(mealName).isEqualTo("Śniadanie");
    }


    @Test
    void shouldReturnBreakfastEnd() {

        //given
        // 1 podejscie
//        DateTimeProvider dateTimeProviderMock = Mockito.mock(DateTimeProvider.class);//tworzymy mocka czasu którym będziemy manipulować w teście, mock klasy DateTimeProvider, drugie podejscie jak mamy wiecej takich testow to tworzymy pole mock i befor each

//        2 podejscei z wykorzystaniem pola Mock i Beforeach z metodą init
        Mockito.when(dateTimeProvider.localTimeNow()).thenReturn(LocalTime.of(8, 59));// dajemy mockowi funkcjonalnosć, w momencie gdy na mocku zostanie wywołana metoda lockalTimeNow wtedy zwróć np czas dla śniadania
//   można tez zastosować statyczne importy
//        mealNameProvider = new MealNameProvider(dateTimeProvider); // wywołamy obiekt z czasem potrzebnym do testu, przenieśliśmy to do mettody init

        //when
        String mealName = mealNameProvider.provideMealName();

        //then
        assertThat(mealName).isEqualTo("Śniadanie");
    }


    @Test
    void shouldReturnDinner() {

        //given
        Mockito.when(dateTimeProvider.localTimeNow()).thenReturn(LocalTime.of(13, 30));// dajemy mockowi funkcjonalnosć, w momencie gdy na mocku zostanie wywołana metoda lockalTimeNow wtedy zwróć np czas dla śniadania
//        mealNameProvider = new MealNameProvider(dateTimeProvider); // wywołamy obiekt z czasem potrzebnym do testu przenieśliśmy to do mettody init

        //when
        String mealName = mealNameProvider.provideMealName();

        //then
        assertThat(mealName).isEqualTo("Obiad");
    }

    @Test
    void shouldReturnSupper() {
        //given
        Mockito.when(dateTimeProvider.localTimeNow()).thenReturn(LocalTime.of(19, 30));// dajemy mockowi funkcjonalnosć, w momencie gdy na mocku zostanie wywołana metoda lockalTimeNow wtedy zwróć np czas dla śniadania
//        mealNameProvider = new MealNameProvider(dateTimeProvider); // wywołamy obiekt z czasem potrzebnym do testu, przenieśliśmy to do mettody init

        //when
        String mealName = mealNameProvider.provideMealName();

        //then
        assertThat(mealName).isEqualTo("Kolacja");
    }

}