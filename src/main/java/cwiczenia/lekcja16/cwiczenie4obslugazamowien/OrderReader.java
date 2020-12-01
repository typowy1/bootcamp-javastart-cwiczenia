package cwiczenia.lekcja16.cwiczenie4obslugazamowien;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class OrderReader {

    public List<Order> readFromFile() throws IOException { // wczytywanie informacji z pliku, zwróci liste zamówień

        File file = new File("orders.csv"); // tworzenie pliku

        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);// czytanie pliku

        List<Order> orders = new ArrayList<>(); // lista dla zamówień

        String line; // wynik czytania lini
        while ((line = bufferedReader.readLine()) != null) {// czyta linie dopóki  line = bufferedReader.readLine() nie jest null
            String[] split = line.split(";");//dzielimy cały wiersz na segmenty

            int id = Integer.parseInt(split[0]); // przypisujemy wartość do id i zamieniamy na int
            String name = split[1];
            double price = Double.parseDouble(split[2]); // przypisujemy wartość do price i zamieniamy na double
            OrderState state = OrderState.valueOf(split[3]); // tu zamieniamy na obiekt state, gdzie jest status zamówienia

            Order order = new Order(id, name, price, state);// wypełniamy obiekt zamówień
            orders.add(order);
        }

        return orders;
    }
}
