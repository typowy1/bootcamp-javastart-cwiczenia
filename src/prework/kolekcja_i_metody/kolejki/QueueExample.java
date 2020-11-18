package prework.kolekcja_i_metody.kolejki;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
//        kolejki fifo - linkedlist - ustawia elementy tak jak je wstawiliśmy

        Queue<String> patients = new LinkedList<>();

        patients.offer("Jan Kowalski"); //dodanie lementu do kolejki
        patients.offer("Anna Zawadzka"); //dodanie lementu do kolejki
        patients.offer("Piotr Wodecki"); //dodanie lementu do kolejki

        String peek = patients.peek();// pobranie pierwszego elementu z kolejki, ale go nie usówa, zwraca nam typ zgodny
        // z typem generycznym, pobiera informacje o 1 obiekcie z kolejki
        //   System.out.println(peek);

        //  System.out.println(patients.poll()); //każde jej wywołanie to pobranie kolejnego obiektu z kolejki

        // System.out.println(patients.isEmpty()); // sprawdza czy kolejka jest pósta

        while (!patients.isEmpty()) {
            System.out.println("Pacjent " + patients.peek() + " proszony do gabinetu");
            System.out.println("Pacjent " + patients.poll() + " obsłużony"); //pobieramy pacjenta i usówamy, nastepne wywołanie to następny pacjent
        }

//        kolejki prioretytowe:
//        kolejnosć prioretytowa, albo wynikająca z naturalnego porzadku, czyli liczby rosnaco, napisy alfabetycznie - od unikodu znaku
        //czyli nie wazne jak wstawimy, obiekty zostana prztworzone priretytowo

        Queue<String> patients1 = new PriorityQueue<>();
        patients1.offer("Jan Kowalski"); //dodanie lementu do kolejki
        patients1.offer("Anna Zawadzka"); //dodanie lementu do kolejki
        patients1.offer("Piotr Wodecki"); //dodanie lementu do kolejki

        while (!patients1.isEmpty()) {
            System.out.println("Pacjent " + patients1.peek() + " proszony do gabinetu");
            System.out.println("Pacjent " + patients1.poll() + " obsłużony"); //pobieramy pacjenta i usówamy, nastepne wywołanie to następny pacjent
        }// tu wywołanie będzie alfabetyczne, kolejność się zmieniła bo brana została pod uwagę kolejnosć alfabetyczna

//        kolejka obiektów patent
// tu trzeba określić priorytet, tu trzba skożystać z interfejsu Comparable
        Queue<Patient> patients2 = new PriorityQueue<>();
        patients2.offer(new Patient("Jan Kowalski", "12345")); //dodanie lementu do kolejki
        patients2.offer(new Patient("Anna Zawadzka", "34567")); //dodanie lementu do kolejki
        patients2.offer(new Patient("Piotr Wodecki", "355454834567")); //dodanie lementu do kolejki


        while (!patients1.isEmpty()) {
            System.out.println("Pacjent " + patients1.peek() + " proszony do gabinetu");
            System.out.println("Pacjent " + patients1.poll() + " obsłużony");
        }
    }
}
