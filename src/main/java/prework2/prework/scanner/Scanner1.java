package prework2.prework.scanner;

import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // odczyt ze standarowego wejścia
        //pobieranie danych zaczyna się od słowa next
        System.out.println("Wprowadź swoje imię");
        String firstName = input.nextLine();// pobiera String
        System.out.println("Wprowdź swoje nazwisko");
        String lastName = input.nextLine();
        System.out.println("Podaj swój wiek");
        int age = input.nextInt();// do pobrania liczb całkowitych, brak znaku białej lini czyli"\n",
        // wywołujemy na koniec aplikacji jesli wywołamy wcześniej to już nic nie wczytamy na tym obiekcie,
        // pozbywamy się entera który jest po nextint
        input.nextLine();
        // jeżeli chcemy dodać ją to po nextInt trzeba wywołać odrazu nextLine
        input.close();// powoduje zamknięcie strumienia wejścia, wywołuj ją na końcu aplikacji ponieważ
        // nie będziesz mieć już możliwości odczytania czegokolwiek z konsoli

        System.out.println("Cześć " + firstName + " " + lastName);
        System.out.println("Masz już " + age + ". starość nie radość");
    }
}
