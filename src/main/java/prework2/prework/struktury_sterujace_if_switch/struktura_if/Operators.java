package prework2.prework.struktury_sterujace_if_switch.struktura_if;

public class Operators {

    void compareNumbers(int x, int y) {
        if (x > y) {
            checkPositiveNumber(x, y);
        } else {
            System.out.println(x + " nie jest większy od " + y);
        }
    }

    private void checkPositiveNumber(int x, int y) {
        if (x > 0) {
            System.out.println(x + " jest większe od " + y);
        } else {
            System.out.println(x + " jest większe od " + y + ", ale mniejsze od 0");
        }
    }
}
