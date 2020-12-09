package prework2.prework.klasyabstrakcyjne_i_interfejsy.LiveCoding.klasyabstrakcyjne.Company;

public class Contract implements Document {

    private int id;
    private String content;
    private int conclusionYear;

    public Contract(int id, String content, int conclusionYear) {
        this.id = id;
        this.content = content;
        this.conclusionYear = conclusionYear;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getConclusionYear() {
        return conclusionYear;
    }

    public void setConclusionYear(int conclusionYear) {
        this.conclusionYear = conclusionYear;
    }

    @Override
    public void print1() {
        System.out.println("Drukowanie umowy o id " + id);
    }

    @Override
    public void destroy() {
        System.out.println("Dokument można zniszczyc");
    }
}
