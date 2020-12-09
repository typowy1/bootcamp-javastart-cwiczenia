package prework2.prework.struktury_sterujace_if_switch.struktura_switch;

public class Test {
    public static void main(String[] args) {

        //Switch jest przydatny też do stworzenia metody która pozwala nam zamienić jakieś wartosci
        String size = "S";

        SizeConverter sizeConverter = new SizeConverter();
        String resultSize = sizeConverter.convert2(size);
        System.out.println("Rozmiar " + resultSize);

//        if(size.equals("S")){ // obiektow typu String nie powinniśmy zapisywać jako == a porównywać za pomocą metody .equals
//            System.out.println("Rozmiar mały");
//        }else if(size.equals("M")){
//            System.out.println("Rozmiar średni");
//        }else if(size.equals("XL")){
//            System.out.println("Rozmiar duży");
//        }

        // zamiast if jeżeli porównujemy wiele wartosci typu String lub wiele wartosci typu int to lepiej użyć switch
        //switch nie jest często stosowany

//        switch (size){
//            case "S":
//                System.out.println("Rozmiar mały");
//                break;
//            case "M":
//                System.out.println("Rozmiar średni");
//                break;
//            case "XL":
//                System.out.println("Rozmiar duży");
//                break;
//            default:
//                System.out.println("Podałeś zły rozmiar");
//        }
    }
}
