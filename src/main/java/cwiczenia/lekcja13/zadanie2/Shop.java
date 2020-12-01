package cwiczenia.lekcja13.zadanie2;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public class Shop {

    public static void main(String[] args) {
//        List<Item> items = List.of( // tworzymy liste obiektów item(produktów i przypisujemy ja do zmiennej
//                new Item("Telewizor", new BigDecimal("100"), new BigDecimal("23")),
//                new Item("Praliny", new BigDecimal("40"), new BigDecimal("8")),
//                new Item("Thinking in Java", new BigDecimal("120"), new BigDecimal("5"))
//        );

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


//        System.out.println("Sprzedaż netto: " +  PriceCalculator.sumNettoPrice(items) + "zł");
//        System.out.println("Suma podatku VAT ze sprzedazy: " +  PriceCalculator.sumTaxPrice(items) + "zł");
//        System.out.println("Suma sprzedaży Brutto: " +  PriceCalculator.sumBruttoPrice(items) + "zł");
//
//        //jedna metoda
//        System.out.println("Sprzedaż netto: " +  PriceCalculator.sum(items, Item::getNettoPrice) + "zł"); // z jakiegoś obiektu typu item chcemy wyciągnąć cene netto
//        System.out.println("Suma podatku VAT ze sprzedazy: " +  PriceCalculator.sum(items,Item::getTax) + "zł");
//        System.out.println("Suma sprzedaży Brutto: " +  PriceCalculator.sum(items, Item::getBruttoPrice) + "zł");
    }
}
