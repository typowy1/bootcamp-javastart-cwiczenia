package cwiczenia.lekcja16.cwiczenie3taliakart;

import java.util.ArrayList;
import java.util.List;

public class CardDeckGenerator {

    //generator tari kart


    //    w wyniku dostaniemy talie kart,, wszystkie kombinacje kolorów i wszystkie kombinacje wartosci
    static List<Card> generate() {
        List<Card> deck = new ArrayList<>(); //lista tali kart
        CardColor[] colors = CardColor.values(); // zwraca tablice z wszystkimi enumami z klasy CardColor
        CardValue[] values = CardValue.values(); // zwraca tablice z wszystkimi enumami z klasy CardValue

//        pętla do wstawiania kolorów i wartości do tali czyli listy deck
        for (CardColor color : colors) { // przejdzie po kolorach
            for (CardValue value : values) { // przejdzie po wartosciach
                deck.add(new Card(color, value)); // doda color i value do obiektu Card, który reprezentuje pojedyncza karte
            }
        }
        return deck; // zwracamy talię deck
    }
}
