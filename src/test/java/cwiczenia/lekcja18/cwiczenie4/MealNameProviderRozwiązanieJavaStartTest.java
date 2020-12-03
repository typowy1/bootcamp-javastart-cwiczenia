package cwiczenia.lekcja18.cwiczenie4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.time.LocalTime;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

class MealNameProviderRozwiązanieJavaStartTest {

    @Mock
    private DateTimeProvider dateTimeProvider;


    private MealNameProvider mealNameProvider;

    @BeforeEach
    void init() {
        MockitoAnnotations.openMocks(this);
        mealNameProvider = new MealNameProvider(dateTimeProvider);
    }

    @Test
    void shouldReturnBreakfastStart() {
        // given
        when(dateTimeProvider.localTimeNow()).thenReturn(LocalTime.of(5, 0));

        // when
        String mealName = mealNameProvider.provideMealName();

        // then
        assertThat(mealName).isEqualToIgnoringCase("śniadanie");
    }

    @Test
    void shouldReturnBreakfastEnd() {
        // given
        when(dateTimeProvider.localTimeNow()).thenReturn(LocalTime.of(8, 59));

        // when
        String mealName = mealNameProvider.provideMealName();

        // then
        assertThat(mealName).isEqualToIgnoringCase("śniadanie");
    }

    @Test
    void shouldReturn2ndBreakfastStart() {
        // given
        when(dateTimeProvider.localTimeNow()).thenReturn(LocalTime.of(9, 0));

        // when
        String mealName = mealNameProvider.provideMealName();

        // then
        assertThat(mealName).isEqualToIgnoringCase("drugie śniadanie");
    }

    @Test
    void shouldReturn2ndBreakfastEnd() {
        // given
        when(dateTimeProvider.localTimeNow()).thenReturn(LocalTime.of(11, 59));

        // when
        String mealName = mealNameProvider.provideMealName();

        // then
        assertThat(mealName).isEqualToIgnoringCase("drugie śniadanie");
    }

    @Test
    void shouldReturnDinner() {
        // given
        when(dateTimeProvider.localTimeNow()).thenReturn(LocalTime.of(13, 5));

        // when
        String mealName = mealNameProvider.provideMealName();

        // then
        assertThat(mealName).isEqualToIgnoringCase("obiad");
    }

    @Test
    void shouldReturnSupper() {
        // given
        when(dateTimeProvider.localTimeNow()).thenReturn(LocalTime.of(19, 59));

        MealNameProvider mealNameProvider = new MealNameProvider(dateTimeProvider);

        // when
        String mealName = mealNameProvider.provideMealName();

        // then
        assertThat(mealName).isEqualToIgnoringCase("podwieczorek");
    }

    @Test
    void shouldReturnNightMeal() {
        // given
        when(dateTimeProvider.localTimeNow()).thenReturn(LocalTime.of(1, 50));

        MealNameProvider mealNameProvider = new MealNameProvider(dateTimeProvider);

        // when
        String mealName = mealNameProvider.provideMealName();

        // then
        assertThat(mealName).isEqualToIgnoringCase("przekąska nocna");
    }

    @Test
    void shouldReturnNightMeal2() {
        // given
        when(dateTimeProvider.localTimeNow()).thenReturn(LocalTime.of(23, 55));

        MealNameProvider mealNameProvider = new MealNameProvider(dateTimeProvider);

        // when
        String mealName = mealNameProvider.provideMealName();

        // then
        assertThat(mealName).isEqualToIgnoringCase("przekąska nocna");
    }

}