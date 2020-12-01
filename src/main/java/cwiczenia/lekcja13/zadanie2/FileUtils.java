package cwiczenia.lekcja13.zadanie2;

import java.io.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileUtils {
//    Dodaj wczytywanie danych z pliku CSV, który przechowuje dane w postaci:

    // wczytanie danych z pliku

//    static List<Item> readItems(String fileName) throws FileNotFoundException {
//        Scanner scanner = new Scanner(new File(fileName));
//        List<Item> items = new ArrayList<>();
//        while (scanner.hasNextLine()) { // dopóki jest kolejny wiersz tekstu do odczytania to wczytajmy go
//            String line = scanner.nextLine(); //Telewizor;100;23
//            String[] split = line.split(";");//rozdzielamy wiersz za pomoca ;, uzyskamy Telewizor 100 23
//            Item nextItem = new Item(split[0], new BigDecimal(split[1]), new BigDecimal(split[2]));
//            items.add(nextItem); // dodajemy utowrzony item do listy items
//        }
//        return items;
//    }

    static List<Item> readItems(String fileName) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(fileName));
        List<Item> items = new ArrayList<>();
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] split = line.split(";");
            Item nextItem = new Item(split[0], new BigDecimal(split[1]), new BigDecimal(split[2]));
            items.add(nextItem);
        }
        return items;
    }

    static void exportData(Stats stats, String fileName) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
        writer.write("Netto;" + stats.getNettoSum());
        writer.newLine();
        writer.write("Tax;" + stats.getTaxSum());
        writer.newLine();
        writer.write("Brutto;" + stats.getBruttoSum());
        writer.close();
    }

}
