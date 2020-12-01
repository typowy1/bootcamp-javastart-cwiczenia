package cwiczenia.lekcja_5.days;

public class DaysConverter {


    String convertDays(int dayNumber) {
        String day = null;
        switch (dayNumber) {
            case 1:
                day = "Poniediałek";
                break;
            case 2:
                day = "Wtorek";
                break;
            case 3:
                day = "Sroda";
                break;
            case 4:
                day = "Czwartek";
                break;
            case 5:
                day = "Piątek";
                break;
            case 6:
                day = "Sobota";
                break;
            case 7:
                day = "Niedziela";
                break;
//            default:
//                day = "Nieprawidłowa wartosć"; // tu chcemy żeby metoda coś zwruciła, czyli jak będzie błędna
//                wartosć to zwróci null
        }
        return day;
    }

    String dayInfo(int dayNumber) {
        if (dayNumber >= 1 && dayNumber <= 5) {
            return "dzień pracujący";
        } else if (dayNumber == 6 || dayNumber == 7) {
            return "weekend";
        } else {
            return null;
        }
    }

}
