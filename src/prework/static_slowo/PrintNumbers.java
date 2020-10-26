package prework.static_slowo;

import java.util.Scanner;

public class PrintNumbers {

    private static final int EXIT = 0;

    private static void printNumbers(int start, int end) {
        for (int i = start; i < end; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int start, end;

        do {
            System.out.println("Pierwsza liczba: ");
            start = input.nextInt();
            System.out.println("Druga liczba: ");
            end = input.nextInt();
            printNumbers(start, end);
            System.out.println("Koniec programu, wprowadź " + EXIT);
            System.out.println("Kontynuuj, wprowadź wartość inną od " + EXIT);

        } while (input.nextInt() != EXIT);
        input.close();

//        Klasa może zawierać pola i metody statyczne.
//                Pola statyczne najczęściej będą połączone ze słowem final i będziemy je wtedy nazywali stałymi.
//                Stałe nazywamy WIELKIMI_LITERAMI.
//                Pola statyczne istnieją tylko w jednym egzemplarzu w ramach całej aplikacji i powiązane są z klasą,
//                niezależnie od tego ile obiektów danej klasy utworzysz.
//                Metody statyczne mogą się odwoływać tylko do innych składowych statycznych
    }
}
