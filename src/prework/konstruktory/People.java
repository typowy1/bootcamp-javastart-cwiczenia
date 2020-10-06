package prework.konstruktory;

public class People {
    public static void main(String[] args) {
        Address personAddress = new Address("Wrocław", "Legnicka", "86A");
        Person person1 = new Person("Jan", "Kowalski", 25, personAddress);
//        Np. argument 25 zostanie przekazany do parametru a i następne do pola age
        Person person2 = new Person("Anna", "Zawadzka", 0, null);
        //mało praktyczne rozwiązanie - w trakcie tworzenia obiektu nie znamy adresu, wypełniliśmy wartościa domyślną


    }
}
