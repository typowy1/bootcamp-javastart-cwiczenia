package cwiczenia.lekcja_5.days;

public class DayTest {
    public static void main(String[] args) {
        DaysConverter converter = new DaysConverter();

        int dayNumber = 5;
        String day = converter.convertDays(dayNumber);// to zwróci nam Stringa z nazwą dnia
        String dayInfo = converter.dayInfo(dayNumber);// to  zwróci czy dzień jest pracujący czy weekend

        if (day != null) {
            System.out.println("Numer dnia tygodnia: " + dayNumber);
            System.out.println(day + " to: " + dayInfo);
        } else {
            System.out.println("Niepoprawny dzień tygodnia, wybierz numer z przedziału 1-7");
        }
    }
}
