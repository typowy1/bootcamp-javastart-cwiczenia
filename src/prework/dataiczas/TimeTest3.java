package prework.dataiczas;

import java.time.LocalDate;

public class TimeTest3 {

    public static void main(String[] args) throws InterruptedException {

        //Prosty program, który porówna dwie daty:
        LocalDate now = LocalDate.now();
        LocalDate firstJan2014 = LocalDate.of(2014, 1, 1);

        boolean check = now.isAfter(firstJan2014);
        System.out.println("Czy " + now + " jest po " + firstJan2014 + "?");// ssprawdzamy czy dzis jest po 2014 firstJan2014
        System.out.println(check);
    }
}
