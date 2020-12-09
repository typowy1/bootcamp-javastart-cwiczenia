package prework2.prework.dziedziczenie.shop;

public class Shop {

    public static void main(String[] args) {
        Tire tire = new Tire("ABCDE1234", "Michelin", "Tatatataat",
                210, 55, 17, false);

        //wcześnijsza wersja
//        tire.setId("ABCDE1234");
//        tire.setManufacturer("Michelin");
//        tire.setDescription("Tatatataat");
//        tire.setWidth(210);
//        tire.setProfile(55);
//        tire.setRimSize(17);

        System.out.println(tire.getInfo());

    }

}
