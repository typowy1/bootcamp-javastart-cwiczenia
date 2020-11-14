package cwiczenia.lekcja12.cwiczenie3pantadeusz;

public class LetterStats { // reprezentuje pary znak i liczbe wystapien
    private char character;// znak
    private int occurences;// liczba wystąpien

    public LetterStats(char character, int occurences) {
        this.character = character;
        this.occurences = occurences;
    }

    public char getCharacter() {
        return character;
    }

    public void setCharacter(char character) {
        this.character = character;
    }

    public int getOccurences() {
        return occurences;
    }

    public void setOccurences(int occurences) {
        this.occurences = occurences;
    }
}
