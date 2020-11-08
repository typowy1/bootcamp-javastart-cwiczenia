package prework.wyjątki.livecoding.trycatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayTester {
    public static void main(String[] args) {
        int[] numbers = {3, 5, 10};
        Scanner scanner = new Scanner(System.in);

        System.out.println("Który element chcesz wyświetlić");
        //int index = 0;// zmienne definujemy przed try
        try {// to taki if, jeżeli ktoś poda prawidłową wartosć to catch się nie wykona, jezeli poda złą to to złapie
            // wyjątek i przejdzie do bloku catch, jeżeli wystąpi wyjątek to wykona się to co jest w bloku catch, j
            // eżeli ktoś poda prawidłową wartość ta catch sie nie wykona
            int index = scanner.nextInt();
            System.out.println(numbers[index]);
            System.out.println("Indeks prawidłowy");
        } catch (ArrayIndexOutOfBoundsException ex) { // zbyt duży index dla tablicy
            System.out.println("Nieprawidłowy indeks tablicy");//obsługa wyjątku
            ex.printStackTrace();
        } catch (InputMismatchException ex) {// zła wartość powinna być liczba
            System.out.println("Zła wartosć, wprowadź liczbę");
            ex.printStackTrace();
        } finally {// wykonuje się zawsze, niezaleznie od wystąpienia wyjątku
            System.out.println("To się wykona zawsze");
        }

//        możemy też kilka wyjątków obsłużyć inaczej:

//        try{
//            System.out.println(numbers[index]);
//            System.out.println("Indeks prawidłowy");
//        }catch(ArrayIndexOutOfBoundsException | InputMismatchException ex){ // zbyt duży index dla tablicy
//            System.out.println("Wprowadzono błędne dane");//obsługa wyjątku
//            ex.printStackTrace();
//        }finally {// wykonuje się zawsze, niezaleznie od wystąpienia wyjątku
//            System.out.println("To się wykona zawsze");
//        }

        // lub przechwytując wyjątek nadrzedny w hierarchii
//        try{
//            System.out.println(numbers[index]);
//            System.out.println("Indeks prawidłowy");
//        }catch(RuntimeException ex){ // zbyt duży index dla tablicy, // oba wyjątki dziedziczą po RunTime, dlatego możemy tak zrobic
//            System.out.println("Wprowadzono błędne dane");//obsługa wyjątku
//            ex.printStackTrace();
//        }finally {// wykonuje się zawsze, niezaleznie od wystąpienia wyjątku
//            System.out.println("To się wykona zawsze");
//        }

        // wyjątki możemy rzucać samodzielnie za pomocą throw, rzucanie wyjątku polega na utworzeniu obiektu wyjątku,
        // wyjątek rzucony z metody może zostac przechwycony za pomocą try catch

    }
}
