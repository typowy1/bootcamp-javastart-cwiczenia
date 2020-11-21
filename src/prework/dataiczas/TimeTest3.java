package prework.dataiczas;

import java.time.LocalDate;

public class TimeTest3 {

//    klasa local date, prezentacja daty
public static void main(String[] args) throws InterruptedException {

    //Prosty program, który porówna dwie daty:
    LocalDate now = LocalDate.now();
    LocalDate firstJan2014 = LocalDate.of(2014, 1, 1);

    boolean check = now.isAfter(firstJan2014);
    System.out.println("Czy " + now + " jest po " + firstJan2014 + "?");// ssprawdzamy czy dzis jest po 2014 firstJan2014
    System.out.println(check);

    // ile dni mineło od końca roku
    System.out.println(now.getDayOfYear());
    System.out.println(now.getDayOfMonth()); // który mam y dzień miesiąca
    System.out.println(now.getYear()); // pobiera rok
}
}
