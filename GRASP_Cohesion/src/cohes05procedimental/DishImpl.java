package cohes05procedimental;

import java.util.LinkedList;
import java.util.List;

public class DishImpl implements Dish {

    private final String name;
    private boolean mixed = false;
    private boolean cooked = false;
    private final List<Ingredient> ingredientList = new LinkedList<Ingredient>();

    public DishImpl(String name) {
        this.name = name;
    }

  
	public void addIngredient(Ingredient ingredient) {

        System.out.printf("%s - Adding ingredient %s%n",
                                name, ingredient.getName());
        ingredientList.add(ingredient);
    }

    public void mix() {
        if(ingredientList.isEmpty())
            throw new IllegalStateException("There are no ingredients to mix");

        System.out.printf("%s - Mixing ingredients: %s%n",
                                name, ingredientList.toString());

        mixed = true;
    }

    public void cook() {
        if(!mixed)
            throw new IllegalStateException("Ingredients are not mixed");

        System.out.printf("%s - Cooking...%n", name);

        cooked = true;
    }

    public void serve() {
        if(!cooked)
            throw new IllegalStateException("Dish is not cooked");

        System.out.printf("%s - Serving...%n", name);

    }
}
