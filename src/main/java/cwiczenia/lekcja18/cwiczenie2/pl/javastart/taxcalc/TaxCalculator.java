package cwiczenia.lekcja18.cwiczenie2.pl.javastart.taxcalc;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class TaxCalculator {

    // metoda do obliczania podatku
    public int calculateTax(BigDecimal income) { // dochód

        BigDecimal limit = new BigDecimal("85528");

        BigDecimal beforeRounding;
        if (income.compareTo(limit) > 0) { //jeżeli income jest większe od 85528, tak się porównuje big decimal x.compareto(y) > 0 znaczy ze x jest wieksze od y wieksze

            BigDecimal over = income.subtract(limit);// uzyskujemy nadwyżkę
            BigDecimal taxBase = over.multiply(new BigDecimal("0.32")); // mnożymy nadwyżkę razy 32%

            beforeRounding = taxBase.add(new BigDecimal("14839.02")); // do taxBase dodajemy nadwyżkę
        } else {

            BigDecimal taxBase = income.multiply(new BigDecimal("0.18"));//mnożymy income razy podatek
            beforeRounding = taxBase.subtract(new BigDecimal("556.02"));//odejmujemy kwote 556.02, kwota wolna od podatku czy cos
        }
        BigDecimal rounded = beforeRounding.setScale(0, RoundingMode.HALF_UP);//zaokrąglamy do pełnych miejsc po przecinku, od zera w górę
        int result = rounded.intValue();

        // zabespieczamy się przed tym jak dochód bedzie 0
//        if(result < 0){ // mniejszy dlatego bo odejmuje jeszcze 556, a 0 i 556 daje -556
//            return 0;
//        }
        return Math.max(result, 0); // zabespieczamy się przed tym jak dochód bedzie 0, wybierz co jest większe albo 0 albo wynik, intellij zaproponował ta zmianę
    }
}
