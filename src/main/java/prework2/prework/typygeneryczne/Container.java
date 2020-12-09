package prework2.prework.typygeneryczne;

public class Container<T> {// pod t wstawiamy dany typ np String
    private T[] array; // moze być tablica typu String lub typu Integer, nie można wstawić tablicy  typu prostego np int

    public T[] getArray() { // zwraca tablice typu t, czyli w zalezności co przypiszemy np tablice typu String, Integer
        return array;
    }

    public void setArray(T[] array) {
        this.array = array;
    }

    public T getElement(int index) { // zwraca element tablicy o indeksie
        return array[index];
    }

    public void printArray() { // wyświetli wszystkie elementy z tablicy danego typu
        for (T t : array) {
            System.out.println(t);
        }
    }

//    Pozbyliśmy się już informacji o tym, ze przechowujemy dane w tablicy typu Object. W zamian za to mamy tablicę typu
//    T - czyli dowolnego typu, który podamy przy tworzeniu obiektu klasy Container. Dodatkowo dodaliśmy metodę get(),
//    która zwraca element z tablicy o indeksie index. Co ważne metoda ta także zwraca "coś" typu T.
    // uniwersalna klasa za pomoca której będzie można twożyc obiekty różnego typu, w tym wypadku tablice
}
