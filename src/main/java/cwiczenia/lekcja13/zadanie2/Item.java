package cwiczenia.lekcja13.zadanie2;

import java.math.BigDecimal;
import java.math.MathContext;

public class Item {
    private String name;
    private BigDecimal nettoPrice;
    private BigDecimal vat;

    public Item(String name, BigDecimal nettoPrice, BigDecimal vat) {
        this.name = name;
        this.nettoPrice = nettoPrice;
        this.vat = vat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getNettoPrice() {
        return nettoPrice;
    }

    public void setNettoPrice(BigDecimal nettoPrice) {
        this.nettoPrice = nettoPrice;
    }

    public BigDecimal getVat() {
        return vat;
    }

    public void setVat(BigDecimal vat) {
        this.vat = vat;
    }

    // podatek za dany towar
    BigDecimal getTax() {
        return nettoPrice.multiply(vat.divide(new BigDecimal(100), MathContext.DECIMAL64)); //
        // cene mnozymy przez vat podzielony na 100 prica * vat /100, MathContext.DECIMAL32 - maksymalnie kilkanascie
        // miejsc po przecinku, można tez utworzyc nowy obiekt MathContext i wskazac ilosc miejsc po przecinku
    }

    // cena powiekszona o podatek
    BigDecimal getBruttoPrice() {
        return nettoPrice.add(getTax());
    }
}
