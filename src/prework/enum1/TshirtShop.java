package prework.enum1;

import java.util.Scanner;

public class TshirtShop {
    public static void main(String[] args) {
        System.out.println("Dostępne rozmiary:");
//        Dzięki metodzie values() kod można uczynić dużo bardziej uniwersalnym. Możemy np. zastąpić wyświetlanie dostępnych rozmiarów na pętlę:
        for (Size s : Size.values()) {
            System.out.println(s.getDescription());
        }


        Tshirt tshirt = new Tshirt();
        tshirt.setSize(Size.MEDIUM); //dodawanie enuma
        System.out.println(tshirt.getSize());
        System.out.println("Rozmiar Tshirta: " + tshirt.getSize().getDescription());
//        Do wartości typu wyliczeniowego odwołujemy się jak do statycznych pól klasy.

        //Metody Enum

        //valueOf(String name) - przyjmuje nazwę typu i zwraca wartość typu Enum. Nazwa musi być zgodna z nazwą wartości z uwzględnieniem wielkości liter

        Size smallSize = Size.valueOf("SMALL"); //zwraca Size.SMALL

        //name() - zwraca nazwę wartości, np.

        String smallName = Size.SMALL.name(); //"SMALL"
        String mediumName = Size.MEDIUM.name(); //"MEDIUM"

//        ordinal() - zwraca numer wartości poczynając od 0. Np.:

        int smallNumber = Size.SMALL.ordinal(); //0
        int mediumNumber = Size.MEDIUM.ordinal(); //1

//        values() - zwraca tablicę wszystkich wartości zdefiniowanych w danym enumie

        Size[] values = Size.values(); // SMALL, MEDIUM, LARGE


        // wczytywanie wartości od użytkownika
        Scanner sc = new Scanner(System.in);
        System.out.println("Wybierz rozmiar: ");
        String sizeDesc = sc.nextLine(); // np. "Mały" // użytkownik dodaje
        Size size = Size.fromDescription(sizeDesc); // wpisaliśmy wartość od użytkownika i jeśli będzie równa wartości Enum to zwróci wartosć enum
        Tshirt tshirt1 = new Tshirt();
        tshirt1.setSize(size);// wstawiamy wartość podaną od użytkownika
        System.out.println("Wybrałeś tshirt w rozmiarze: " + tshirt1.getSize().getDescription());

    }
}
