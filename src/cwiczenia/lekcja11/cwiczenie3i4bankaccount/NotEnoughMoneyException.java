package cwiczenia.lekcja11.cwiczenie3i4bankaccount;

public class NotEnoughMoneyException extends RuntimeException {
    public NotEnoughMoneyException() {
        super("Nie masz tylu środków");
    }
}
