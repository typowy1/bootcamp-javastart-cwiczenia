package cwiczenia.lekcja_5.cwiczenia_drugi_raz.cwicenie1.dni_tygodnia;

public class DayTest {
    public static void main(String[] args) {
        DayConverter2 dayConverter2 = new DayConverter2();
        int number = 4;

        String day = dayConverter2.converter(number);
        String dayInfo = dayConverter2.dayInfo(number);

        if (day != null) {
            System.out.println("Podany numer dnia tygodnia: " + number);
            System.out.println(day + " to: " + dayInfo);
        } else {
            System.out.println("Podałeś błędną liczbę!");
        }

    }
}
