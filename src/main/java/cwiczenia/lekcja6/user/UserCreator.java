package cwiczenia.lekcja6.user;

import java.util.Scanner;

public class UserCreator {

    // metoda towrzy obiekt i wczytuje dane od użytkownika do pól klasy user, dlatego mamy typ metody user
    User create() {// musi być typ user bo musimy zwrócić informacje o polach z obiektu
        Scanner scanner = new Scanner(System.in);
        System.out.println("Imię");
        String firstName = scanner.nextLine();
        System.out.println("Nazwisko");
        String lastName = scanner.nextLine();
        System.out.println("Wiek");
        int age = scanner.nextInt();
        ;// tu pozostaje znak enetera i usuniemy go nextLine()
        scanner.nextLine();
        System.out.println("Pesel");
        String pesel = scanner.nextLine();
//        teraz wywołujemy obiekt i wrzucamy zmienne do obiektu

        User user = new User(firstName, lastName, age, pesel);
        return user;
    }
}
