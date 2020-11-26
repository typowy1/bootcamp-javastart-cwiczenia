package cwiczenia.lekcja14.zadanie6przegladsamochodow;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class DataManager {

    // zapis i odczyt z pliku!!

    //przyjmie kolejke jako parametr kolejke, zapisze wszystko co w tej kolejce się znajduje do pliku csv
    public static void writeToFile(Queue<Vehicle> vehicles, String fileName) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName));//definiujemy i podajemy do jakiego pliku chcemy coś zapisać
        // kożystając z pentli będziemy zapisywali wszystkie obiekty z kolejki
        while (!vehicles.isEmpty()) { // dopoki kolejka nie jest pusta to pobieramy kolejny obiekt z kolejki i zapisujemy go do pliku
            Vehicle vehicle = vehicles.poll(); //pobieramy kolejny obiekt z kolejki
            bufferedWriter.write(vehicle.toCsv()); // wiersz zapisujemy go do pliku, metoda zwróci opis obiektu w formie csv ;
            bufferedWriter.newLine();// przechodzimy do kolejnego wiersza
        }
        bufferedWriter.close(); //trzeba go zamknąć bo inaczej utracimy część metod
    }

    //czytanie danych z pliku i odtworzenie kolejki z stanem z przed zamknięcia aplikacji
    static Queue<Vehicle> readFile(String fileName) throws FileNotFoundException {
        //metoda zwróci kolejkę pojazdów, odczytana z pliku w ktorym dane zostały zapisane po zamknieciu programu
        Scanner scanner = new Scanner(new File(fileName));
        Queue<Vehicle> vehicles = new LinkedList<>(); // tworzymy pustą kolejkę
        while (scanner.hasNextLine()) { // do pętli będziemy dodawali kolejne pojazdy, dopóki jest kolejny wiersz od odczytania to wczytujemy kolejny wiersz z pliku
            String line = scanner.nextLine();//wczytujemy kolejny wiersz z pliku samochód;wwwww;rrrr;2011;200000;6567cdjshgg
            // dzielimy na mniejsze wyrazy
            String[] split = line.split(";"); //dzielimy wiersz na wyrazy, dzieli ;, samochód wwwww rrrr 2011 200000 6567cdjshgg
            // tworzymy nowy obiekt
            Vehicle vehicle = new Vehicle(split[0], split[1], split[2], Integer.valueOf(split[3]), Integer.valueOf(split[4]), split[5]);// utowrzylismy pojazd z danych z pliku
//dodajemy pojazd do koleji
            vehicles.offer(vehicle);
            //jeżeli plik bedzie pusty to petla nie wykona sie ani razu i zwrocimy pusta linked list z kolejki
        }
        return vehicles; //jezeli plik ma dane to zwrocimey je do kolejki vehicles
    }

}
