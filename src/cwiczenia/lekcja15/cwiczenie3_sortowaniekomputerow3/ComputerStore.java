package cwiczenia.lekcja15.cwiczenie3_sortowaniekomputerow3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class ComputerStore {

    private static final String SORT_CPU = "cpu";
    private static final String SORT_MEMORY = "ram";
    private static final String SORT_NAME = "name";

    public static void main(String[] args) {
        Computer[] computers = createComputers();
        Comparator<Computer> comparator = getComputerComparator();
        sortAndPrint(computers, comparator);
    }

    private static void sortAndPrint(Computer[] computers, Comparator<Computer> comparator) {
        Arrays.sort(computers, comparator);
        for (Computer computer : computers) {
            System.out.println(computer);
        }
    }

    private static Comparator<Computer> getComputerComparator() {
        System.out.println("Podaj po czym chcesz sortować:");
        System.out.printf("%s, %s, %s?\n", SORT_CPU, SORT_MEMORY, SORT_NAME);
        Scanner scanner = new Scanner(System.in);
        String sortOrder = scanner.nextLine();
        Comparator<Computer> comparator = null;

        switch (sortOrder) {
            case SORT_CPU:
                comparator = new CpuComparator();
                break;
            case SORT_MEMORY:
                comparator = new MemoryComparator();
                break;
            case SORT_NAME:
                comparator = new NameComparator();
                break;
            default:
                System.out.println("Błędne kryterium sortowania");
                System.exit(0);
        }
        return comparator;
    }

    private static Computer[] createComputers() {
        return new Computer[]{
                new Computer("hp 123", 4000, 8192),
                new Computer("apple imac27", 3600, 4096),
                new Computer("dell 234", 3600, 8192),
                new Computer(null, 3600, 8192),
                null,
                new Computer("apple imac27", 3200, 16384),
                null
        };
    }
}
