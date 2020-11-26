package prework.strumienie;

import java.util.stream.IntStream;

public class Film {

    // strumienie - wygodne przetważanie colekcji np tablic

    //filter - filtruje elementy ktore są w stremie, filter(boolean)

    IntStream stream = IntStream.of(1, 2, 3, 4);
    // straem.filter(x  -> x % 2 == 0) - x parametr w naszym wyrazeniu lambda czyli będzie tu przypisana wartosć z IntStream.of(1, 2, 3, 4);, chcemy tylko takie elementy które przy dzieleniu przez dwa dają 0
// toArray do tablicy
    // operacje na strumieniach mogą byc wykonywane 1 raz

}
