package prework2.prework.typygeneryczne;

public class StringContainer {

    private String[] array;

    public String[] getArray() {
        return array;
    }

    public void setArray(String[] array) {
        this.array = array;
    }

    public void printArray() {
        for (String s : array) {
            System.out.println(s);
        }
    }

    public void printStringArray() { // wyświetli wszystkie elementy z tablicy Stringów
        for (String t : array) {
            System.out.println(t);
        }
    }
}
