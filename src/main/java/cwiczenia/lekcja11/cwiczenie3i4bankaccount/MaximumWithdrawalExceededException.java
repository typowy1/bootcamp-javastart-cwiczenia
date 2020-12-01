package cwiczenia.lekcja11.cwiczenie3i4bankaccount;

public class MaximumWithdrawalExceededException extends RuntimeException {

    public MaximumWithdrawalExceededException() {
        super("Przekroczono maksymalną kwotę wypłaty.");
    }
}
