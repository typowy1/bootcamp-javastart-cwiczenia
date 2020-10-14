package cwiczenia.lekcja_5.cwiczenia_drugi_raz.cwicenie1.dni_tygodnia;

public class DayConverter2 {

    public String converter(int number) {
        String dayName = null;
        switch (number) {
            case 1:
                dayName = "Poniedziałek";
                break;
            case 2:
                dayName = "Wtorek";
                break;
            case 3:
                dayName = "Sroda";
                break;
            case 4:
                dayName = "Czwartek";
                break;
            case 5:
                dayName = "Piątek";
                break;
            case 6:
                dayName = "Sobota";
                break;
            case 7:
                dayName = "Niedziela";
                break;
        }
        return dayName;
    }

    public String dayInfo(int number) {
        if (number >= 1 && number <= 5) {
            return "dzień pracujący";
        } else if (number == 6 || number == 7) {
            return "weekend";
        }
        return null;
    }
}
