package prework.operatoryarytmetycznnologiczne;

public class OperacjeMatematyczneILogiczne {

    public static void main(String[] args) {

        // operatory matematyczne
        int a = 5;
        int b = 10;
        System.out.println(a + b);
        System.out.println(10 - 8);
        System.out.println(10/3); //= 3 bo 3*3 + 1 czyli resta 1, dzielenie całkowitoliczbowe ucina częsci dziesiętne
        System.out.println(10.0/3); // teraz wynik da 3.3333...

        System.out.println(2 + 2 * 2); // pierw mnożenie wykona się
        System.out.println((2 + 2) * 2); // pierw dodawanie wykona się

        //postinkrementacja
        int c = a++; // wartość zostanie przypisana do ci i dopiro później zwiększona o 1
        System.out.println("post " + c); // wyświetli 5
        //preinkrementacja
        int d = ++b; // tu b zostanie pierw zwiększona i przypisana so d
        System.out.println("pre " + b);// wyświetli 11

        //Dekrementacja działa tak samo
//        a--
//          --aa

        int sum = a + b;
        sum = sum + 10; // lub sum += 10;
        System.out.println(sum);

//        można to skrócić
        sum += 10;
//        -=
//        *=
//        /=

        // operatory logiczna

        boolean aBiggerThanB = a > b;
        System.out.println(a > b);

    }

}
