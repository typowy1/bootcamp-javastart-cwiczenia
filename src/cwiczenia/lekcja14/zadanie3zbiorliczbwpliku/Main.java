package cwiczenia.lekcja14.zadanie3zbiorliczbwpliku;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

// kożystamy z zbiorów bo przechowuja unikalne wartosci, w tym przykładzie użyjemy TreeSet czyli sortowania elementów
        // mamy wyciągnąć najwiekszą i najmniejsza wartosć treeset nam to załatwi dlatego że sortuje rosnąco i wyciągniemy 1 i ostatnią wartosć
        try {//wczytaj wszystkie liczby z pliku i wyświetl
            Scanner scanner = new Scanner(new File("lekcja13zadanie3.txt")); // odczytywanie pliku
            int count = 0; //zapisujemy zlicznone liczby
            TreeSet<Integer> numbers = new TreeSet<>();// definiujemy zbiór
            while (scanner.hasNextLine()) {// sprawdzamy czy jest kolejny wiersz
                int next = scanner.nextInt();//wczytanie kolejnej liczby
                numbers.add(next); // wczytujemy wartosc do zbioru(duplikaty zostaną odsiane), w rzecywistosci dodajemy obiekt typu Integer, nie jawnie zachodzi autoboxing
                count++;//zliczamy wystapienie liczby
            }

//            liczbę wszystkich liczb, jaka była w pliku
            System.out.println("ilość liczb w pliku " + count);

//            liczbę unikalnych liczb, jaka była w pliku
            System.out.println("Ilość unikalnych liczb, jaka była w pliku " + numbers.size());

//            najmniejsza wartosć
            System.out.println("najmniejsza wartosć " + numbers.first());

//            największa wartosć
            System.out.println("największa wartosć " + numbers.last());
        } catch (FileNotFoundException e) {
            System.err.println("Nie udało się odczytać pliku lekcja13zadanie3.txt");
        }
    }

}
