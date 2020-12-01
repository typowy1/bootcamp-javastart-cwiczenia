package cwiczenia.lekcja12.cwicenie2;

import java.io.*;
import java.util.Scanner;

public class FileUtils {

    public static void save(Product[] products, String fileName) throws IOException { // tworzy i zapisuje w pilku wartosci, metoda ma zadeklarowany wujętek IOException więc trzeba bedzie go obsłużyć
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));

        for (Product product : products) {
            //mleko;mlekowita;2.5 -  to ma być zapisane w pliku
            writer.write(product.toCsv()); // wpiszemy do pliku dane z metody to csv
            writer.newLine();// każdy wiersz w pliku ma reprezentować osobny obiekt i musimy dodać enter
        }
        writer.close(); //zamykamy abysmy mieli pewnosć ze wszystkie dane zostały zapisane i nie potraciliśmy ich w buforze
    }

    // wczytanie informacji z pliku
    static Product[] read(String fileName) throws FileNotFoundException {//wyjątek dodajemy do sygnatury metody i obsłużymy go w klasie tetowej

        Scanner scanner = new Scanner(new File(fileName));
        int lines = countLines(fileName); // wielkosć tablicy
        Product[] result = new Product[lines];//tworzymy tablice o rozmiarze ilości wierszy w pliku
        for (int i = 0; i < lines; i++) {//lub result.lenght, pętla będzie się powtarzała tyle razy ile mamy wierszy w pliku, dopuki hasNextLine() będzie zwracać true, powinniśmy móc wczytać wiersz z pliku i zamienic go na obiekt Product który umieścimy w tej tablicy

            String line = scanner.nextLine();// mleko;Mlekowita;3.2 wiersz z pliku zamisany do zmiennej
            String[] split = line.split("%");// mleko, Mlekowita, 3.2 dzielimy stringa na wyrazy, metoda split przyjmuje separator po którym chcemy podzielic napis czyli u nas będzie to; i w wyniku dostaniemy tablice napisów z tyloma elementami na ile podzielono text
            double price = Double.parseDouble(split[2]);// zamiana stringa na double
            result[i] = new Product(split[0], split[1], price); // obiekt wstawiamy do tablicy result pod obiekt i
        }
        return result; // zwracam tablice w której powinny być utworzone obiekty
    }

    // zliczanie wierszy z pliku
    private static int countLines(String fileName) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(fileName));
        int lines = 0;
        while (scanner.hasNextLine()) {// dopóki jest kolejny wiersz w pliku, to zwiększamy zmienną lines o 1 i przechodzimy do kolejnego wiersza i powtarzamy to tak długo aż nie dojdziemy do końca pliku
            lines++;
            scanner.nextLine();
        }
        return lines; // zwracamy ilość wierszy
    }
}
