package cwiczenia.lekcja12.cwiczenie3pantadeusz;

import java.io.FileNotFoundException;

public class Test {
    public static void main(String[] args) {

        try {
            String sourceText = FileImport.readAllFile("PanTadeusz.txt"); // wczytujemy zawartosć tekstu
            System.out.println(sourceText);
            TextAnalyzer textAnalyzer = new TextAnalyzer(sourceText);

            System.out.println(textAnalyzer.getSourceText());
            LetterStats[] letterStats = textAnalyzer.getLetterStats();

            System.out.println("STATYSTYKI LITER");
            StatsPrinter.letterStatsPrint(letterStats);
            WordStats[] wordStats = textAnalyzer.getWordStats();

            System.out.println("STATYSTYKI WYRAZÓW");
            StatsPrinter.wordStatsPrint(wordStats);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
