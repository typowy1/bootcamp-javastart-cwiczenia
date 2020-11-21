package cwiczenia.lekcja15.cwiczenie3_sortowaniekomputerow3;

import java.util.Comparator;

public class NameComparator implements Comparator<Computer> {

    //przy zabezpieczeniu przeciw null trzeba napisac comperatory w osobnej klasie
    //komparatory były odporne na porównywanie wartości null
    @Override
    public int compare(Computer comp1, Computer comp2) {
        if (comp1 == null && comp2 == null)// jeżeli nazwa comp1 i 2 jest równa null
            return 0;
        if (comp1 != null && comp2 == null)
            return -1;
        if (comp1 == null && comp2 != null)
            return 1;
        //tu dla porównania referencji, po to String czyli obiekt
        if (comp1.getName() == null && comp2.getName() == null)
            return 0;
        if (comp1.getName() == null)
            return -1;
        return comp1.getName().compareTo(comp2.getName());
    }
}
