package cwiczenia.lekcja6.user;

import java.util.Scanner;

public class userManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1 rozwiązanie tworzymy konstruktor bez parametrów
        User user = new User();
        System.out.println("Imię");
        user.setFirstName(scanner.nextLine()); // w parametrze przekazujemy wpisane imię przez użytkownika
        System.out.println("Nazwisko");
        user.setLastName(scanner.nextLine());
        System.out.println("Wiek");
        user.setAge(scanner.nextInt());// tu pozostaje znak enetera i usuniemy go nextLine()
        scanner.nextLine();
        System.out.println("Pesel");
        user.setPesel(scanner.nextLine());

        System.out.println(user.getFullInfo());

        // drugi sposób jest lepszy, ten stosuj, pierw podajesz dane potem tworzysz obiekt
//        pierw tworzymy zmienne i prosimy użytkownika o ich wpisanie, następnie zmienne wywołujemy
//        obiekt user i wrzucamy smienne do konstruktora
        //Można dodać dodatkową metodę tworzącą użytkownika, jest w klasie UserCreator
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

        User user1 = new User(firstName, lastName, age, pesel);
        System.out.println(user1.getFullInfo());

        //tworzenie obiektu i wczytywanie danych do pól przenieślismy do metody create
        UserCreator userCreator = new UserCreator();
        User user3 = userCreator.create();
        User user4 = userCreator.create();
        System.out.println(user3.getFullInfo());
        System.out.println(user4.getFullInfo());
    }
}
