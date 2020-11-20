package cwiczenia.lekcja15.cwiczenie3_sortowaniekomputerow3;

import java.util.Comparator;

public class MemoryComparator implements Comparator<Computer> {

    @Override
    public int compare(Computer comp1, Computer comp2) {
        if (comp1 == null && comp2 == null)
            return 0;
        if (comp1 != null && comp2 == null)
            return -1;
        if (comp1 == null && comp2 != null)
            return 1;
        return Integer.compare(comp1.getMemory(), comp2.getMemory());
    }
}
