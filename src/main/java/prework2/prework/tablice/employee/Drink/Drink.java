package prework2.prework.tablice.employee.Drink;

public class Drink {
    private String name;
    // możemy zdefiniować pola składników bez zapisu 1 pod rugim czyli
//    private Ingredient ingredient1;
//    private Ingredient ingredient2;
//    private Ingredient ingredient3;
//    tworzymy pole które będzie tablicą składników w którym może byc dowolna liczba składników
//    w zaleności od okreslenia rozmiaru tablicy
    private Ingredient[] ingredients;

    public Drink(String name, int ingredientsNumber) {
        this.name = name;
        ingredients = new Ingredient[ingredientsNumber];
    }
    // czyli tworzymy konstruktor który zawiera name i ilość składników która jest w tablicy i którą podajemy przez
    // argument konstruktora


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Ingredient[] getIngredients() {
        return ingredients;
    }

    public void setIngredients(Ingredient[] ingredients) {
        this.ingredients = ingredients;
    }

    // dodawanie składników w metodzie
    public void addIngredient(int igredientNumber, String name, double volume) {
        ingredients[igredientNumber] = new Ingredient(name, volume);
    }

    public void showInfo() {
        System.out.println(ingredients[0].getName());
        System.out.println(ingredients[1].getName());
        System.out.println(ingredients[2].getName());
    }
}
