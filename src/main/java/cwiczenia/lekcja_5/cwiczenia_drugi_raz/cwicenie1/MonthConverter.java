package cwiczenia.lekcja_5.cwiczenia_drugi_raz.cwicenie1;

public class MonthConverter {

    String convert(int number) {
        String month = null;
        switch (number) {
            case 1:
                month = "Styczeń";
                break;
            case 2:
                month = "Luty";
                break;
            case 3:
                month = "Marzec";
                break;
            case 4:
                month = "Kwiecień";
                break;
            case 5:
                month = "Maj";
                break;
            case 6:
                month = "Czerwiec";
                break;
            case 7:
                month = "Lipiec";
                break;
            case 8:
                month = "Sierpień";
                break;
            case 9:
                month = "Wrzesień";
            case 10:
                month = "Październik";
            case 11:
                month = "Listopad";
            case 12:
                month = "Grudzień";
            default:
                month = "undefined";
        }
        return month;
    }
}
