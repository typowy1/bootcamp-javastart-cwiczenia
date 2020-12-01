package cwiczenia.lekcja12.cwiczenie3pantadeusz;

public class TextAnalyzer {
    // obróbka tekstu


    private static final char[] ALPHABET = { //Polski alfabet ma 32 znaki// stała
            'a', 'ą', 'b', 'c', 'ć', 'd',
            'e', 'ę', 'f', 'g', 'h', 'i',
            'j', 'k', 'l', 'ł', 'm', 'n',
            'ń', 'o', 'ó', 'p', 'r', 's',
            'ś', 't', 'u', 'w', 'y', 'z',
            'ź', 'ż'
    };

    private String sourceText; //tekst analizowany jako pole klasy

    public TextAnalyzer(String sourceText) {
        this.sourceText = cleanText(sourceText.toLowerCase()); // zamieniamy wszystko na małe litery i czyścimy z znaków i zapamiętujemy w polu sourceText
    }

    public static char[] getALPHABET() {
        return ALPHABET;
    }

    // statystyki występowania liter, ile razy pojawiła się w tekście, będzie zwracać informacje o literze i liczbie wystąpień tej litery
    // będzie zwracać tablice

    LetterStats[] getLetterStats() {

        //tablica z statystykami tworzymy
        LetterStats[] stats = new LetterStats[ALPHABET.length]; //długość tablicy będzie takasama jak wielkość alfabetu
        //pętla która przejdzie przez nasz cały alfabet
        for (int i = 0; i < ALPHABET.length; i++) {
            // bierzemy pierwszą litere z alfabetu piliczyc ile wystepuje i zapisac do tablicy z statystykami
            int occurences = countOccurences(ALPHABET[i]);
            stats[i] = new LetterStats(ALPHABET[i], occurences);
        }
        return stats;
    }

    //zwraca statystyki wyrazów, będzie zwracała tablice wordstats

    public WordStats[] getWordStats() {

        String[] words = sourceText.split(" ");//rozdzielamy text na podstawie spacji, w wyniku dosatajemt tablice z wyrazami
        int longestWord = getLongestWord(words);
        WordStats[] wordStats = new WordStats[longestWord];

        for (String word : words) {
            int wordLength = word.length();//liczymy ile znaków ma słow
            if (wordStats[wordLength - 1] == null) {
                wordStats[wordLength - 1] = new WordStats(wordLength, 1);
            } else {

                wordStats[wordLength - 1].incrementOccurences();
            }
        }
        return wordStats;
    }


    private int getLongestWord(String[] words) { // zwraca długość najdłuższego wyrazu

        int longest = 0; // najdłuższy napis
        String longestWord = null;//najdłuższy wyraz
        for (String word : words) {
            if (longest < word.length()) {// jeżeli longest jest mniejsze od długości wyrazu to przypisujemy ja do longest
                longest = word.length();
                longestWord = word;
            }
        }
        System.out.println("Najdłuższy wyraz - " + longestWord);
        return longest;
    }

    private int countOccurences(char character) {// ile razy w tekście pojawia się litera

        int counter = 0;
        for (int i = 0; i < sourceText.length(); i++) {
            if (sourceText.charAt(i) == character) {// jeżeli ita litera jest równa character to zliczamy  text.charAt(i) zwraca znak zapisany pod danym indeksem
                counter++;
            }
        }
        return counter;
    }

    //    czyszczenie tekstu z zbędnych znaków jak ,.!itd.
    private String cleanText(String source) { // przekazujemy tekst źródłowy

//        return source.replaceAll("!", "")//1 parametr jaki symbol chcielibyśmy zastąpić i drugi parametr na co chcielibyśmy zastapić pustym stringiem, poniżej usówamy kolejne znaki
//                .replaceAll(",", "")
//                .replaceAll("\\.", "")//"." taki zapis zamieni nam wszystkie znaki na puste znaki, żeby usunąć koropkę trzeba to zapisać tak \\.
//                .replaceAll("\\(", "") // przy nawiasach też taki zapis \\(
//                .replaceAll("\\)", "")
//                .replaceAll(";", "")
//                .replaceAll(":", "")
//                .replaceAll("\\?", "") // przy znaku zapytania też taki zapis \\(
//                .replaceAll("\"", "") // przy cudzysłowiu taki zapis \"
//                .replaceAll("-", "")
//                .replaceAll("    ", " ") // 4 spacje na jedną, trim usunie
//                .trim(); // usunięcie białych znaków z początku i końca tekstu

//        krótszy zapis, wyrażenia regularne isalhpabetic i is digit = usun wszysko po za literami z alfabetu i zyframi
        return source.replaceAll("[^\\p{IsAlphabetic}^\\p{IsDigit}\\s]", "")//\\s dodanie spacji(bo nam usuneło wszystkie i teraz wróćiliśmy do pierowtnego zapisu z 4 spacjami), jezali jakiś znak nie jest w alfabecie, nawet polskim \\p{IsAlphabetic} i nie jest cyfrą \\p{IsDigit} to zamieniamy go na pusty napis, filtrujemy wszystkie znaki które ^ - nie są z przedziałów
                .replaceAll("\\s+", " ") // usówa więcej niż jedna spacje(np 2, 3,4 itd) i zamienia na jedną, trim usunie
                .trim(); // usunięcie białych znaków z początku i końca tekstu
    }

    public String getSourceText() {
        return sourceText;
    }

    public void setSourceText(String sourceText) {
        this.sourceText = sourceText;
    }
}
