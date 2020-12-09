package prework2.prework.petla_for_for_each;

public class ForAndForEach {
    //https://javastart.pl/kurs/java/java-podstawy-temat-15-petle/lekcja/java-petla-for-i-foreach
    //Pętla for idealnie nadaje się do sytuacji, gdy dokładnie znamy liczbę iteracji, która ma się wykonać lub jeśli
    // chcemy wykonywać pewne operacje na każdym elemencie tablicy
//    Pętlę for wykorzystywać będziemy w sytuacji, gdy z góry wiemy ile razy mają wykonać się pewne instrukcje.
//    Na przykład jeśli wcześniej znamy rozmiar tablicy i chcemy ją uzupełnić kolejnymi liczbami 1, 2, 3, 4, ... N,
//    to pętla for idealnie się do tego nadaje. Podobnie jeśli będziemy chcieli wyświetlić elementy dowolnej tablicy,
//    albo wczytać od użytkownika znaną liczbę wartości.

    //Stwórz 10 elementową tablicę liczb całkowitych, uzupełnij ją wartościami od 1 do 10, a następnie wyświetl.

    public static void main(String[] args) {
        int[] numbers = new int[10];
        // uzupełniamy tablicę
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }

        //W naszej pętli for do kolejnych elementów tablicy przypisujemy wartość licznika powiększoną o 1 (ponieważ przyjmuje on
// wartości od 0 do 9, a my chcieliśmy w tablicy wartości od 1 do 10).

        //wyświetl tablicę
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Liczba: " + numbers[i]);
        }

        //int i = 0 - wyrazenie początkowe, zmienna dostępna tylko w ciele pętli
        //i < numbers.length - warunek stopu który musi zwracać tue, false
//        licznik jest mniejszy od rozmiaru tablicy, tablice są indeksowane od 0 dlatego zmienna i też jest = 0
//        kiedy warunek i<numbers.length zwróci false to pętla przerwie swoje działanie
//        i++ - wyrażenie które modyfikuje licznik, W naszym przypadku po każdorazowym przypisaniu kolejnej liczby do
//            tablicy, licznik zostaje zwiększony o 1 aż do momentu, kiedy i=10 i kiedy warunek zwróci false.
    }
}
