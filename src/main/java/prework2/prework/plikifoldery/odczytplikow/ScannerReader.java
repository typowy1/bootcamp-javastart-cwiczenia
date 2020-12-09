package prework2.prework.plikifoldery.odczytplikow;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerReader {
    // odczyt plików

//    boolean hasNextLine() - sprawdza, czy w pliku jest jeszcze kolejny wiersz do odczytania,
//    String nextLine() - wczytuje i zwraca kolejny wiersz z pliku.
//Jeżeli w pliku mamy zapisany np. ciąg liczb to analogicznie moglibyśmy używać metod typu hasNextInt() i nextInt(), przy
//    czym metoda hasNextInt() traktuje jako separator pomiędzy liczbami dowolny biały znak, np. spację, albo tabulator,
//    a nie tylko enter.
//Metoda hasNextLine() pozwoli nam więc sprawdzić warunek "czy w pliku jest jeszcze coś do wczytania" a metoda nextLine()
//    wczyta te dane jeśli istnieją.

    public static void main(String[] args) throws FileNotFoundException {
        String fileName = "testFile.txt"; // zmienną przechowującą nazwę pliku
        File file = new File(fileName); //obiekt typu File reprezentujący ten plik
        Scanner scanner = new Scanner(file);// scanner przyjmuje obiekt file

        int lines = 0; //zmienną lines, która posłuży nam do zliczenia ilości wierszy w pliku
        while (scanner.hasNextLine()) {
            //dopóki z pliku jest jeszcze kolejny wiersz tekstu scan.hasNextLine() to go wczytaj i wyświetl oraz zwiększ zmienną lines o 1".
//            Kiedy dojdziemy do ostatniego wiersza pliku, metoda hasNextLine() zwróci false, a więc pętla się zakończy.
            String name = scanner.nextLine();
            System.out.println(name);
            lines++;
        }
        System.out.println("ilość wierszy w pliku: " + lines); //Wyświetlamy wtedy wartość zmiennej lines
        scanner.close();// trzeba paiętać aby zamykać strumienie
    }

//    Konstruktor przyjmujący jako argument obiekt typu File deklaruje kontrolowany wyjątek FileNotFoundException, który
//    dla czytelności kodu zadeklarowaliśmy w metodzie main() poprzez throws, jednak w realnym programie dobrze byłoby
//    użyć w tym miejscu bloku try-catch i poinformować użytkownika o błędzie.
    //    przy odczycie plików idealna jest pętla while
}
