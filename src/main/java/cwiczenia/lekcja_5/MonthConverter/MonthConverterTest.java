package cwiczenia.lekcja_5.MonthConverter;

public class MonthConverterTest {
    public static void main(String[] args) {
        int number = 5;
        MonthConverter3 monthConverter = new MonthConverter3();

        System.out.println("Miesiąc to: " + monthConverter.convert(number));
        System.out.println("<<<<<<<<");
        System.out.println("Miesiąc to: " + monthConverter.convert2(number));
    }
}
