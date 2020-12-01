package prework2.assertj;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class AssertJTest {

    @Test
    public void example() {
        //     Assertions.assertThat(1).isEqualTo(1);
        assertThat(1).isEqualTo(1); // statyczny import
    }

    @Test
    public void nameShouldEndWithLetterA() {
        String name = "Dorota";
        String name2 = "Anna";
        //  org.junit.jupiter.api.Assertions.assertFalse(name.endsWith("a"));
        //   Assertions.assertThat(name).doesNotEndWith("a");
        assertThat(name).endsWith("a");
        assertThat(name).isEqualTo(name2);
        assertThat(name).endsWith("a").hasSize(7);
    }//
    // pierwsze co przyjmuje to obiekt który po kropce będziemy sprawdzać i wpisuje co chce sprawdzić

    //Dodałem pełne ścieżki do klasy Assertions, żeby dało się rozróżnić która pochodzi z biblioteki AssertJ, a która z JUnit 5.
    //
    //Korzystając z JUnit 5 wybrałem assertFalse, a jako argument sprawdzenie czy zmienna kończy się na literę "a". Natomiast w AssertJ istnieje dedykowana asercja która pozwala na to sprawdzenie. Ma to kilka zalet: po pierwsze jest zdecydowanie bardziej czytelne, a druga zaleta to informacja o błędzie. W przypadku JUnit 5 będzie to:
    //
    //org.opentest4j.AssertionFailedError: expected: <false> but was: <true>

    //
    //natomiast z AssertJ to:
    //
    //java.lang.AssertionError:
    //Expecting:
    //  <"Dorota">
    //not to end with:
    //  <"a">
    //
    //Sądzę, że nikt nie ma wątpliwości, że druga wiadomość jest zdecydowanie bardziej pomocna.


}
