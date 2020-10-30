package prework.polimorfizm.livecoding;

import java.util.Scanner;

public class Shop {
    public static void main(String[] args) {
//        Product product1 = new Product("mleko", 2.5);
//        Product product2 = new Product("mleko", 2.5);
//        System.out.println(product1 == product2); // tak nie można porównywac obiektów bo porównamy tylko referencje
//        // a nie równość obiektów

        //Porównanie Stringów
//        String name1 = "Kasia";
//        String name2 = "Kasia";
//        System.out.println(name1 == name2);// tu zwróci true ale nie powinnismy tak robic, dzieje się tak przy wartosciach
//        // podanych na sztywno

//        Scanner scanner = new Scanner(System.in);
//        String name1 = scanner.nextLine();
//        String name2 = scanner.nextLine();
////        System.out.println(name1 == name2); // zwróci false
//        boolean equals = name1.equals(name2);
//        System.out.println(equals);
//        System.out.println(name1.equals(name2));// tak porównujemy, wielkości liter też są ważne

        //Porównanie Obiektów
        Product product1 = new Product("mleko", 2.5);
        Product product2 = new Product("mleko", 2.5);
        System.out.println(product1.equals(product2)); // to zwróci false, tak nie prównujemy całych obiektów, dopiero
        // nadpisana metoda w klasie Produkt zwróci true, porównuje ona zawartość objektu


//        metoda to string zwraca nam informacje o objekcie, napisalismy ją w klasie Produkt, nie trzeba jej wywoływac
//        jawnie wystarczy wstawić samą referencje produkt1

        System.out.println(product1.toString()); // tu zadziała metoda to string
        System.out.println(product1);// tu też zadziała metoda to string, prostrzy zapis, nie trzeba wywowyłać jawnie.
    }
}
