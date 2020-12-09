package prework2.prework.dziedziczenie.animal;

public class Bird extends Animal {

    @Override // zabezpiecza przed literówkami, błędami rożniącymi ta metodę od metody z klasy po której dziedziczymy
    public void makeSound() {
        System.out.println("ćwir ćwir");
    }
}
