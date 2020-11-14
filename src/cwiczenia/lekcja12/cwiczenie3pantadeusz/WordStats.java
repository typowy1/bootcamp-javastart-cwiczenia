package cwiczenia.lekcja12.cwiczenie3pantadeusz;

public class WordStats {
    private int letterCount;
    private int occurences;

    public WordStats(int letterCount, int occurences) {
        this.letterCount = letterCount;
        this.occurences = occurences;
    }

    public int getLetterCount() {
        return letterCount;
    }

    public void setLetterCount(int letterCount) {
        this.letterCount = letterCount;
    }

    public int getOccurences() {
        return occurences;
    }

    public void setOccurences(int occurences) {
        this.occurences = occurences;
    }

    void incrementOccurences() {
        occurences++;
    }

    @Override
    public String toString() {
        return letterCount + " - " + occurences;
    }
}
