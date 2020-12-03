package cwiczenia.lekcja18.cwiczenie4;

import java.time.LocalTime;

public class MealNameProviderRozwiązanieJavaStart {

        /*
    Celem metody jest zwracanie nazwy posiłków w zależności od aktualnej godziny:

    od 5:00 do 8:59 - śniadanie
    od 9:00 do 11:59 - drugie śniadanie
    od 12:00 do 15:59 - obiad
    16:00 do 19:59 - podwieczorek
    od 20:00 do 4:59 - przekąska nocna
     */

    private DateTimeProvider dateTimeProvider;

    public MealNameProviderRozwiązanieJavaStart(DateTimeProvider dateTimeProvider) {
        this.dateTimeProvider = dateTimeProvider;
    }

    public String provideMealName() {
        LocalTime currentTime = dateTimeProvider.localTimeNow();

        if (currentTime.isAfter(LocalTime.of(4, 59)) && currentTime.isBefore(LocalTime.of(9, 0))) {
            return "Śniadanie";
        } else if (currentTime.isAfter(LocalTime.of(8, 59)) && currentTime.isBefore(LocalTime.NOON)) {
            return "Drugie śniadanie";
        } else if (currentTime.isAfter(LocalTime.of(11, 59)) && currentTime.isBefore(LocalTime.of(16, 0))) {
            return "Obiad";
        } else if (currentTime.isAfter(LocalTime.of(15, 59)) && currentTime.isBefore(LocalTime.of(20, 0))) {
            return "Podwieczorek";
        }

        return "Przekąska nocna";
    }
}
