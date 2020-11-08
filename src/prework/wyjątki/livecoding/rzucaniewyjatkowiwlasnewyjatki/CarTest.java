package prework.wyjątki.livecoding.rzucaniewyjatkowiwlasnewyjatki;

public class CarTest {

    public static void main(String[] args) {

//        try{
//            Car audiA4 = new Car("Audi A4", 50, 251, -40);
//        }catch (IllegalArgumentException ex){
//            ex.printStackTrace();
//        }

        try {
            Car audiA4 = new Car("Audi A4", 40, 230, 50);
            System.out.println(audiA4);// wyswietlamy informacje o obiekcie
            audiA4.refuel(10); // tu mamy wyjątek deklarowany i żeby go obsłużyć trzeba dać try catch, tu wystarczy dodać drugi catch
            System.out.println(audiA4);
            audiA4.increaseSpeed();
            audiA4.increaseSpeed();
            audiA4.increaseSpeed();
//        }catch (IllegalArgumentException ex){
//            System.err.println(ex.getMessage());
//           // ex.printStackTrace();
//        }catch (SpeedExceededException ex){
//            System.err.println(ex.getMessage());

            // możemy też to zapisać tak, często intellij podpowie ze trzeba tak zrobić
//        }catch (IllegalArgumentException | SpeedExceededException ex) {
//            System.err.println(ex.getMessage());
//        } catch (TankCapacityExceededException e) { ale można to zrobić lepiej
////            e.printStackTrace(); // stuck trace jest dobre do debugowania
//            System.err.println(e.getMessage());

        } catch (IllegalArgumentException | SpeedExceededException | TankCapacityExceededException ex) {
            System.err.println(ex.getMessage());
        }
        // nie kozystamy z wyjątków kontrolowanych, tylko z niekontrolowanych czyli RunTimeE i kożystaj z wyjątków zdefinowanych
        // lepiej pozostawić aplikacji zeby przestała działać niż pozostawiać pusty blok catch
    }
}
