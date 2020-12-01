package cwiczenia.lekcja14.zadanie6przegladsamochodow;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CarManagment {
    // definiuje stałe do obsługi programu, opcje programu
    private static final int OPTION_EXIT = 0;// wyjscie
    private static final int OPTION_ADD_NEW_CAR = 1; //dodanie samochodu
    private static final int OPTION_GET_CAR = 2; // pobranie samochodu do obsłużenia
    private static final String FILE_NAME = "vehicles.csv"; // nazwa pliku
    private static Scanner scanner = new Scanner(System.in); //użyty jes w wiecej niz jednej metodzie

    // pierw dodajemy pojazdy do kolejki potem pobieramy pojazd z kolejki do przegladu i usówamy z kolejki

    public static void main(String[] args) {
        mainLoop();
    }


    //    metoda do logiki aplikacji
// tu bedzie główna pętla programu, główna metoda która będzie wywoływała inne metody, tu będziemy przechowywali inne metody
    // tu tez przechowywac bedziemy pojazdy, czyli storzymy kolejke
    private static void mainLoop() {
        Queue<Vehicle> vehicles = initApp(); //kolejka fifo, firs int first out, kto pierwszy przyjechał ten zostanie obsłużony
//wczytywanie danych od użytkownika, pętla do
        int option = 0;
        do {
            prinOptions();
            option = scanner.nextInt();// uzytkownik podaje opcje
            scanner.nextLine();// pozbywamy się zbędnego entera
            switch (option) {
                case OPTION_EXIT:
                    closeApp(vehicles);
                    break;
                case OPTION_ADD_NEW_CAR:
                    try {// łapiemy wyjątek o nieprawidłowym typie pojazdu podanym przez uzytkownika
                        Vehicle vehicle = createVehicle();
                        // dodajemy pojazd do kolejki vehicles
                        vehicles.offer(vehicle);
                    } catch (IllegalArgumentException e) {
                        System.err.println("Podałeś nieprawidłowy typ pojazdu");
                    }
                    break;
                //pobiera z kolejki kolejny pojazd do obsłużenia
                case OPTION_GET_CAR:
                    getCar(vehicles);// przekazujemy kolejke z pojazdami
                    break;
                default:
                    System.out.println("Nieprawidłowa opcja");
            }
        } while (option != OPTION_EXIT); //wykonujemy tą pętle tak długo dopuki option bedzie różne od OPTION_EXIT
    }

    //sprawdzamy czy kolejka jest pusta i czy powinnismy cos odczytac z pliku
    private static Queue<Vehicle> initApp() { //uruchomi się zaraz po uruchomieniu aplikacji i sprawdzi czy w pliku sa samochody ktore trzeba wgrac do kolejki
        try {
            Queue<Vehicle> vehicles = DataManager.readFile(FILE_NAME); // jezeli plik istnieje to utwozona zostanie kolejka pojazdow i ja zwrocimy
            System.out.println("Odczytano dane z pliku");
            return vehicles;
        } catch (FileNotFoundException e) {
            System.err.println("Nie udało się odczytać pliku" + FILE_NAME);
        }
        return new LinkedList<>(); // jeżeli został żucony wyjątek to zwracamy pustą linkedlist
    }

    //metoda do zamykania programu
    private static void closeApp(Queue<Vehicle> vehicles) {
//        nawet jezeli kolejka bedzie pusat to zostanie plik nadpisany, przez pusty tekst
        try {
            DataManager.writeToFile(vehicles, FILE_NAME); // to sie wykona zawsze niezaleznie czy kolejka jest pusta czy nie
            System.out.println("Zapisano stan aplikacji");
        } catch (IOException e) {
            System.err.println("Nie udało się zapisać pliku");
        }
        // w zależnosci od tego czy kolejka będzie pusta czy nie to będzie cos zapisywać w pliku, plik bedzie zawsze zapisywany i dane beda nadpisywane
//        if(vehicles.isEmpty()) {// jeżeli kolejka jest pusta to wyswietlamy koniec prograu
//            System.out.println("Koniec programu");
//        }else {
//            // jak nie jest pusta to kożystamy z date manager i zapisujemy dane do pliku
//            try {
//                DataManager.writeToFile(vehicles, FILE_NAME);
//                System.out.println("Dane zapisano koniec programu");
//            } catch (IOException e) {
//                System.err.println("Nie udało się zapisać danych do pliku");
//            }
//        }
    }

    // sprawdzamy czy w kolejce jeszcze cos jest
    private static void getCar(Queue<Vehicle> vehicles) { //przekazemy kolejke pojazdow
        if (vehicles.isEmpty()) {
            System.out.println("Brak pojazdów w kolejce");
        } else { // natomiast jezeli się coś w niej znajduje to uzyjemy metody poll, pobiera pierwszy obiekt z kolejki i go z niej usówa
            Vehicle vehicle = vehicles.poll(); // zwraca obiekt z kolejki i usówa
            System.out.println("Pojazd do przeglądu: " + vehicle.getBrand() + " " + vehicle.getModel());
        }
    }

    // uzytkownik będzie podawał opcje
    private static void prinOptions() {
        System.out.println(OPTION_EXIT + " - wyjście z programu");
        System.out.println(OPTION_ADD_NEW_CAR + " - dodanie pojazdu do kolejki");
        System.out.println(OPTION_GET_CAR + " - pobranie pojazdu do przeglądu");
    }

    //metoda wczyta informacje o samochodzie, utworzy ten samochód i go zwróci
    private static Vehicle createVehicle() {
        //wczytujemy informacje od uzytkownika do utworzenia pojazdu
        System.out.println("Podaj typ: ");
        String type = scanner.nextLine();
        // sprawdzamy czy wprowadzony typ jest prawidłowy
        if (!checkType(type)) {// jeśli typ jest nie prawidłowy to żuć wyjątek
            throw new IllegalArgumentException("Nieprawidłowy typ");
        }
        System.out.println("Podaj marke");
        String brand = scanner.nextLine();
        System.out.println("Podaj model");
        String model = scanner.nextLine();
        System.out.println("Podaj rocznik");
        int year = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Podaj przebieg");
        int mileage = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Podaj VIN");
        String vin = scanner.nextLine();
        Vehicle vehicle = new Vehicle(type, brand, model, year, mileage, vin);
        return vehicle;
    }

    // sprawdzenie typu pojazdu któy wprowadził użytkownik czy jest zgodny z naszymi typami dostępnymi w stałych
// zwroci true jezeli typ jest poprawny
    private static boolean checkType(String type) { // porównamy typ przekazany od użytkownika z typami dostepnymi w klasie vehicle
        return Vehicle.TYPE_CAR.equals(type)
                || Vehicle.TYPE_MOTORCYCLE.equals(type)
                || Vehicle.TYPE_TIR.equals(type); // dzięki takiemu zapisowi unikniemy nullpointera
    }
}
