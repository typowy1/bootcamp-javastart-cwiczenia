package cwiczenia.lekcja7.wielopoziomowachoinka;

import java.util.Scanner;

public class TreeTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę poziomów");
        int levels = scanner.nextInt();
        WielopoziomowaChoinka wielopoziomowaChoinka = new WielopoziomowaChoinka();
        wielopoziomowaChoinka.drawTree(levels);
    }
}
