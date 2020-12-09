package prework2.prework.kolekcja_i_metody.listy;

import java.util.LinkedList;

public class LinkedLists1 {
    public static void main(String[] args) {
        LinkedList<Integer> ints = new LinkedList<>();

        for (int i = 0; i < 100; i++) {
            ints.add(i); // obiekty Integer, nie int!
        }
        System.out.println("ints.get(50) = " + ints.get(50));
        System.out.println("Ilość elementów na liście: " + ints.size());
        System.out.println("Czyszczę tablicę:");
        ints.clear();
        System.out.println("Ilość elementów na liście: " + ints.size());

        //różnica

//        LinkedList - lista podójnie wiązana i dwu kierunkowa, tworzony jest węzeł opakowujący obiekt, każdy z wezóów
//        jest powiązany z poprzednim węzlem i następnym
        //Kiepska wydajnosć większości operacji
        // tak naprawde wiemy gdzie jest 1 elemeny i ostatnii, nie wiemy ile elementów jest posrodku
        // szybciej się dodawaniepierwszego element  (dodwanie poprostu nowego węzła),
        // a w arraylist trzeba przesunąć wszystkie elementy w prawo
        // bardzo żadko używana,


    }
}
