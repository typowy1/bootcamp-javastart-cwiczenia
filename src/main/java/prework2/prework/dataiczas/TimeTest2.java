package prework2.prework.dataiczas;

import java.time.LocalTime;

public class TimeTest2 {

//    LocalTime klasa

    //ak jak w klasie Instant również tutaj znajdziemy metody takie jak isBefore() / isAfter(), a także użyteczny zestaw
    // metod typu plus i minus, które tak jak wspomnieliśmy pozwolą przesunąć czas.
    //
    //Przykładowy program, który ustawia zegarek na godzinę aktualną, a następnie co sekundę (przez 10 kolejnych sekund)
    // wyświetla zaktualizowaną godzinę.

    public static void main(String[] args) throws InterruptedException {

        LocalTime now = LocalTime.now(); // aktualna godzina, minuta i sekunda, do daty dodajemy jedną sekunde

        for (int i = 0; i < 10; i++) {
            System.out.println(now);
            now = now.plusSeconds(1);// now.plusSeconds(1) żeby zadziałało trzeba przypisać do zmiennej
            Thread.sleep(1000);// usypiamy wątek na wskazany przedział czasowy
        }


//        Metody
//        getHour() - zwraca godzinę czasu, którą reprezentuje ten obiekt,
//        getMinute() - zwraca minutę czasu, którą reprezentuje ten obiekt,
//        getSecond() - zwraca sekundę czasu, którą reprezentuje ten obiekt.


    }

}
