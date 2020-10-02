package prework.zmienne;

import org.w3c.dom.ls.LSOutput;

public class Restaurant {
    public static void main(String[] args) {

        final String dishNAme ="Makaron Tajski z wieprzowiną"; // zmienna finalna, raz przypisana wartość nigdy nie może już być zmieniona
        double price = 19.9;

        System.out.println(dishNAme);
        System.out.println("Cena: " + price + "zł");

        int amount = 5;
        double totalPayment = price * amount;

        System.out.println("Twoje zamówienie: " + dishNAme + " x" + amount);
        System.out.println("Cena do zapłaty: " + totalPayment + "zł");

        //dishNAme = "Makaron Tajski z kurczakiem";
        System.out.println(dishNAme);
    }
}
