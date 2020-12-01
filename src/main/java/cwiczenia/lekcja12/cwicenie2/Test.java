package cwiczenia.lekcja12.cwicenie2;

import java.io.IOException;

public class Test {
    public static void main(String[] args) {
        Product[] products = {
                new Product("mleko", "Mlekowita", 3.2),
                new Product("czekolada", "Wedel", 3.49),
                new Product("jogurt trudskawkowy", "Jogobella", 2.19)

        };// tablica

        try {
            FileUtils.save(products, "Products.csv");
        } catch (IOException e) {
            System.err.println("Nie udało się zapisać danych do pliku");
            e.printStackTrace();
        }
    }
}
