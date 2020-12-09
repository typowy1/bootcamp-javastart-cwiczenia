package prework2.prework.struktury_sterujace_if_switch.struktura_if;

public class NumberComparison {
    public static void main(String[] args) {
        int a = 10;
        int b = 100;
        int c = 50;

        if (a > b) {
            if (a > c) {// nawiasów { nie musi być jeśli do wykonania jest tylko jedna instrukcja
                System.out.println("A jest większ od B oraz od C");
            } else {
                System.out.println("A jest większe od B, ale mniejsze od C");
            }
        } else {
            System.out.println("A jest mniejsze od B");
        }
    }
}
