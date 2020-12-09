package prework2.prework.ObjectClass.tostring;

public class School {
    public static void main(String[] args) {
        Student student1 = new Student("Jan Kowalski", 22);
        System.out.println("Lista studentów: ");
        student1.printInfo();
        String st1 = student1.toString();
        System.out.println(st1);
        System.out.println(student1);

//        Jeżeli jako argument metody print() lub println() przekażesz obiekt typu innego niż String, to na obiekcie
//        tym zostanie wywołana metoda toString() i jej wynik zostanie wyświetlony w konsoli.
    }
}
