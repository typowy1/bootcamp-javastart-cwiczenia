package prework.wyjątki.trycatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Podaj liczbę");
//        int number = 0;
//
//        try{
//            number = scanner.nextInt();
//            System.out.println("Wczytano liczbe");
//        }catch (InputMismatchException ex){
//            System.err.println("Podana wartość nie jest liczbą całkowitą");
//            ex.printStackTrace();
//        }
//        System.out.println("Podałes liczbę " + number);
//        scanner.close();


        // można też inaczej obsłużyc, pętla
//        System.out.println("Podaj liczbę");
//        int number = 0;
//
//        boolean error = true;
//        do {
//            try {
//                number = scanner.nextInt();
//                error = false;
//                System.out.println("Wczytano poprawną liczbe");
//            } catch (InputMismatchException ex) {
//                System.err.println("Nie podałeś liczby całkowitej spróbuj jeszcze raz:");
//                scanner.nextLine();pozbywamy się zapętlenia
//            }
//        }while (error);
//        System.out.println("Podałes liczbę " + number);
//        scanner.close();


        //Try multi-catch, kilka wyjątków

//        int[] numbers = new int[2];
//        boolean error = true;
//        do {
//            try {
//                System.out.println("Podaj 1 liczbę: ");
//                numbers[0] = sc.nextInt();
//                System.out.println("Podaj 2 liczbę: ");
//                numbers[1] = sc.nextInt();
//
//                System.out.println("Którą wartość wyświetlić (1 lub 2)? ");
//                System.out.println("Liczba:" + numbers[sc.nextInt() - 1]);
//                error = false;
//            } catch (InputMismatchException ex) {
//                System.out.println("Nie podałeś liczby całkowitej, spróbuj jeszcze raz: ");
//                sc.nextLine(); // zamiast zapisywać to dwa razy można użyć słowa finally, niżej w przykładzie!
//            } catch (ArrayIndexOutOfBoundsException ex) {
//                System.out.println("Miało być 1 lub 2, zacznijmy od nowa: ");
//                sc.nextLine();
//            }
//        } while (error);
//        sc.close();

        // kilka wyjątków  można też tak zapisać

//        try{
//            //kod z błędami
//        }catch (InputMismatchException | ArrayIndexOutOfBoundsException ex){
//            //dowolne instrukcje, np.:
//            ex.printStackTrace();
//        }

//        Jeżeli chcemy obsłużyć kilka wyjątków w jednym bloku catch, to możemy także przechwycić typ, który jest nadrzędny
//        dla typów, które chcemy obsłużyć. Przykładowo jeśli chcemy obsłużyć ArrayIndexOutOfBoundsException i NullPointerException,
//                to możemy obsłużyć nadrzędny dla nich RuntimeException lub jeszcze wyżej Exception:

//        try{
//
//            //kod z błędami
//        }catch (Exception ex){
//            //dowolne instrukcje, np.:
//            ex.printStackTrace();
//        }

//        W praktyce lepiej definiować osobne bloki catch() dla różnych typów wyjątków, bo dzięki temu jesteśmy w stanie
//        dostarczyć użytkownikowi naszej aplikacji bardziej precyzyjną informację niż "wystąpił błąd".

//        finally - część kodu która wykona się zawsze, czyli zamiast zapisywać coś dla kilku wyjątków możemy użyć

        int[] numbers = new int[2];
        boolean error = true;

        do {
            try {
                System.out.println("Podaj 1 liczbę: ");
                numbers[0] = sc.nextInt();
                System.out.println("Podaj 2 liczbę: ");
                numbers[1] = sc.nextInt();

                System.out.println("Którą wartość wyświetlić (1 lub 2)? ");
                System.out.println("Liczba:" + numbers[sc.nextInt() - 1]);
                error = false;
            } catch (InputMismatchException ex) {
                System.out.println("Nie podałeś liczby całkowitej, spróbuj jeszcze raz: ");
            } catch (ArrayIndexOutOfBoundsException ex) {
                System.out.println("Miało być 1 lub 2, zacznijmy od nowa: ");
            } finally {
                sc.nextLine(); //wykona się zawsze, niezależnie, czy wyjątki wystąpią, czy nie
            }
        } while (error);
        sc.close();

        //stack trace - stos wywołań metod

    }
}
