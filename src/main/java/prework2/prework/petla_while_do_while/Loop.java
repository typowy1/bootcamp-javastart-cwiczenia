package prework2.prework.petla_while_do_while;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        // nie znamy liczby iteracji, nie anamy liczby powtórzen
        // wyświetlanie liczb od 1 do 5

//        int i = 1;
//        while (i <= 5){ // dopóki i jest mniejsze równe 5 to wykonuj pętle
//            System.out.println(i);
//            i++;
//        }
//        System.out.println("Koniec");

        //Podaj liczbę dodatnią
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Podaj liczbę dodatnią");
//        int number = scanner.nextInt();
//
//        while (number <= 0){// można też tak !(number > 0) - i tak jest lepeij
//            System.out.println("Podaj liczbę dodatnią:");
//            number = scanner.nextInt();
//        }
//        System.out.println("Brawo: " + number);

        // do tego lepiej pętle do while, ponieważ kod nam się nie powtarza i pętla wykona się przynajmniej raz

        Scanner scanner = new Scanner(System.in);
        int number = 0;
        do {
            System.out.println("Podaj liczbę dodatnią");
            number = scanner.nextInt();// nawiasy klamrowe wyznaczają zasięg zmiennych

        } while (!(number > 0));
        System.out.println("Twoja liczba dodatnia to: " + number);
    }
}
