package cwiczenia.lekcja12.cwiczenie3pantadeusz;

public class StatsPrinter {

    private static final int MAX_STARS = 50;

    static void letterStatsPrint(LetterStats[] letterStats) { // przekazujemy tablice z statystykami, metoda wyświetla statystyki
        int max = maxOccurences(letterStats);
        //jaki znak powtarzał się najczęściej
        for (LetterStats letterStat : letterStats) {
            printSingleStat(letterStat, max);

        }
    }

    //    33 minuta filmu
    private static void printSingleStat(LetterStats stats, int normalizeFactor) { // wyświetlanie pojedynczej ststystyki znak, liczba wystapien, gwiazdki
        System.out.print(stats.getCharacter() + " - " + stats.getOccurences() + " - ");
        double div = (double) stats.getOccurences() / normalizeFactor;
        int stars = (int) (div * MAX_STARS);
        // rysowanie gwiazdek
        for (int i = 0; i < stars; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    // liczba powtórzeń najpopularniejszej litery
    private static int maxOccurences(LetterStats[] letterStats) {
        int max = letterStats[0].getOccurences(); //taka wartosć jaka jest w elemencie tej tablicy
        for (LetterStats letterStat : letterStats) {
            int nextOccurences = letterStat.getOccurences();
            if (max < nextOccurences) {
                max = nextOccurences;
            }
        }
        return max;
    }

    static void wordStatsPrint(WordStats[] wordStats) {
        for (WordStats wordStat : wordStats) {
            System.out.println(wordStat); // wyświetlamy word stat
        }

    }
}
