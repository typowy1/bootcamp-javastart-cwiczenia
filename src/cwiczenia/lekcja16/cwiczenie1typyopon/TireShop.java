package cwiczenia.lekcja16.cwiczenie1typyopon;

import java.util.List;

public class TireShop {

    public static void main(String[] args) {
        List<Tire> tires = List.of(
                new Tire("Michelin", "ABC123", 17, TireType.SUMMER),
                new Tire("Pirelli", "XYZ234", 19, TireType.WINTER),
                new Tire("Dębica", "SUMM15", 15, TireType.UNIWERSAL),
                new Tire("Nokian", "WIN18", 18, TireType.WINTER));

        //wyświetlanie
        for (Tire tire : tires) {
            System.out.println(tire);
        }
    }
}
