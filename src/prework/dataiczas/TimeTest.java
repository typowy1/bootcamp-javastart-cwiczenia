package prework.dataiczas;

import java.time.Duration;
import java.time.Instant;

public class TimeTest {
    //    Klasa Instant
//
//Jeżeli potrzebna jest nam klasa do reprezentacji czasu w danej chwili, która posłuży np. do zapisania czasu utworzenia
// jakiegoś obiektu lub upływającego czasu, będzie to dobry wybór.
//
//Klasa Instant nie posiada konstruktora, jeżeli chcesz uzyskać aktualny czas powinieneś posłużyć się statyczną metodą
// Instant.now():
// mierzenie czasu wykonania jakiejś czynności
    public static void main(String[] args) {

        //Przykład kodu, który zmierzy ile nanosekund zajęło wykonanie pewnej czynności:
        Instant i1 = Instant.now();// tu startuje
        for (int i = 0; i < 100; i++) {
            System.out.println("Miernik czasu");
        }
        Instant i2 = Instant.now(); // tu kończy
        Duration duration = Duration.between(i1, i2); // tu oblicza
        System.out.println("Pętla wykonała się w : " + duration.getNano() + " nanosekund");
    }
}
