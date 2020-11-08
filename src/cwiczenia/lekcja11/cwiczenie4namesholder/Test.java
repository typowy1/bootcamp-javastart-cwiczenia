package cwiczenia.lekcja11.cwiczenie4namesholder;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        NamesHolder namesHolder = new NamesHolder(10);
        try {
            namesHolder.add("aaa");
            namesHolder.add("bbb");
            namesHolder.add("cccc");
            namesHolder.add("gggg");
            namesHolder.add("dddd");// dodajemy wartości do tablicy
        } catch (DuplicateException | ArrayIndexOutOfBoundsException e) {
            System.err.println("Informacja dla użytkownika: " + e.getMessage());
            System.err.println("Informacja dla programisty: ");
            e.printStackTrace();
        }

//        System.out.println("Size: " + namesHolder.size()); // sprawdzamy wielkość tablicy
//        System.out.println("Contains? " + namesHolder.contains("null"));// sprawdzamy czy w tablicy jest wartosć
        System.out.println(namesHolder); //wyświetlamy wszystkie wartosci
        namesHolder.remove("dddd");// usówamy zawartość ddd;
        System.out.println(namesHolder);
    }
}
