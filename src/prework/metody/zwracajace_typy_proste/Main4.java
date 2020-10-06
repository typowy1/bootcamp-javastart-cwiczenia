package prework.metody.zwracajace_typy_proste;

public class Main4 {
    public static void main(String[] args) {
        Calculator2 calculator = new Calculator2();
        double result = calculator.add(5.5, 10.5);// metoda zwraca wynik, mozemy jej uzyc w zmiennyvh itd
        // zadeklarowaliśmy zmienną result i jako wartosć podaliśmy metodę
        // która zwraca wynik dodawania doubleyć w wywietleniu info na ekranie
        System.out.println("Wynik " + result);

    }
}
