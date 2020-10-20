package prework.tablice.employee.Drink;

public class DrinkTest {
    public static void main(String[] args) {
        Drink drink1 = new Drink("Mojito", 3); // tu tablica składników Ingredients będzie się składała
        // z 3 obiektów 3 to jest wielkość tablicy, rozmiar tablicy to 3

//        drink.getIngredients()[0] = new Ingredient("Wódka", 30);
//        drink.getIngredients()[0] = new Ingredient("Sok cytrynowy", 20);
//        drink.getIngredients()[0] = new Ingredient("Woda", 30);
//        można czytelniej
        Ingredient[] ings = drink1.getIngredients();
        ings[0] = new Ingredient("Wódka", 30);
        ings[1] = new Ingredient("Sok cytrynowy", 20);
        ings[2] = new Ingredient("Woda", 30);

//        szysza metoda, dodanie przez metode składników do drinka

        drink1.addIngredient(0, "Wodka", 30);
        drink1.addIngredient(1, "Sok cytrynowy", 20);
        drink1.addIngredient(2, "Woda", 100);
        drink1.showInfo();
    }
}
