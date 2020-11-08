package cwiczenia.lekcja10.zadanie2unikalnenapisy;

import java.util.Scanner;

public class NextStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Start");
        String previous = scanner.nextLine();
        // String next;
        do {
            String next = scanner.nextLine();
            if (previous.equals(next))
                break;
            previous = next; // jeżeli napisy nie były równe to do previus napisu wczytujemy drugi podany i następnie
            // wczytujemy next i porównujemy z previus
        } while (true);
        System.out.println("stop");
    }
}
