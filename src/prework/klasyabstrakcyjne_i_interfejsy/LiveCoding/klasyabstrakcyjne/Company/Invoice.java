package prework.klasyabstrakcyjne_i_interfejsy.LiveCoding.klasyabstrakcyjne.Company;

public class Invoice implements Payable, Document {

    public static final int ARCHIVE_TIME = 5;
    private String item;
    private int quantity;
    private double pricePerItem;
    private int saleYear;

    public Invoice(String item, int quantity, double pricePerItem, int saleYear) {
        this.item = item;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
        this.saleYear = saleYear;
    }

    public static int getArchiveTime() {
        return ARCHIVE_TIME;
    }

    public int getSaleYear() {
        return saleYear;
    }

    public void setSaleYear(int saleYear) {
        this.saleYear = saleYear;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public void setPricePerItem(double pricePerItem) {
        this.pricePerItem = pricePerItem;
    }

    @Override
    public double getPaymentAmount() {
        return quantity * pricePerItem;
    }

    @Override
    public void print1() {
        System.out.println("Drukowanie faktury: " + item);
    }

    @Override
    public void destroy() {
        if (saleYear + ARCHIVE_TIME < Document.CURRENT_YEAR) {
            System.out.println("Dokument można zniszczyć");
        } else {
            System.out.println("Domkumentu nie można zniszczyc");
        }

    }

}
