package cwiczenia.lekcja12.cwiczenie3pantadeusz;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileImport {
    //https://bootcamp.javastart.pl/konto/cwiczenie/1207

    public static String readAllFile(String fileName) throws FileNotFoundException {// czytanie pliku
        Scanner scanner = new Scanner(new File(fileName));
        StringBuilder text = new StringBuilder();//StringBuilder()  wydajniejsze niz "", definiujemy zmienną do której wczytam cały nasz text
        while (scanner.hasNextLine()) { // petla ktora bedzie sie powtarzala tak dluga az nie przejdziemy przez caly plik, sprawdzamy czy jest kolejny wiersz do wczytania
            String line = scanner.nextLine(); // jeżeli jest wiersz do wczytania to go wczytujemy
            text.append(line); // dodajemy do zmiennej tekst, duża ilosć tekstu i ta metoda jest wydjaniejsza niż text+=line
        }
        return text.toString(); //zwracamy text, text.toString(), wydajniejsze niz return text.
    }
}
