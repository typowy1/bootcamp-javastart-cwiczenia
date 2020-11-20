package cwiczenia.lekcja15.cwiczenie3_sortowaniekomputerow1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComputerStore {

    public static void main(String[] args) {

        List<Computer> computers = new ArrayList<>();
        computers.add(new Computer("hp 123", 4000, 8192)); //jeden z obiektów jest całkowicie unikalny
        computers.add(new Computer("apple imac27", 3600, 4096)); //kolejne dwa posiadają taką samą nazwę i procesor, ale różną ilość pamięci
        computers.add(new Computer("dell 234", 3600, 8192));
        computers.add(new Computer("apple imac27", 3600, 8192));//ostatni posiada taką samą nazwę jak dwa poprzednie, ale wolniejszy procesor i większą ilość pamięci
        computers.add(new Computer("apple imac27", 3200, 16384)); //kolejne dwa posiadają taką samą nazwę i procesor, ale różną ilość pamięci

        Collections.sort(computers); // sortujemy, musi być metoda do sortowania w obiekcie Computer implements Comparable<Computer>
        //wyświetlamy informacje
        for (Computer computer : computers) {
            System.out.println(computer);
        }
    }
}
