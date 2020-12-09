package prework2.prework.scanner;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);// tworzymy obiekt typu scanner
        System.out.println("Podaj wiek");
        int age = scanner.nextInt();// tu pozostaje znak entera którymi zatwierdzamy te liczby
        // czyli podając 25\n dodajemy znak nowego wiersza, to samo dzieje się w przypadku nextdouble
        //     scanner.nextLine();// po wczytaniu liczby dajemy next line, pozwoli pozbyć sie zbędnych enterów,
        //     stosujemy nextline po wrpowadzeniu liczb i przed stringiem który chcemy wprowadzić,
        //     next int i nextdouble mogą być po sobie

        System.out.println("Podaj wypłatę");
        double paymant = scanner.nextDouble(); // 8500\n czyli tu mamy juz dwa entery

        scanner.nextLine();
        System.out.println("Podaj imię");
        String name = scanner.nextLine();
        //scanner.nextLine();


        System.out.println("Cześć: " + name);
        System.out.println("Twój wiek to:  " + age);
        System.out.println("Twója wypłata to:  " + paymant);


    }
}
