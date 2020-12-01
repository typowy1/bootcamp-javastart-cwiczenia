package cwiczenia.lekcja14.zadanie5_kolejka_kwadratow;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //uzytkownik wpisuje ilosć liczb które będzie wpisywał
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę elementów");
        int count = scanner.nextInt();
        scanner.nextLine();

        //tworzymy kolejke, prioretytowa, dlatego że określamy priorytet wyswietlania liczb, rosnąco
        Queue<Integer> numbers = new PriorityQueue<>();
        for (int i = 0; i < count; i++) {// wykonamy petel tyle razy ile uzytkownik wpisał

            System.out.println("Podaj liczbę " + (i + 1)); // dodanie licznika podaj liczbe 1 itd
            numbers.offer(scanner.nextInt()); // wprowadzenie liczby przez użytkownika i dodanie jej do kolejki
            scanner.nextLine(); // żeby wyczyścic buffor
        }

        //wyświetlamy wszystkie elementy w kolejce i monożymy przez siebei
        while (!numbers.isEmpty()) {//dopóki kolejka nie jest pusta
            Integer number = numbers.poll();// pobieramy element, poll - pobierz elment i usuń z kolejki
            System.out.println(number * number); // i wyświetlamy kwadrat liczb rosnąco
        }
        System.out.println(numbers.size());// na końcu kolejka będzie pusta
    }// przy pętli for kolejnosć nie będzie zachowana
}
