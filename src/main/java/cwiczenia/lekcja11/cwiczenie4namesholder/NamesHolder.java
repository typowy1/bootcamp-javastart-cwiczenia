package cwiczenia.lekcja11.cwiczenie4namesholder;

import java.util.Arrays;

public class NamesHolder {

    private String[] names;
    private int index = 0;

    public NamesHolder(int size) {
        names = new String[size];
    }

    void add(String name) throws DuplicateException {/// dodanie stringa do tablicy, do tablicy names pod dany index wstawiamy wartosć którą nam ktoś przypisuje
        if (name == null) {
            throw new NullPointerException("Name cannot be null");
        }
        if (index == names.length) { // sprawdzamy czy nie chcemy dodac więcej wartosci niż wielkosć tablicy
            throw new ArrayIndexOutOfBoundsException("Nie możesz dodać więcej wartości niż wielkosć tablicy");
        }
        if (contains(name)) { // sprawdzamy duplikat, nie ma sensu sprawdzać jeżeliw tablicy nie będzie miejsca, pierw sprwdzmy czy w tablicy jest miejsce
            throw new DuplicateException();
        }
        names[index] = name;
        index++;
    }

    boolean contains(String name) { // sprawdzamy czy zawiera daną wartość w tablicy
        if (name == null) {
            throw new NullPointerException("Name cannot be null"); //rzucamy wyjątek
        }
        for (int i = 0; i < index; i++) { // pętla potórzy się tyle razy ile jest wartść index, czyli ile wartosci dodaliśmy do tablicy, nie mylić z wielkością tblicy
            if (name.equals(names[i])) {
                return true;
            }
        }
        return false;
    }

    int size() { // zwraca ile ktoś wartosci dodał do tablicy
        return index;
    }

    @Override
    public String toString() {//zwrócimy wszystkie obiekty z tablicy
        String result = "";
        for (int i = 0; i < index; i++) {
            result += names[i];
            if (i < index - 1) {
                result += ", "; // dodanie przecinka
            }
        }
        return result;
    }

    void remove(String name) { //usówanie elementów z tablicy i przesówanie o 1 w lewo
        if (name == null) {
            throw new NullPointerException("Name cannot be null"); //rzucamy wyjątek
        }
        int indexToRemove = -1;
        for (int i = 0; i < index && indexToRemove == -1; i++) {
            if (name.equals(names[i])) {
                indexToRemove = i;
            }
        }
        shiftLeft(indexToRemove);
        index--;
        // można też użyć ArrayUtils.remove(test, 2);
    }

    private void shiftLeft(int startIndex) {

        for (int i = startIndex; i < index; i++) {
            if (i == names.length - 1)
                names[i] = null;
            else
                names[i] = names[i + 1];
        }
    }
}
