package cwiczenia.lekcja15.cwiczenie3_sortowaniekomputerow2;

import java.util.Comparator;

public class MemoryComparator implements Comparator<Computer> {

    // sortujemy rosnąco po memeory
    @Override
    public int compare(Computer comp1, Computer comp2) {
        return Integer.compare(comp1.getMemory(), comp2.getMemory());
        //  return -Integer.compare(comp1.getMemory(), comp2.getMemory()); malejąco
    }
}
