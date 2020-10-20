package prework.petla_while_do_while;

import java.util.Scanner;

public class While {
//https://javastart.pl/kurs/java/java-podstawy-temat-15-petle/lekcja/java-podstawy-petle-while-i-dowhile
    //gdy ilość przebiegów pętli nie jest znana, np. chcemy od użytkownika wczytywać liczby tak długo, dopóki nie
    // poda on pierwszej liczby ujemnej? Wykorzystaj pętlę while lub do...while.
    // nadają się idealnie do wczytywania plików, źródeł stron internetowych

    //while
//dopóki warunek jest prawdziwy powtarzaj kod w pętli.
    //Brzmi to podobnie jak przy pętli for, jednak różnica jest taka, że ponieważ nie występuje tutaj jawny licznik,
    // to ilość przebiegów pętli będzie zazwyczaj uzależniona od jakiegoś warunku uwzględniającego czynnik zewnętrzny - np. dane wczytane od użytkownika lub z pliku.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int number = 500;
        int userInput;

        System.out.println("Zgadnij liczbę");

        while ((userInput = scanner.nextInt()) != number) {// dpoóki liczba w prowadzona od użytkownika jest rózna
            // to wykonuj instrukcje w ciele pętli
            if (userInput > number) {
                System.out.println("Podana liczba jest za duża, zgaduj dalej");
            } else {
                System.out.println("Podana liczba jest za mała, zgaduj dalej");
            }
        }
        System.out.println("Brawo zgadłeś");
        scanner.close();

        //    Tak jak zwykle utworzyliśmy obiekt Scanner do odczytu danych. Kolejne zmienne to:
//
//    number - liczba, którą użytkownik ma zgadnąć,
//    userInput - tymczasowa zmienna, która pozwoli przechowywać informację o liczbie wprowadzanej przez użytkownika.
//
//    W pętli while mamy zwartą jednolinijkową konstrukcję, którą można podzielić na dwie części:
//
//    userInput = reader.nextInt() - wczytanie liczby od użytkownika
//            (userInput = reader.nextInt()) != number - tutaj następuje porównanie zmiennej userInput z number.
//    Jeśli liczby są różne, to wynikiem porównania będzie true, a jeśli liczby będą równe wynikiem będzie false i
//    tym samym wyjdziemy z pętli

        // wyświetlenie liczb całkowitych od 1 do 5

        int i = 1;
        while (i <= 5) {
            System.out.println("Liczba" + i);
            i++;

            // petla bez konca


            //Wystarczyła jedna zmienna, którą zwiększamy w kolejnych iteracjach za pomocą inkrementacji.
            // Pętla kończy swoje działanie, gdy zmienna i osiągnie wartość 6.


            //Petla do while

            //pętla do while zawsze wykona się przynajmniej jeden raz
            //ponieważ najpierw wykonywany jest kod zawarty w pętli, a dopiero później sprawdzany jest warunek

            int b = 5;
            do {
                System.out.println("Liczba " + b);
            } while (b < 3);

            //Pomimo tego, że warunek pętli jest błędny (zmienna i została zainicjowana wartością 5, więc nie jest
            // mniejsza od 3) to na ekranie i tak pojawia się napis "Liczba 5".


//            Jako podsumowanie tematyki pętli możemy zastosować następujący podział:
//
//            Pętlę for stosuj w przypadku, gdy znana jest liczba iteracji, do usupełniania tablic i modyfikacji.
//            Pętlę for each używaj do przeglądania wszystkich elementów kolekcji, np. tablicy. Nie używaj pętli for each
//        do uzupełniania tablic.
//            Pętlę while używaj w sytuacji, gdy nie znasz ilości iteracji pętli.
//                    Pętlę do while stosuj w sytuacji, gdy nie znasz ilości iteracji pętli, ale musisz mieć gwarancję,
//                    że ciało pętli wykona się przynajmniej raz.
//
//            We wszystkich typach pętli możesz wykorzystywać instrukcje break (przerywa działanie pętli) oraz continue
//            (powoduje przejście do kolejnej iteracji), jednak stosowanie break w pętli for może być uznane za złą praktykę.

            do {
                System.out.println("Zgadnij liczbę");
                userInput = scanner.nextInt();
                if (userInput > number) {
                    System.out.println("Podana liczba jest za duża, zgaduj dalej");
                } else if (userInput < number) {
                    System.out.println("Podana liczba jest za mała, zgaduj dalej");
                }
            } while (userInput != number);
            System.out.println("Brawo zgadłeś");
            scanner.close();
            // czemu tak ponieważ pętla wykona się przynajmniej ra i trzeba się zabespieczyć przed tym że warunek trafi
            // na liczbę mniejszą
        }
    }

}
