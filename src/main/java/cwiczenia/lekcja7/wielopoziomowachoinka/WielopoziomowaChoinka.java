package cwiczenia.lekcja7.wielopoziomowachoinka;

public class WielopoziomowaChoinka {

//    0    / schemat jest taki ze mamy 4 spacje i 0, potem 3 spacje i 000, potem 2 spacje i 000000 itd
//   000
//  00000
// 0000000
//000000000
//


    void drawTree(int n) { // definiujemy pętle która powtórzy się tyle razy il ejest poziomów
        int spaces = n - 1;
        int sings = 1;
        for (int i = 0; i < 5; i++) {
            drawSpaces(spaces - i);
            drawSings(sings + i * 2);
            System.out.println();
        }
    }

    private void drawSpaces(int spaces) {
        for (int i = 0; i < spaces; i++) { // podajemy w tej metodzie ile spacji ma się wyświetlic
            System.out.print(" "); // ważne print a nie println
        }
    }

    private void drawSings(int number) {
        for (int i = 0; i < number; i++) { // podajemy w tej metodzie ile znaków np 0 ma się wyświetlic
            System.out.print("0"); // ważne print a nie println
        }
    }
}
