package prework.struktury_sterujace_if_switch.struktura_switch;

public class SizeConverter {
    //Switch jest przydatny też do stworzenia metody która pozwala nam zamienić jakieś wartosci
    // zamienianie literna np S na mały, M na normalny XL na duzy itd

    //Switch z zwracaniem wartości
    String convert(String size) {
        switch (size) {
            case "S":
                return "mały";// przy return brake nie jest nam potrzebny poniewaz return wychodzi z metody
            case "M":
                return "średni";
            case "L":
                return "duży";
            default:
                return "nieznany";
        }
    }

//    drugi sposób

    String convert2(String size) { //dużo osób preferuje taki zapis
        String result = null;
        switch (size) {
            case "S":
                result = "mały";
                break;
            case "M":
                result = "średni";
                break;
            case "L":
                result = "duży";
                break;
            default:
                result = "nieznany";
        }
        return result;
    }

}
