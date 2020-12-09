package prework2.prework.dziedziczenie.shop;

public class Tire extends Part {

    private int width;
    private int profile;
    private int rimSize;
    private boolean season; // fals opona zimowa, true letnia
    // żeby dziedziczyć musi być założenie cot jest zwirzęciem, audi jest samochodem, wycieraczka jest czescią samochodu itd.

    // construktor wywaoła się tylko dla pól z tej klasy nie d asię dziedziczyć construktorów więc setery pól z klasy po
    // której dziedziczymy trzeba dopisać.
//    update - super załatwia sprawe construktora
    public Tire(String id, String manufacturer, String description, int width, int profile, int rimSize, boolean season) {
        super(id, manufacturer, description);//wywołanie konstruktora z klasy nadrzędnej czyli Part, bez tego wszystko
        // będzie na czerwono super musi być 1 instrukcją konstruktora
        this.width = width;
        this.profile = profile;
        this.rimSize = rimSize;
        this.season = season;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getProfile() {
        return profile;
    }

    public void setProfile(int profile) {
        this.profile = profile;
    }

    public int getRimSize() {
        return rimSize;
    }

    public void setRimSize(int rimSize) {
        this.rimSize = rimSize;
    }

    public boolean isSeason() {
        return season;
    }

    public void setSeason(boolean season) {
        this.season = season;
    }

    @Override
    String getInfo() {
        return super.getInfo() // super, wywoła ciało metody get info z klasy nadrzędnej można ją modyfiokwać
                + ", " + width + ", " + profile + ", " + rimSize + ", " + season;
    }


    //    @Override
//    String getInfo(){
//        return getId() + ", " + getManufacturer() + ", " + getDescription() + // te pole odziedziczyyliśmy po klasie Part
//               ", " + getWidth() + ", " + getProfile() + ", " + getRimSize() + ", " + isSeason();
//    }

}
