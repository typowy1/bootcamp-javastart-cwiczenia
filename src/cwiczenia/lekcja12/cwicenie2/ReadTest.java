package cwiczenia.lekcja12.cwicenie2;

import java.io.FileNotFoundException;

public class ReadTest {
    public static void main(String[] args) {// obsługijemy wyjątek

        // wyswietlanie plików
        try {
            Product[] products = FileUtils.read("Products.csv");
            for (Product product : products) { // pętla która przejdzie po całej tablicy
                System.out.println(product); // wyświetlamy każdy kolejny produkt, automatycznie wywoła metodę toString
            }
        } catch (FileNotFoundException e) {
            System.err.println("Brak wskazanego pliku");
        }
    }
}
