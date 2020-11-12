package cwiczenia.lekcja13.zadanie2.rozwiązanie;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public class Shop {
    public static void main(String[] args) {
        try {
            List<Item> items = FileUtils.readItems("items.csv");
            Stats stats = PriceCalculator.calculateStats(items);
            System.out.println("Sprzedaż Netto: " + stats.getNettoSum() + "zł");
            System.out.println("Suma podatku VAT ze sprzedaży: " + stats.getTaxSum() + "zł");
            System.out.println("Sprzedaż Brutto: " + stats.getBruttoSum() + "zł");
            FileUtils.exportData(stats, "stats.csv");
        } catch (FileNotFoundException e) {
            System.out.println("Nie odnaleziono pliku");
        } catch (IOException e) {
            System.out.println("Nie udało się wyeksportować danych");
        }
    }

}
