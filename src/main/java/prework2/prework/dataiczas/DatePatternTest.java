package prework2.prework.dataiczas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DatePatternTest {
    //wczytanego od użytkownika, możemy utworzyć obiekt LocalDate korzystając z metody parse().
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tworzę nowe wydarzenie.");
        System.out.println("Podaj datę w formacie dd-MM-yyyy");

        DateTimeFormatter datePattern = DateTimeFormatter.ofPattern("dd-MM-yyyy");// tworzenie formatu czasu
        String dateInput = sc.nextLine();// pobieranie daty od użytkownika
        LocalDate createdDate = LocalDate.parse(dateInput, datePattern);// za pomocą LocalDate.parse date z stringa przekształcam na date
        System.out.println("Wydarzenie utworzone na dzień " + createdDate);

//        2 podejście

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Tworzę nowe wydarzenie.");
//        System.out.println("Podaj dzień");
//        int day = sc.nextInt();
//        System.out.println("Podaj miesiąc");
//        int month = sc.nextInt();
//        System.out.println("Podaj rok");
//        int year = sc.nextInt();
//
//        LocalDate createdDate = LocalDate.of(year, month, day);
//        System.out.println("Wydarzenie utworzone na dzień " + createdDate);

        //Oczywiście w niektórych sytuacjach takie podejście również może mieć swoje plusy.

    }
}
