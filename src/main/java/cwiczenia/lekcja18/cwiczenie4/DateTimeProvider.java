package cwiczenia.lekcja18.cwiczenie4;

import java.time.LocalTime;

public class DateTimeProvider {

    // dostarczanie aktualnego czasu

    public LocalTime localTimeNow() { //metoda zwraca aktualny czas, będziemy ją stosowac w mocku, żeby zwroscic czas potrzebny do testow
        return LocalTime.now();
    }
}
