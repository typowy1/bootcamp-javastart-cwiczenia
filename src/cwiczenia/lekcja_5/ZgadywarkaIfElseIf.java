package cwiczenia.lekcja_5;

public class ZgadywarkaIfElseIf {
    public static void main(String[] args) {
//Spójrz na poniższe dwa fragmenty kodu. Czy są one sobie równoznaczne, czy wynik ich działania może być różny?
        int number = 101;

        if (number > 0) {// tu zawsze wykona się jeden z dwóch bloków
            System.out.println("Liczba większa od 0");
        } else if (number > 100) {
            System.out.println("Liczba większa od 100");
        }

        System.out.println("<<<<<<<");
        if (number > 0) { // przy osobnych if za każdym razem będziemy mieli sprawdzanie warunku
            System.out.println("Liczba większa od 0");
        }
        if (number > 100) {
            System.out.println("Liczba większa od 100");
        }

    }
}
