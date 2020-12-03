package cwiczenia.lekcja18.cwiczenie4;

import java.time.LocalTime;

public class MealNameProvider {

    private DateTimeProvider dateTimeProvider; //pole czasu now

    public MealNameProvider(DateTimeProvider dateTimeProvider) { // konstruktor który przyjmuje date
        this.dateTimeProvider = dateTimeProvider;
    }

    public String provideMealName() {
        LocalTime currentTime = dateTimeProvider.localTimeNow(); //używamy naszego prowaidera do podawania czasu

        if (currentTime.isBefore(LocalTime.NOON)) {
            return "Śniadanie";
        } else if (currentTime.isBefore(LocalTime.of(16, 0))) {
            return "Obiad";
        }

        return "Kolacja";
    }
/*
Celem metody jest zwracanie nazwy posiłków w zależności od aktualnej godziny:

    od 5:00 do 8:59 - śniadanie
    od 9:00 do 11:59 - drugie śniadanie
    od 12:00 do 15:59 - obiad
    16:00 do 19:59 - podwieczorek
    od 20:00 do 4:59 - przekąska nocna

 */
}
