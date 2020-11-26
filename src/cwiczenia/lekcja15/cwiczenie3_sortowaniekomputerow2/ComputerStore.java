package cwiczenia.lekcja15.cwiczenie3_sortowaniekomputerow2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class ComputerStore {
    private static final String SORT_CPU = "cpu"; //stałe do wyboru opcji przez użytkownika
    private static final String SORT_MEMORY = "ram";
    private static final String SORT_NAME = "name";

    public static void main(String[] args) {
        Computer[] computers = createComputers();// tworzymy tablicę
        Comparator<Computer> comparator = getComputerComparator();// pobieramy opcje sortowania od użytkownika
        sortAndPrint(computers, comparator);// sortujemy według wybranej opcji
    }

    //sortowanie i wyświetlanie
    private static void sortAndPrint(Computer[] computers, Comparator<Computer> comparator) { // sortowanie z użyciem comparatora, użytkownik wybiera które sortowanie użyć
        Arrays.sort(computers, comparator);
        for (Computer computer : computers) {
            System.out.println(computer);
        }
    }

    private static Comparator<Computer> getComputerComparator() { // użytkownik wybiera opcje sortowania
        System.out.println("Podaj po czym chcesz sortować:");
        System.out.printf("%s, %s, %s?\n", SORT_CPU, SORT_MEMORY, SORT_NAME);
        Scanner scanner = new Scanner(System.in);
        String sortOrder = scanner.nextLine();
        Comparator<Computer> comparator = null; //tworze comparator null, żeby później moć przypisać do niego dany utworzony przezemnie

        switch (sortOrder) { //wybór użytkownika porównujemy do stałych
            case SORT_CPU:
                comparator = new CpuComparator();// na podstawie kryterium wybranego przez użytkownika twożymy odpowiedni comparator sortowania w tym wypadku cpu
                break;
            case SORT_MEMORY:
                comparator = new MemoryComparator();
                break;
            case SORT_NAME:// sortowanie z interfejsu comparable, czyli naturalny pożądek ustalony w Computer
                break; //tu będzie null, jeśli jest null to będzie brana pod uwage naturalna kolejność //tu nic nie robimy
            default:
                System.out.println("Błędne kryterium sortowania");
                System.exit(0);// 0 prowadzi do zatrzymania programu
        }
        return comparator;// zwracamy wartosć comparatora
    }

    // tworzymy tablice
    private static Computer[] createComputers() {
        return new Computer[]{
                new Computer("hp 123", 4000, 8192),
                new Computer("apple imac27", 3600, 4096),
                new Computer("dell 234", 3600, 8192),
                new Computer("apple imac27", 3600, 8192),
                new Computer("apple imac27", 3200, 16384)
        };
    }
}
