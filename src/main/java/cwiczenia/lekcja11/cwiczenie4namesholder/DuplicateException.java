package cwiczenia.lekcja11.cwiczenie4namesholder;

public class DuplicateException extends Exception { // klasa wyjątku nie kontrolowanego


    public DuplicateException() {
        super("Wartość zduplikowana");
    }
}
