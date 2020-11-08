package prework.ObjectClass.tostring;

public class Student {

    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void printInfo() {
        System.out.println(name + " " + age);
    }

    @Override
    public String toString() {
        return name + ", " + age;
    }

    //        Jeżeli jako argument metody print() lub println() przekażesz obiekt typu innego niż String, to na obiekcie
//        tym zostanie wywołana metoda toString() i jej wynik zostanie wyświetlony w konsoli.
}
